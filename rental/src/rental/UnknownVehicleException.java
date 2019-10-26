package rental;

public class UnknownVehicleException extends Exception{

	private Vehicle vehicle;

	/**
	* throw exception with params
	* @param msg the exception message
	* @param v the vehicle to rent that triggeted the exception
	*/
	public UnknownVehicleException(String msg,Vehicle v){
		super(msg);
		this.vehicle = v;
	}

	/**
	* Just throw exception without message and the vehicle that triggeted the exception. 
	*/
	public UnknownVehicleException(){}

	/**
	* @return the vehicle that triggeted the exception.
	*/
	public Vehicle getVehicle(){
		return this.vehicle;
	}
}