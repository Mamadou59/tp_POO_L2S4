package battleship.util;

import battleship.*;

/**
* this class creates a cell and has methods to add it to a ship
*/

public class Cell{

  public static final char[] NOT_EMPTY_CHAR = {'.','B'};
  public static final char SHOTED_CHAR = '*';
  public static final char EMPTY_CHAR = '~';
  private boolean hasBeenShot;
  private Ship ship;

  public Cell(){
    this.hasBeenShot = false;
    this.ship = null;
  }
  /**
  * returns the ship that contains the cell
  */
  public Ship getShip(){
    return this.ship;
  }
  /**
  * add a cell to a ship if it is not already occupied
  */
  public void setShip(Ship ship){
    if (this.getShip() == null) this.ship = ship;
  }
  /**
  * shot on a cell and returns MISSED if the cell is touched or not occupied, 
  * HIT if it is the first shot and it was busy and SUNK if it was the last cell of a ship
  */
  public Answer shoot(){
    if (!this.hasBeenShot()){
      this.hasBeenShot = true;
      if (this.getShip() == null) return Answer.MISSED;
      this.getShip().hit();
      if (this.getShip().getlifePoint() == 0) return Answer.SUNK;
      return Answer.HIT;
    }
    else return Answer.MISSED;
  }
  /**
  * return <code>true</code> if the cell is hited <code>false</code> if not
  */
  public boolean hasBeenShot(){
    return this.hasBeenShot;
  }
  /**
  * return the display of a cell according to its state 
  * and according to whether it is a defender or an attenchant 
  * '~' for an unoccupied cell '*' for an hited cell 
  * and 'B' for an ocuped cell that a defender must see and '.' for the attacker
  * @param defender <code>true</code> if defender and <code>false</code> if an attacker
  */
  public char getCharacter(boolean defender){
    int i = 0;
    if (defender) i = 1;
    if (this.getShip() == null) return EMPTY_CHAR;
    else if (this.hasBeenShot()) return SHOTED_CHAR;
    return NOT_EMPTY_CHAR[i];
  }
}

