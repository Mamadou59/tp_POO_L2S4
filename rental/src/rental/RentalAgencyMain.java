package rental;

public class RentalAgencyMain{

	/**
	* 
	* @param client the renter
    * @param v the rented vehicle
    * @param the rental agency 
	*/
	private static void resultRent(Client client, Vehicle v, RentalAgency agency){
		try{
			float res = agency.rentVehicle(client,v);
			System.out.println("--A customer who rents a vehicle successfully--");
			System.out.println(" "+client.getName()+" you rent this vehicle: '"+v+"' to "+res+"€!");
			System.out.println();
		}catch(UnknownVehicleException e){
			System.out.println(" "+e.getMessage()+" '"+e.getVehicle()+"' you are traying to rent is not in the agency!");
			System.out.println();
		}catch(IllegalStateException e){
			String msg = e.getMessage();
			System.out.println(" "+client.getName()+" "+msg);
			System.out.println();
			//System.out.println("Ce message precedent indique que deux client de même nom designe la même personne");
		}
	}

	public static void main(String[] args){
		RentalAgency agency = new RentalAgency();
		AndFilter andFilter = new AndFilter();
		VehicleFilter brandFilter = new BrandFilter("brand1");
		VehicleFilter yearFilter = new YearFilter(2010);
		VehicleFilter maxPriceFilter = new MaxPriceFilter(260);
		andFilter.addFilter(brandFilter);
		andFilter.addFilter(yearFilter);
		andFilter.addFilter(maxPriceFilter);
		Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
		Vehicle v1 = new Vehicle("brand1","model1",2015,100);
		Vehicle v2 = new Vehicle("brand2","model2",2012,200);
		Vehicle v3 = new Vehicle("brand1","model2",2010,250);
		Vehicle v4 = new Vehicle("brand1","model2",2014,250);
		agency.addVehicle(v);
		agency.addVehicle(v1);
		agency.addVehicle(v2);
		agency.addVehicle(v3);
		//agency.addVehicle(v4);
		System.out.println("--The Vehicles accepted by 'brandFilter'(brand1)--");
		agency.displaySelection(brandFilter);
		System.out.println();
		System.out.println("--The Vehicles accepted by 'maxPriceFilter'(260€)--");
		agency.displaySelection(maxPriceFilter);
		System.out.println();
		System.out.println("--The Vehicles accepted by 'yearFilter'(2010)--");
		agency.displaySelection(yearFilter);
		System.out.println();
		System.out.println("--The Vehicles accepted by 'andFilter'--");
		agency.displaySelection(andFilter);
		System.out.println();
		Client client = new Client("Mamadou",20);
		Client client1 = new Client("Tim Oleon", 25);
		Client client2 = new Client("Tim Oleon", 25);
		Client client3 = new Client("Tim",23);
		resultRent(client,v,agency);
		resultRent(client1,v1,agency);
		System.out.println("--A customer trying to rent two vehicles--");
		resultRent(client2,v2,agency);
		System.out.println("--A customer trying to rent a vehicle that does not exist in the agency--");
		resultRent(client3,v4,agency);
		System.out.println("--A customer trying to rent a rented vehicle--");
		resultRent(client3,v,agency);
		// ArrayList<Vehicle> therentedVehicles = agency.allRentedVehicles();
		System.out.println("--All rented vehicles--");
		for(Vehicle vehicle : agency.allRentedVehicles()){
			System.out.println("  "+vehicle);
		}
		System.out.println();
		System.out.println("**"+client1.getName()+" just returned the vehicle '"+v1+"'!**");
		agency.returnVehicle(client1);
		System.out.println("--All rented vehicles naw--");
		for(Vehicle vehicle : agency.allRentedVehicles()){
			System.out.println("  "+vehicle);
		}

	}
}