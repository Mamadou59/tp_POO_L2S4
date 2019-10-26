package goosegame;

import goosegame.util.*;

public abstract class Board{

	protected final int nbOfCells;
	protected Cell[] theCells;

	public static final Cell STARTING_CELL = new Cell(0);

	public Board(int nbOfCells){
		this.nbOfCells = nbOfCells;
		this.theCells = new Cell[nbOfCells+1];
		this.theCells[0] = STARTING_CELL;
	}

	protected abstract void initBoard();

	public Cell getCell(int index) throws ArrayIndexOutOfBoundsException{
		if (index < 0 || index >this.nbOfCells) throw new ArrayIndexOutOfBoundsException();
		return theCells[index];
	}

	public int getNbOfCells(){
		return this.nbOfCells;
	}

}