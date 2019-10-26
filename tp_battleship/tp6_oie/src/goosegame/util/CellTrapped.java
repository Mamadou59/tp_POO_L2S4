package goosegame.util;

import goosegame.*;

public class CellTrapped extends Cell{

	public CellTrapped(int index){
		super(index);
	}

	public boolean canBeLeft(){
		return false;
	}
}