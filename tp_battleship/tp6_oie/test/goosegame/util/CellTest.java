package goosegame.util;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import goosegame.*;
import goosegame.util.*;

public class CellTest{
	private Player p;

	@Before
	public void before(){
		this.p = new Player("Mamadou");
	}

	@Test
	public void typeCellTest(){
		Cell cell = new Cell(2);
		assertTrue(cell.canBeLeft());
		assertFalse(cell.isOccupied());
		this.p.setCell(cell);
		assertTrue(cell.isOccupied());
		assertEquals(4,cell.bound(4));
	}
	@Test
	public void typeCellOieTest(){
		Cell cellOie = new CellOie(3);
		assertTrue(cellOie.canBeLeft());
		assertFalse(cellOie.isOccupied());
		this.p.setCell(cellOie);
		assertTrue(cellOie.isOccupied());
		assertEquals(8,cellOie.bound(4));
	}
	@Test
	public void typeCellTrappedTest(){
		Cell cellTrapped = new CellTrapped(4);
		assertFalse(cellTrapped.canBeLeft());
		assertFalse(cellTrapped.isOccupied());
		this.p.setCell(cellTrapped);
		assertTrue(cellTrapped.isOccupied());
		assertEquals(4,cellTrapped.bound(4));
	}

	@Test
	public void typeCellWaitTest(){
		CellWait cellWait = new CellWait(6);
		assertFalse(cellWait.canBeLeft());
		assertFalse(cellWait.isOccupied());
		this.p.setCell(cellWait);
		assertTrue(cellWait.isOccupied());
		assertEquals(7,cellWait.bound(7));
	}
	@Test
	public void typeCellJumpTest(){
		Cell cellJump = new CellJump(10,20);
		assertTrue(cellJump.canBeLeft());
		assertFalse(cellJump.isOccupied());
		this.p.setCell(cellJump);
		assertTrue(cellJump.isOccupied());
		assertEquals(24,cellJump.bound(4));
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(goosegame.util.CellTest.class);
	}
}