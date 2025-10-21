package edu.snhu.jehrle.contacts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	private final String VALID_ID = "Java 10100";
	private final String VALID_FIRST_NAME = "John";
	private final String VALID_LAST_NAME = "Johnson";
	private final String VALID_PHONE = "1234567890";
	private final String VALID_ADDRESS = "123 Address St";
	
	Contact testContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE,VALID_ADDRESS);
	
	//Testing ContactID 
	@Test
	public void testContactID() {		
		Assertions.assertEquals(VALID_ID, testContact.getId());
	}
	
	@Test
	public void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(null, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE, VALID_ADDRESS));
	}
	@Test
	public void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact("Java 102020", VALID_FIRST_NAME, VALID_LAST_NAME,VALID_PHONE,VALID_ADDRESS));
	}
	
	//Testing First Name
	@Test
	public void testFirstName() {
		Assertions.assertEquals(VALID_FIRST_NAME, testContact.getFirstName());
	}
	@Test
	public void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, null, VALID_LAST_NAME, VALID_PHONE,VALID_ADDRESS));
	}
	
	@Test
	public void testFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, "John1234455", VALID_LAST_NAME, VALID_PHONE,VALID_ADDRESS));
	}
	
	//Testing Last Name
	@Test
	public void testLastName() {
		Assertions.assertEquals(VALID_LAST_NAME, testContact.getLastName());
	}
	@Test
	public void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME, null,VALID_PHONE,VALID_ADDRESS));
	}
	
	@Test
	public void testLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME, "Johnson12345",VALID_PHONE,VALID_ADDRESS));
	}
	
	//Testing Phone
	@Test
	public void testPhone() {
		Assertions.assertEquals(VALID_PHONE, testContact.getPhone());
	}
	@Test
	public void testPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME ,null, VALID_ADDRESS));
	}
	
	@Test
	public void testPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME,VALID_LAST_NAME , "12345678910" , VALID_ADDRESS));
	}
	
	@Test
	public void testPhoneToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME,VALID_LAST_NAME , "1234560" , VALID_ADDRESS));
	}
	
	//Testing Address//
	@Test
	public void testAddress() {
		Assertions.assertEquals(VALID_ADDRESS, testContact.getAddress());
	}
	@Test
	public void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME,VALID_PHONE,null));
	}
	
	@Test
	public void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME ,VALID_PHONE,"12222334543234565432345654323456543"));
	}
}
