package battleship;

import battleship.*;

import battleship.util.*;
import java.lang.ArrayIndexOutOfBoundsException;

/**
* This class models a plateau which is there 
* the sea and which is represented by a height and a width
*/
public class Sea{
	private Cell[][] theCells;
	private int totalLifePoints;


	public Sea(int width,int height){
		this.theCells = new Cell[height][width];
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				this.theCells[i][j] = new Cell();
			}
		}this.totalLifePoints = 0;
	}
	/**
	* Give the sea's width
	*/
	public int getWidth(){
		return this.theCells[0].length;
	}
	/**
	* Give the sea's height
	*/
	public int getHeight(){
		return this.theCells.length;
	}
	/**
	* Give all ships life points in this Sea
	*/
	public int getTotalLifePoints(){
		return this.totalLifePoints;
	}
	/**
	* return a cell of the sea whose position is given
	* @param p the cell's position
	* @throws ArrayIndexOutOfBoundsException
	*/
	public Cell getCell(Position p) throws ArrayIndexOutOfBoundsException{
		return this.theCells[p.getX()][p.getY()];
	}
	/**
	* shot on a cell of the sea and return the state of the cell
	* MISSED if the cell is touched or not occupied, 
  	* HIT if it is the first shot and it was busy 
  	* and SUNK if it was the last cell of a ship.
  	* @param p the cell's position
	*/
	public Answer shoot(Position p){
		Cell cell = this.getCell(p);
		Answer ans = cell.shoot();
		if (ans == Answer.HIT || ans == Answer.SUNK) this.totalLifePoints--;
		return ans;
	}
	/**
	* Pose a navir in the sea from a given position is a <code>true</code> horizontal direction 
	* and <code>false</code> vertical
	* @param shipToPlace the ship to add on the sea
	* @param position the position we will begin to pose the ship
	* @param state <code>true</code> if the ship's position will be horizontal and <code>false</code> if it will be vertical
	* @throws IllegalStateException if the pose can not be made caused by one of the cells that is already 
	*         occupied or in an incorrect position
	*/
	public void addShip(Ship shipToPlace, Position position, boolean state) throws IllegalStateException{
		Cell[] cells = new Cell[shipToPlace.getLength()];
		boolean error = false;
		Position p;
		try{
			for (int i=0;i<shipToPlace.getLength();i++){
				if (state) p = new Position(position.getX(),position.getY()+i);
				else p = new Position(position.getX()+i,position.getY());
				Cell cell = this.getCell(p);
				if (cell.getShip() == null) cells[i] = cell;
				else error = true;
			}
			if (!error){
				for(int i=0;i<cells.length;i++){
					cells[i].setShip(shipToPlace);
				}
				this.totalLifePoints += shipToPlace.getlifePoint();
			}

		}catch(ArrayIndexOutOfBoundsException e){
			error = true;
		} finally{
			if (error) throw new IllegalStateException();
		}
	}
	/**
	* givce the display of the sea
	* @param defender <code>true</code> if defender and <code>false</code> if an attacker
	*/
	public void display(boolean defender){
		int width = this.getWidth();
		int height = this.getHeight();
		for (int i=0;i<width;i++){
			System.out.print("+-");
		}
		System.out.print("+\n");
		for(int i =0;i<height;i++){
			System.out.print("|");
			for(int j=0;j<width;j++){
				Position pos = new Position(i,j);
				Cell cell = getCell(pos);
				System.out.print(cell.getCharacter(defender));
				System.out.print("|");
			}
			System.out.print("\n");
		}
		for (int i=0;i<width;i++){
			System.out.print("+-");
		}
		System.out.print("+\n");
	}
}