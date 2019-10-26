import static org.junit.Assert.*;

import org.junit.Test;

import date.*;

import date.util.*;

public class DateTest{

	@Test
	public void DateDayMonthYearAreCorrectAfterCreation(){
		Date d1 = new Date(12,Month.february,2019);
		assertEquals(12,d1.getDay());
		assertEquals(Month.february,d1.getMonth());
		assertEquals(2019,d1.getYear());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCreationWhenIllegalArgument(){
		Date dateError = new Date(-2,Month.february,2019);
		Date dateError1 = new Date(29,Month.february,2019);
		Date dateError2 = new Date(32,Month.january,2019);
	}
	@Test
	public void testTomorrowDayIsValide(){
		Date d1 = new Date(12,Month.february,2019);
		Date d2 = new Date(28,Month.february,2019);
		Date d3 = new Date(28,Month.february,2016);
		Date d4 = new Date(31,Month.december,2019);
		assertEquals(d1.tomorrow(),new Date(13,Month.february,2019));
		assertEquals(d2.tomorrow(),new Date(1,Month.march,2019));
		assertEquals(d3.tomorrow(),new Date(29,Month.february,2016));
		assertEquals(d4.tomorrow(),new Date(1,Month.january,2020));
	}
	@Test
	public void testDistanceInDays(){
		Date d1 = new Date(12,Month.february,2019);
		Date d2 = new Date(30,Month.april,2019);
		assertEquals(77,d1.distanceInDays(d2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNDaysLaterWhenIllegalArgument(){
		Date d1 = new Date(12,Month.february,2019);
		d1.nDaysLater(-5);
	}

	@Test
	public void testNDaysLater(){
		Date d1 = new Date(12,Month.february,2019);
		assertEquals(new Date(30,Month.april,2019),d1.nDaysLater(77));
	}
	@Test  
	public void testEquals(){
		Date d1 = new Date(12,Month.february,2019);
		Date d2 = new Date(30,Month.april,2019);
		assertFalse(d1.equals(d2));
		assertTrue(d1.equals(new Date(12,Month.february,2019)));
	}
	// ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DateTest.class);
    }
}