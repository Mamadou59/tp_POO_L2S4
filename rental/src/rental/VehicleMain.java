package rental;

public class VehicleMain{

	/**
	* @param client the client who whant to rent a vehicle.
	* @param v the vehicle he want to rent.
	* @param agency the rental agency.
	* @return a rental price.
	*/
	private static float resultRent(Client client, Vehicle v, SuspiciousRentalAgency agency){
		float res = 0;

		try{
			res = agency.rentVehicle(client,v);
			//System.out.println("--A customer who rents a vehicle successfully--");
		}catch(UnknownVehicleException e){
			System.out.println(" "+e.getMessage()+" '"+e.getVehicle()+"' you are traying to rent is not in the agency!");
			System.out.println();
		}catch(IllegalStateException e){
			String msg = e.getMessage();
			System.out.println(" "+client.getName()+" "+msg);
			System.out.println();
		}
		return res;
	}

	public static void main(String[] args){
		Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
		Car c = new Car("brand1","model1",2015,100,5);
		Motorbike mbike = new Motorbike("MBike","model2",2012,200,65);
		Vehicle v1 = new Vehicle("brand1","model2",2010,250);
		Vehicle c1 = new Car("brand1","model2",2014,250,4);
		Vehicle mbike1 = new Motorbike("MBike2","model2",2014,250,45);
		RentalAgency agency = new RentalAgency();
		agency.addVehicle(v);
		agency.addVehicle(v1);
		agency.addVehicle(c);
		agency.addVehicle(c1);
		agency.addVehicle(mbike);
		agency.addVehicle(mbike1);
		int maxPrice = 260;//default max price
		if (args.length == 1) maxPrice = Integer.parseInt(args[0]);
		VehicleFilter maxPriceFilter = new MaxPriceFilter(maxPrice);
		System.out.println("++++++++The Vehicles accepted by 'maxPriceFilter' ("+maxPrice+"€)++++++++");
		agency.displaySelection(maxPriceFilter);
		System.out.println();
		System.out.println("++++++++TEST_SuspiciousRentalAgency++++++++++");
		SuspiciousRentalAgency suspAgengy = new SuspiciousRentalAgency();
		suspAgengy.addVehicle(v);
		suspAgengy.addVehicle(c);
		suspAgengy.addVehicle(mbike);
		Client client = new Client("Mamadou",20);
		Client client1 = new Client("Tim Oleon", 26);
		Client client2 = new Client("Tim",23);
		float price = resultRent(client,v,suspAgengy);
		System.out.println("  "+client.getName()+" you have "+client.getAge()+" year old so you rent this Vehicle '"+v+"' with "+suspAgengy.addCost+"% additional cost, the new price is "+price+"€!");
		System.out.println();
		/*resultRent fait louer un vehicule à un client*/
		price = resultRent(client1,c,suspAgengy);
		System.out.println("  "+client1.getName()+" you rent this vehicle: '"+c+"' to "+price+"€!");
		price = resultRent(client2,mbike,suspAgengy);
		System.out.println("  "+client2.getName()+" you have "+client.getAge()+" year old so you rent this Vehicle '"+mbike+"' with "+suspAgengy.addCost+"% additional cost, the new price is "+price+"€!");
		System.out.println();
		System.out.println("-----CHANGE ADDCOST TO 20%------");
		suspAgengy.changeAddCost(20);
		suspAgengy.returnVehicle(client2);
		price = resultRent(client2,mbike,suspAgengy);
		System.out.println("  "+client2.getName()+" you have "+client.getAge()+" year old so you rent this Vehicle '"+mbike+"' with "+suspAgengy.addCost+"% additional cost, the new price is "+price+"€!");
	}
}