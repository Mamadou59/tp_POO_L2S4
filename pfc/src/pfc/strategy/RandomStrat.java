package pfc.strategy;

import pfc.*;

/**
* This class that implements strategy represents a strategy of a random choice of shape.
*/
public class RandomStrat implements Strategy{

	/**
	* @return a shape chosen randomly.
	*/
	public static Shape random(){
		int i = (int) (Math.random() * Shape.values().length);
		return Shape.values()[i];
	}
	/**
	* @return a shape chosen randomly.
	*/
	public Shape chooceShape(){
		return random();
	}

}