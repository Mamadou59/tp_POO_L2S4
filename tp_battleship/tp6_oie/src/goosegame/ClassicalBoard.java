package goosegame;

import goosegame.util.*;
public class ClassicalBoard extends Board{

	public ClassicalBoard(int nbOfCells){
		super(nbOfCells);
	}

	protected void initBoard(){
		Cell cell;
		for (int i=1; i<this.getNbOfCells()+1; i++){
			if (i == 9 || i == 18 || i == 27 || i == 36 || i == 45 || i == 54){
				cell = new CellOie(i);
			}
			else if (i == 31 || i == 52) cell = new CellTrapped(i);
			else if (i == 19) cell = new CellWait(i,2);
			else if (i == 6) cell = new CellJump(i,12);
			else if (i == 42) cell = new CellJump(i,30);
			else if (i == 58) cell = new CellJump(i,1);
			else cell = new Cell(i);
			this.theCells[i] = cell;
		}
	}
}