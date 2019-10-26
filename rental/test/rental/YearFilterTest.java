package rental;

import static org.junit.Assert.*;

import org.junit.Test;

public class YearFilterTest {

	
	@Test
	public void testAccept() {
		YearFilter criterion = new YearFilter(2012);
		Vehicle v1 = new Vehicle("brand1","model1",2015,100);
		Vehicle v2 = new Vehicle("brand2","model2",2000,200);
		assertTrue(criterion.accept(v1));
		assertFalse(criterion.accept(v2));
	}
    
    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(rental.YearFilterTest.class);
    }

}
