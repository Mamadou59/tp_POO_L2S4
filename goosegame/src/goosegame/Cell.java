package goosegame;

import goosegame.*;
/**
*Basic interface for the Cell
* @author Barry  Diallo
* @version 1.0
*/
public interface Cell{

  public int getIndex();
  public boolean canBeLeft();
  public boolean isBussy();
  public Player getPlayer();
  public int handleMove(int i);
  public void welcomePlayer(Player p);
  public void setfree();

}
