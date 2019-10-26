package pfc;

import pfc.strategy.*;

/**
* This class represents a player who at his creation gives his name and his strategy
*/
public class Player{

	private int score;
	private String name;
	private Strategy myStrategy;

	/** create a Player with given name and his strategy
	 * @param name the player's name
	 * @param myStrategy the player's strategy
	 */
	public Player(String name, Strategy myStrategy){
		this.name = name;
		this.myStrategy = myStrategy;
		this.score = 0;
	}

	/**
	* @return the Player name
	*/
	public String getName(){
		return this.name;
	}
	/**
	* @return the player score
	*/
	public int getScore(){
		return this.score;
	}
	/**
	* Add the player points
	* @param points the points to add.
	*/
	public void addPoints(int points){
		this.score += points;
	}
	/**
	* @return the shape that the player played
	*/
	public Shape play(){
		return this.myStrategy.chooceShape();
	}
	/**
	* @return the display of this player
	*/
	public String toString(){
		return this.getName();
	}
}