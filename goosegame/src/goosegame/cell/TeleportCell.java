package goosegame.cell;
import java.util.*;
import goosegame.*;

/**
* Class TeleportCell
* @author Barry & Diallo
* @version 1.0
*/

public class TeleportCell extends BasicCell implements Cell{
      /** the index where the cell can jump*/
      protected int jumpIndex;

      /**
      * init the new teleport cell
      * @param index it's the index of your cell
      * @param jump it's the index of the next cell
      */
      public TeleportCell(int index, int jump ){
            super(index);
            this.jumpIndex = jump;
      }

      /**
      * this function return the next cell where the player go
      * @param des the index give by your(he is useless)
      * @return the index where the player must go
      */
      public int handleMove(int des){
            return this.jumpIndex;
      }

      /**
      * return the representation of TeleportCell
      * @return String representation of TeleportCell
      */
      public String toString(){
        String s = super.toString()+  String.format("(teleport to %d)",this.jumpIndex);
        return s;
      }



}
