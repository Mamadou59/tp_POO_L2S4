package goosegame.util;

import goosegame.*;

public class CellJump extends Cell{

	private int newIndex;

	public CellJump(int index, int newIndex){
		super(index);
		this.newIndex = newIndex;
	}

	public int bound(int result,int posCellPrec){
		int res;
		if (this.newIndex > this.index) res = result + this.newIndex;
		else res = this.newIndex;
		return res;
	}

	public String stateToString(){
		return " and jump to cell "+ this.index;
	}
}