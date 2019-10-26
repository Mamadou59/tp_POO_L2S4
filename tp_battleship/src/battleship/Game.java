package battleship;

import battleship.*;
import battleship.util.*;
import io.*;
/**
* this class manages a game turn created from a 'Sea' class board
*/
public class Game{
	private Sea plateau;
	public Game(Sea plateau){
		this.plateau = plateau;
	}
	/**
	* @return the Game's board.
	*/
	public Sea getPlateau(){
		return this.plateau;
	}
	/**
	* retrieves and validates the position given in the standard entry
	* @return the valide position
	*/
	public Position getInputs(){
		int coordX;
		int coordY;
		try{
			System.out.print("give a coordonnate X: ");
			coordX = Input.readInt();
			System.out.print("give a coordonnate Y: ");
			coordY = Input.readInt();
			return new Position(coordX,coordY);
		}catch (java.io.IOException e){
			System.out.println("Please give a good coordonnate like two integer 0 <= X < "+this.getPlateau().getWidth()+" and 0 <= Y < "+this.getPlateau().getHeight()+"!");
			return this.getInputs();
		}
		
	}
	/**
	* Shoot on a given position.
	* @param p the position on which you want to shoot
	* @return the state of the cell MISSED if the cell is touched or not occupied, 
  	* 			HIT if it is the first shot and it was busy 
  	* 			and SUNK if it was the last cell of a ship.
	*/
	public Answer shoot(Position p){
		Answer ans;
		try{
			ans = this.getPlateau().shoot(p);
			return ans;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Your coordonnate are incorrect please give a good coordonnate like two integer 0 <= X < "+this.getPlateau().getWidth()+" and 0 <= Y < "+this.getPlateau().getHeight()+"!");
			p = this.getInputs();
			ans = this.shoot(p);
			return ans;
		}
	}
	/**
	* performs a game tour
	*/
	public void play(){
		this.getPlateau().display(false);
		int cpt_try = 0;
		while(this.getPlateau().getTotalLifePoints() > 0){
			Position p = this.getInputs();
			Answer ans = this.shoot(p);
			System.out.println(ans);
			this.getPlateau().display(false);
			cpt_try ++;
		}
		System.out.println("++++                                      ++++");
		System.out.println("|   YOU FINISHED  THE ROUND AFTER "+cpt_try+" TRIES!   |");
		System.out.println("++++                                      ++++");
	}
}