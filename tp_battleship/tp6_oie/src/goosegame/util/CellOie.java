package goosegame.util;

import goosegame.*;

public class CellOie extends Cell{

	public CellOie(int index){
		super(index);
	}

	public int bound(int result,int posCellPrec){
		return posCellPrec + 2*result;
	}

	public String stateToString(){
		return " and jump to cell "+this.index;
	}
}