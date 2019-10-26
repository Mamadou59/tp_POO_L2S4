package battleship.util;

import org.junit.*;

import static org.junit.Assert.*;

import battleship.*;

import battleship.util.*;

public class CellTest {

  @Test
  public void testResultAnswerHIT(){
    Ship ship = new Ship(3);
    Cell cell = new Cell();
    cell.setShip(ship);
    Answer answer = cell.shoot();
    assertEquals(Answer.HIT,answer);
    assertTrue(cell.hasBeenShot());
  }

  @Test
  public void testResultAnswerMissed(){
    Ship ship = new Ship(2);
    Cell cell = new Cell();
    cell.setShip(ship);
    cell.shoot();
    Answer answer = cell.shoot();
    assertEquals(Answer.MISSED,answer);
    assertTrue(cell.hasBeenShot());
  }

  @Test
  public void testResultAnswerSUNK(){
    Ship ship = new Ship(1);
    Cell cell = new Cell();
    cell.setShip(ship);
    Answer answer = cell.shoot();
    assertEquals(Answer.SUNK,answer);
    assertTrue(cell.hasBeenShot());
  }

  // @Test
  // public void testSetShip(){
  //   Ship ship = new Ship(1);
  //   Ship ship2 = new Ship(2);
  //   Cell cell = new Cell();
  //   cell.setShip(ship);
  //   assertEquals(cell.setShip(ship2),null);
  // }
  @Test 
  public void testGetCharacterReturnDef(){
    Ship ship = new Ship(3);
    Cell cell = new Cell();
    assertEquals('~',cell.getCharacter(true));
    cell.setShip(ship);
    assertEquals('B',cell.getCharacter(true));
    cell.shoot();
    assertEquals('*',cell.getCharacter(true));
  }

  @Test
  public void testGetCharacterReturnAtt(){
    Ship ship = new Ship(3);
    Cell cell = new Cell();
    assertEquals('~',cell.getCharacter(false));
    cell.setShip(ship);
    assertEquals('.',cell.getCharacter(false));
    cell.shoot();
    assertEquals('*',cell.getCharacter(false));
  }

  // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(battleship.util.CellTest.class);
    }

}
