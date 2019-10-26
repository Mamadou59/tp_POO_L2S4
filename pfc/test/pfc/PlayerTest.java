package pfc;

import org.junit.*;

import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class PlayerTest{

	@Test
	public void testPlay(){
		Strategy startFixed = new FixedStrat(Shape.ROCK);
		Player p = new Player("Mamadou",startFixed);
		Shape shape = p.play();
		assertEquals(shape,Shape.ROCK);
	}
	// ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(pfc.PlayerTest.class);
    }
}