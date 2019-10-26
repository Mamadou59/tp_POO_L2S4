package goosegame.cell;
import java.util.*;
import goosegame.*;

/**
* Class WaitingCell
* @author Barry & Diallo
* @version 1.0
*/

public class WaitingCell extends BasicCell{
      /** the time you will wait */
      protected final int duration;
      /** the time who left to wait */
      protected int waitTime;

      /**
      * create the cell
      * @param index the index of cell in the board
      * @param durationWait the time you wait in cell
      */
      public WaitingCell(int index, int durationWait){
        super(index);
        this.duration = durationWait;
        this.waitTime = durationWait;

      }

      /**
      * this function allow to know if the cell can left
      * @return boolean (true) if the the cell can left false otherwise
      */
      public boolean canBeLeft(){
          if(this.waitTime == 0){
            return true;
          }
          else {
            this.waitTime -=1;
            return false;
          }

      }

      /**
      * this function return the player in this cell
      * @param p it's the player who will play
      *
      */
      public void welcomePlayer(Player p){
            super.welcomePlayer(p);
            this.waitTime = this.duration;
      }

      /**
      * this function a representation of cell
      * @return String representation of Cell
      */
      public String toString(){
            String s = super.toString()+ String.format(" waiting for %d turns", this.duration);
            return s;
      }
}
