package goosegame.util;

import goosegame.*;

public class Cell{

	protected int index;
	protected boolean isOccupied;
	protected boolean canBeLeft;
	protected Player p;
	


	public Cell(int index){
		this.index = index;
		this.isOccupied = false;
		this.canBeLeft = true;
		this.p = null;
	}

	public int getIndex(){
		return this.index;
	}
	public Player getPlayer(){
		return this.p;
	}
	public boolean isOccupied(){
		return this.isOccupied;
	}

	public void makeOccupied(Player p){
		this.p = p;
		this.isOccupied = true;
	}
	public void makeUnoccupied(){
		this.p = null;
		this.isOccupied = false;
	}

	public int bound(int result,int posCellPrec){
		return posCellPrec + result;
	}
	public boolean canBeLeft(){
		return this.canBeLeft;
	}

	public String toString(){
		return ""+this.index; 
	}
	public String stateToString(){
		return "";
	}
}