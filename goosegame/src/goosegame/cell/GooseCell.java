package goosegame.cell;
import java.util.*;
import goosegame.*;

/**
* Class GooseCell
* @author Barry & Diallo
* @version 1.0
*/

public class GooseCell extends BasicCell implements Cell{

      /**
      * build the GooseCell
      * @param index the index of cell in board
      */
      public GooseCell(int index){
            super(index);
      }

      /**
      * this function return the next cell where the player go
      * @param des it's the result of your turn
      * @return the index where the player must go
      */
      public int handleMove(int des){
            return super.handleMove(des)+des;
      }

      /**
      * this fonction return the representation of GooseCell
      * @return Strinf representation of GooseCell
      */
      public String toString(){
            String s = super.toString()+ " (goose)";
            return s;
      }
}
