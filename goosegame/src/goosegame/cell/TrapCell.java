package goosegame.cell;
import java.util.*;
import goosegame.*;

/**
* Class TrapCell
* @author Barry & Diallo
* @version 1.0
*/

public class TrapCell extends BasicCell{

      /**
      * Init a new TrapCell
      * @param index it's the index of your cell
      */
      public TrapCell(int index){
            super(index);
      }

      /**
      * this function allow to know if the cell can left
      * @return boolean (true) if the the cell can left false otherwise
      */
      public boolean canBeLeft(){
            return false;
      }

      /**
      * this function return a representation of TrapCell
      * @return String representation of TrapCell
      */
      public String toString(){
        String s = super.toString()+ " (trap)";
        return s;
      }
}
