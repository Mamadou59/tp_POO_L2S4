package pfc;

import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class ShapeTest{

	@Test 
	public void compareTestPaperWinRock(){
		Shape paper = Shape.PAPER;
		Shape rock = Shape.ROCK;
		assertEquals(-1,rock.compareShape(paper));
		assertEquals(1,paper.compareShape(rock));
	}
	@Test
	public void compareTestScissorsWinPaper(){
		Shape scissors = Shape.SCISSORS;
		Shape paper = Shape.PAPER;
		assertEquals(-1,paper.compareShape(scissors));
		assertEquals(1,scissors.compareShape(paper));
	}
	@Test
	public void compareTestRockwinScissors(){
		Shape rock = Shape.ROCK;
		Shape scissors = Shape.SCISSORS;
		assertEquals(2,rock.compareShape(scissors));
		assertEquals(-2,scissors.compareShape(rock));
	}
	// ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(pfc.ShapeTest.class);
    }
}