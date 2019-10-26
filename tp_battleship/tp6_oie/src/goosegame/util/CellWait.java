package goosegame.util;

import goosegame.*;

public class CellWait extends Cell{

	//public static final int roundToWait = 2;
	private int roundToWait;
	private int roundToWaitVar;
	public CellWait(int index,int roundToWait){
		super(index);
		this.roundToWait = roundToWait;
		this.roundToWaitVar = roundToWait;

	}


	public boolean canBeLeft(){
		int rep = this.roundToWaitVar;
		if (this.roundToWaitVar == 0){
			this.roundToWaitVar = this.roundToWait; 
		} 
		else this.roundToWaitVar --;
		return rep == 0;
	}
	public String stateToString(){
		return " he wait for "+this.roundToWaitVar+"round";
	}
	// public String toString(){
	// 	return super.toString()+ "he wait for "+this.roundToWaitVar+" so ";
	// }
}