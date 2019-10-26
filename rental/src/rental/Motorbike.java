package rental;

/* This class Motorbike extends Vehicle */
public class Motorbike extends Vehicle{

	private int cylindre;

	/*
	* @param brand the Motorcycle brand
	* @param model the Motorcycle model
	* @param productionYear the Motorcycle year of production
	* @param dailyRentalPRice the daily rental price
	* @param  cylindre the MotorBike cylinder
	*/
	public Motorbike(String brand, String model, int productionYear, float dailyRentalPRice,int cylindre){
		super(brand,model,productionYear, dailyRentalPRice);
		this.cylindre = cylindre;
	}

	/**
	* @return the motorbike cylindre.
	*/
	public int getCylindre(){
		return this.cylindre;
	}

	/**
	* @return the motorbike display
	*/
	public String toString(){
		return super.toString() + " " + this.getCylindre();
	}
}