package goosegame.cell;

import goosegame.cell.*;
import goosegame.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStartCell{
    private StartCell cell;
    private Player p1;
    private Player p2;

    @Before
    public void before(){
        this.cell = new StartCell();
        this.p1 = new Player("enzo");
        this.p2 = new Player("barry");
    }

    @Test
    public void testCanbeleft(){
        assertTrue(this.cell.canBeLeft());
    }

    @Test
    public void testhandleMove(){
          assertEquals(0, this.cell.handleMove(0));
    }


  public static junit.framework.Test suite() {
return new junit.framework.JUnit4TestAdapter(goosegame.cell.TestStartCell.class);
  }

}
