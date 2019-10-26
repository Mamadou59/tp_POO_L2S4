package rental;

public class SuspiciousRentalAgency extends RentalAgency{

	protected int addCost;

	public SuspiciousRentalAgency(){
		this.addCost = 10;
	}

	/*
	* Change additional cost of this renatal agency.
	*/
	public void changeAddCost(int addCost){
		this.addCost = addCost;
	}
	/** client rents a vehicle 
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price whith cost if the client age is < 25 year.
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException{
		float price = super.rentVehicle(client, v);
		if (client.getAge() < 25){
			price = price + (price * addCost/100);
		} 
		return price; 
	}

}