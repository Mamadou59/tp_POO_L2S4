package rental;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class RentalAgencyTest {

	private Vehicle v,v1,v2;
	private Client client,client1;
	private RentalAgency agency;

	@Before
	public void before(){
		this.agency = new RentalAgency();
		this.v = new Vehicle("Vroum", "Vroum", 2000, 100);
		this.v1 = new Vehicle("brand1","model1",2015,100);
		this.v2 = new Vehicle("brand2","model2",2000,200);
		this.client1 = new Client("Tim Oleon", 25);
		this.client = new Client("Mamadou",20);
		this.agency.addVehicle(v);
		this.agency.addVehicle(v1);
	}
	

	@Test
	public void twoClientObjectsWithSameNameCorrespondsToSameClient() 
					throws IllegalStateException, UnknownVehicleException {
		assertEquals(100, this.agency.rentVehicle(this.client1, this.v),0.0001);
		assertTrue(this.agency.hasRentedAVehicle(this.client1));
		// client2 corresponds to same client than client1 since names are equals
		Client client2 = new Client("Tim Oleon", 25);
		// then test should succeed
		assertTrue(this.agency.hasRentedAVehicle(client2));
	}
	
	@Test()
	public void testisRented(){
		try{
			this.agency.rentVehicle(this.client, this.v);
			assertTrue(this.agency.isRented(this.v));
			assertFalse(this.agency.isRented(this.v2));
		}catch(UnknownVehicleException e){
			fail();
		}catch(IllegalStateException e){
			fail();
		}
		
	}

	@Test(expected=UnknownVehicleException.class)
	public void testRentVehiculeUnknowVehiculeException() throws UnknownVehicleException {
		this.agency.rentVehicle(this.client,this.v2);
	}

	@Test(expected=IllegalStateException.class)
	public void testRentVehiculeIllegalStateException() throws IllegalStateException, UnknownVehicleException {
		this.agency.rentVehicle(this.client,this.v);
		this.agency.rentVehicle(this.client1,this.v);
	}
	@Test
	public void testValideRentVehicule(){ //throws IllegalStateException, UnknownVehicleException {
		try{
			this.agency.addVehicle(v2);
			Client client3 = new Client("Timo", 25);
			assertEquals(100, this.agency.rentVehicle(client3, this.v1),0.0001);
		}catch(UnknownVehicleException e){
			fail();
		}catch(IllegalStateException e){
			fail();
		}
		
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
	}

}
