import org.junit.*;

import static org.junit.Assert.*;

import example.Robot;

import example.util.Box;

import example.util.ConveyerBelt; 



public class RobotTest {

	@Test
	public void testRobotCreation(){
		Robot r1 = new Robot();
		assertNull(r1.getCarriedBox());
	}

	@Test
	public void testRobotTakeBox(){
		Robot r1 = new Robot();
		Box someBox = new Box(10);
		r1.take(someBox);
		assertSame(someBox,r1.getCarriedBox());
		Box someBox2 = new Box(20);
		r1.take(someBox2);
		assertNotSame(someBox2,r1.getCarriedBox());
	}

	@Test
	public void testRobotCarryBox(){
		Robot r1 = new Robot();
		Box someBox = new Box(10);
		assertFalse(r1.carryBox());
		r1.take(someBox);
		assertTrue(r1.carryBox());
	}

	@Test
	public void testRobotputOn(){
		Robot r1 = new Robot();
		Box someBox = new Box(10);
		Box someBox2 = new Box(20);
		Box someBox3 = new Box(5);
		ConveyerBelt conv = new ConveyerBelt(15);
		assertEquals("no box",r1.putOn(conv));
		r1.take(someBox);
		assertSame(someBox,r1.getCarriedBox());
		assertSame("ok",r1.putOn(conv));
		assertEquals(null,r1.getCarriedBox());
		r1.take(someBox2);
		assertSame("box too heavy",r1.putOn(conv));
		Robot r2 = new Robot();
		r2.take(someBox3);
		assertSame("ok",r2.putOn(conv));
		assertEquals(null,r2.getCarriedBox());
		assertSame("belt full",r1.putOn(conv));
	}

	// ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }
}