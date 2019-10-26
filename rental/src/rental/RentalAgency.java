package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency {
    // vehicles of this agency
    private List<Vehicle> theVehicles;

    // maps client and rented vehicle (at most one vehicle by client) 
    private Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
    	this.theVehicles = new ArrayList<Vehicle>();
        this.rentedVehicles = new HashMap<Client,Vehicle>();
    }
    
    /** adds a vehicle to this agency 
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
    	this.theVehicles.add(v); 
    }

    /** provides the list of the vehicles that is accepted by filter  
    * @param filter the selection filter
    * @return  the list of the vehicles accepted by filter
    */
    public List<Vehicle> select(VehicleFilter filter) {	
        List<Vehicle> theVehiclesAccepted = new ArrayList<Vehicle>();
    	for (Vehicle v : this.theVehicles){
            if (filter.accept(v)) theVehiclesAccepted.add(v);
        }	
        return theVehiclesAccepted;
    }
    
    /** displays the vehicles accepted by the filter 
    * @param filter the selection filter
    */
    public void displaySelection(VehicleFilter filter) {
    	List<Vehicle> theVehiclesAccepted = this.select(filter);
        for(Vehicle v : theVehiclesAccepted){
            System.out.println("         "+v);
        }
    }


    /** returns <em>true</em> if client c is renting a vehicle
     * @param client the client for which we want to know it has rented a vehicle
    * @return <em>true</em> iff client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
    	if (this.rentedVehicles.containsKey(client)) return true;
        return false;
    }
    
    /** returns <em>true</em> if vehicle v is rented
     * @param v the vehicle we want to check if it is rented
    * @return <em>true</em> iff vehicle v is rented    
    */
    public boolean isRented(Vehicle v){
    	if (this.rentedVehicles.containsValue(v)) return true;
        return false;
    }

   /** client rents a vehicle 
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
    	if (this.hasRentedAVehicle(client)){
            //Vehicule ve = this.rentedVehicles.get(client);
            throw new IllegalStateException("You already rent this vehicle: '"+this.rentedVehicles.get(client)+"' !");
        } 
    	else if (this.isRented(v)) throw new IllegalStateException("this vehicle '"+v+"' you are trying to rent is already rented!");
        else if (! this.theVehicles.contains(v)) throw new UnknownVehicleException("Sorry "+client.getName()+" this vehicle ",v);
        this.rentedVehicles.put(client,v);
        return v.getDailyPrice();
    }

    
    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle. 
    * @param client client who returns a vehicle
    */
    public void returnVehicle(Client client){
    	 this.rentedVehicles.remove(client);
    }
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles 
    */
    public Collection<Vehicle> allRentedVehicles(){
        return this.rentedVehicles.values();
    }

}
