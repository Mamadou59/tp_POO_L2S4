package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BrandFilterTest {

	private BrandFilter criterion;
	private Vehicle v1;
	private Vehicle v2;

	@Before
	public void before(){
		this.criterion = new BrandFilter("brand1");
		this.v1 = new Vehicle("brand1","model1",2015,100);
		this.v2 = new Vehicle("brand2","model2",2000,200);
	}

	@Test
	public void testAccept() {
		assertTrue(criterion.accept(this.v1));
		assertFalse(criterion.accept(this.v2));
	}

    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(rental.BrandFilterTest.class);
    }
}
