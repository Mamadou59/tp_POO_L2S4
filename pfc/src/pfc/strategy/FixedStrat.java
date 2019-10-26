package pfc.strategy;

import pfc.*;

/**
* This class that implements strategy represents a strategy of the player 
* who is to choose the same shape during the game.
* To the contruction it takes in parameter a chosen shape.
*/
public class FixedStrat implements Strategy{

	private Shape shape;

	/** Create fixed strategy by given a strategy
	 * @param shape a fixed strategy
	 */
	public FixedStrat(Shape shape){
		this.shape = shape;
	}

	/**
	* @return the chosen shape
	*/
	public Shape chooceShape(){
		return this.shape;
	}


}