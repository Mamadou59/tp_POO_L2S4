package battleship.util;

/** 
* This class creates a pair of coordonates 
* from two integers X and Y
*/
public class Position{
	private int x;
	private int y;

	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	/**
	* Give a coordonate X
	* @return the coordonate X
	*/
	public int getX(){
		return this.x;
	}
	/**
	* Give a coordonate Y
	* @return the coordonate Y
	*/
	public int getY(){
		return this.y;
	}
	/**
	* Test if two positions are identical
	* @param o any object a priori a Position object.
	* @return boolean true if the two object are same and false is not.
	*/
	public boolean equals(Object o){
		if (o == null) return false;
		if (o instanceof Position){
			Position other = (Position) o;
			return (this.getX() == other.getX() && this.getY() == other.getY());
		}
		return false;
	}
	/**
	* @return a string description of this Position.
	*/
	public String toString(){
		return "La cellule à la position X = "+getX()+" Y = "+getY();
	}
}