package goosegame.cell;
import goosegame.*;
import java.util.*;

/**
* Class BasicCell
* @author Barry & Diallo
* @version 1.0
*/
public class StartCell implements Cell{
      /** the liste of player */
      /**
      * create the cell
      */
      public StartCell(){
            
      }     
      /**
      * Add the player to this cell
      * @param p player
      */
      public void welcomePlayer(Player p){
                  }
      /**
      * Tell us that the player can not be at left
      */
      public boolean canBeLeft(){
            return true;
      }

      /**Move the player to an other goose 
      * @param i the jumpe for the next goose 
      */
      public int handleMove(int i){
            return 0;
      }
      /**
      * Return the index of the player
      *@return index
      */
      public int getIndex(){
            return 0;
      } 
      /**
      *Return False beacause the start cell isn't bussy
      */
      public boolean isBussy(){
            return false;
      }
      /**
      *set the cell free
      *Coment gerer la methode de setfree dans la case de depart vu que c'est tous les 
      *joueurs qui y sont 
       */
      public void setfree(){}

      public Player getPlayer(){
            return null;
      }

      public String toString(){
            return "cell 0";
      }


}
