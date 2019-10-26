package rental;

/*This class Car extends Vehicle */
public class Car extends Vehicle{
	private int nbSits;

	public Car(String brand, String model, int productionYear, float dailyRentalPRice, int nbSits){
		super(brand,model,productionYear, dailyRentalPRice);
		this.nbSits = nbSits;
	}

	/**
	* @return number of the car's sits
	*/
	public int getNbSits(){
		return this.nbSits;
	}

	/**
	* @return the Car display.
	*/
	public String toString(){
		return super.toString() + " " + this.getNbSits() +" sits";
	}
}