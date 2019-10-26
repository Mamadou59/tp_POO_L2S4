package goosegame;
import java.util.*;
import goosegame.cell.*;

/**
* Class Board
* @author Barry  Diallo
* @version 1.0
*/

public abstract class Board{

      /** the number of cell in Board*/
      protected static  int nbOfcells;
      /** a table of Cell*/
      protected Cell[] theCells;

      /**
      * @param  nbOfCells the number of cell in board
      */
      public Board(int nbOfCells){
            nbOfcells = nbOfCells+1;
            this.theCells = new Cell[this.nbOfcells];
            this.theCells[0] = new StartCell();
            initBoard();
      }

      /**
      * init the board
      */
      public abstract void initBoard();

      /**
      * this fonction give the cell at index
      * @param index the index where we can take the Cell
      * @return Cell the cell at index
      */
      public Cell getcell(int index){
            return this.theCells[index];
      }

      /**
      * this function return the number of cell in board
      * @return int the number of cell in board
      */
      public static int getNbOfCells(){
            return nbOfcells;
      }
}
