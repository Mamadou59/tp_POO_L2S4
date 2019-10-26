package pfc.strategy;

import org.junit.*;

import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class StrategyTest{

	@Test
	public void testRandomStart(){
		Strategy startRandom = new RandomStrat();
		Shape shape = startRandom.chooceShape();
		assertTrue(shape instanceof Shape);
	}
	@Test
	public void testFixedStrat(){
		Strategy startFixed = new FixedStrat(Shape.ROCK);
		Shape shape = startFixed.chooceShape();
		assertSame(shape,Shape.ROCK);
	}
	// ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(pfc.strategy.StrategyTest.class);
    }
}