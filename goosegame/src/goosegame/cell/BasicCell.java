package goosegame.cell;
import java.util.*;
import goosegame.*;

/**
* Class BasicCell
* @author Barry et Diallo
* @version 1.0
*/


public class BasicCell implements Cell{
      /** the index where the cell in*/
      protected int index;
      /** the player in the cell*/
      protected Player p;

      /**
      * create the cell
      * @param index the index of cell in the board
      */
      public BasicCell(int index){
            this.index = index;
            this.p = null;
      }

      /**
      * return the index of cell in board
      * @return int the index of cell
      */
      public int getIndex(){
            return this.index;
      }

      /**
      * this function allow to know if the cell can left
      * @return boolean (true) if the the cell can left false otherwise
      */
      public boolean canBeLeft(){
            return true;
      }

      /**
      * this fonction test if this cell busy by player
      * @return true if cell is busy false otherwise
      */
      public boolean isBussy(){
            return this.p != null;
      }

      /**
      * this function return the player in this cell
      * @return player in this cell
      */
      public Player getPlayer(){
            return this.p;
      }

      /**
      * this function return the next cell where the player go
      * @param i the index give by your
      * @return the index where the player must go
      */
      public int handleMove(int indice){
          return this.index;
      }

      /**
      * Add the player to this cell
      * @param p player
      */
      public void welcomePlayer(Player p){
                this.p = p;
      }
      /**
      * set the cell free
      */
      public void setfree(){
            this.p=null;
      }

      /**public void setfree(){
            this.player.remove(this.get)
      }
      * this function a representation of cell
      * @return String representation of Cell
      */
      public String toString(){
            String s = String.format("cell %d",this.getIndex());
            return s;
      }
}
