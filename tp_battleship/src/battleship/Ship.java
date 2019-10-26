package battleship;

/**
* This class gives the modeling of a ship that will contain cells, 
* a ship must have a length
*/

public class Ship {

  priva length;
  private int lifePoint;

  public Ship(int length){
    this.length = length;
    this.lifePoint = length;
  }
  /**
  * Give the length of the ship
  * @return the ship's length
  */
  public int getLength(){
    return this.length;
  }
  /**
  * Give the ship's life points the number 
  * which represents the cells that a ship can hold 
  * @return the ship's life points
  */
  public int getlifePoint(){
    return this.lifePoint;
  }
  /**
  * return true if a ship is sunk and false otherwise
  * @return true if a ship is sunk and false otherwise
  */
  public boolean hasBeenSunk(){
    return getlifePoint() == 0;
  }
  /**
  * shoots a ship that will decrement the life point of the ship with each shot
  */
  public void hit(){
    if (this.getlifePoint() > 0) this.lifePoint -= 1;
  }


}
