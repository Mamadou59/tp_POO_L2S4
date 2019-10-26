package pfc;

public enum Shape{
	ROCK,PAPER,SCISSORS;

	/**
	* returns 1 or 2 if it is the first shape wins on the second, 
	* -1 or -2 if it is the second who wins on the first and 0 if 
	* none wins on the other
	*/
	public int compareShape(Shape s){
		int dif = this.ordinal() - s.ordinal();
		if (Math.abs(dif) == 2) return -dif; 
		return dif;
	}
}