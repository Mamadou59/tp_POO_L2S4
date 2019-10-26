package goosegame.cell;

import goosegame.cell.*;
import goosegame.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWaitingCell{
    private Cell cell;
    private Player p1;
    private Player p2;

    @Before
    public void before(){
        this.cell = new WaitingCell(19,2);
        this.p1 = new Player("enzo");
        this.p2 = new Player("barry");
    }

    @Test
    public void testCanbeleft(){
        assertFalse(this.cell.canBeLeft());
        assertFalse(this.cell.canBeLeft());
        assertTrue(this.cell.canBeLeft());
    }

    @Test
    public void testisBussy(){
        assertFalse(this.cell.isBussy());
        this.cell.welcomePlayer(this.p1);
        assertTrue(this.cell.isBussy());
    }

    @Test
    public void testgetPlayer(){
          this.cell.welcomePlayer(this.p1);
          assertSame(p1, this.cell.getPlayer());
    }

    @Test
    public void testhandleMove(){
          assertEquals(19, this.cell.handleMove(1));
    }


  public static junit.framework.Test suite() {
return new junit.framework.JUnit4TestAdapter(goosegame.cell.TestGooseCell.class);
  }

}