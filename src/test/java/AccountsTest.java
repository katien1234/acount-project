import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

public class AccountsTest {

	// Needs to be done in every class, REFERENCE unless public

	Service service = new Service();
	Account joe = new Account("Joe", "Gurney", 123);

	@Before
	public void setup() {
		
		
	}

	@Test
	public void testPrint() {
		assertEquals("Hello World", "Hello World");
	}

	@Test
	public void testNamesZero() {
		assertEquals(0, service.compareNames("John"));

	}

	@Test
	public void testNamesNotZero() {
		service.addPeople(joe);
		assertEquals(1, service.compareNames("joe"));

	}
	
	
	
	@Test
	public void testAddAccount() {
		service.addPeople(joe);
		assertEquals(1, service.numberOfAccounts());
	}

}

// Service service = new Service();
// Account joe = new Account("Joe", "Gurney", 123);
// service.addPeople(joe);
// System.out.println(service.getAccounts ());
//
//
// Gson gson = new Gson();
// String json = gson.toJson(service);
// System.out.println(json);
//
//
//
// System.out.println(service.compareNames( "John"));
