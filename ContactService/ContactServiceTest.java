package edu.snhu.jehrle.contacts;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	private ContactService service;
	
	
	@BeforeEach
	//Starts each test empty
	public void setup() {
		service = new ContactService();

	}

	//ADD ELEMENTS 
	@Test
	public void testAddNewElements() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//add new contact
		service.add(newContact);
		//check to make sure new contact was added
		Assertions.assertEquals(service.get(newContact.getId()), newContact);
	}
	
	@Test
	public void testAddWithDuplicate() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//Adding the contact
		service.add(newContact);
		//Checking for not null
		Assertions.assertNotNull(service.get(newContact.getId()));
		//Testing for the same Contact ID 
		Assertions.assertThrows(IllegalArgumentException.class, ()-> service.add(newContact));
	}
	
	//DELETE ELEMENTS
	@Test
	public void testDelete() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//add new contact
		service.add(newContact);
		//Check to make sure not null
		Assertions.assertNotNull(service.get(newContact.getId()));
		//delete
		service.delete(newContact);
		//Check to see if it was deleted
		Assertions.assertNotEquals(service.get(newContact.getId()), newContact.getId());
	}
	
	//EDIT 
	
	@Test
	public void testFirstNameUpdate() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//add new contact
		service.add(newContact);
		// new name 
		String newFirstName = "Michael";
		//updating the first name 
		service.updateFirstName(newFirstName , newContact.getId());
		//checking to see if the first name matches the 
		Assertions.assertEquals(service.get(newContact.getId()).getFirstName(), newFirstName) ;
	}
	
	@Test
	public void testLastNameUpdate() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//add new contact
		service.add(newContact);
		// new name 
		String newLastName = "Thorton";
		//updating the first name 
		service.updateLastName( newLastName , newContact.getId());
		//checking to see if the first name matches the 
		Assertions.assertEquals(service.get(newContact.getId()).getLastName(), newLastName) ;
	}
	
	@Test
	public void testPhoneUpdate() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//add new contact
		service.add(newContact);
		// new name 
		String newPhone = "0987654321";
		//updating the first name 
		service.updatePhone( newPhone , newContact.getId());
		//checking to see if the first name matches the 
		Assertions.assertEquals(service.get(newContact.getId()).getPhone(), newPhone) ;
	}
	
	@Test
	public void testAddressUpdate() {
		//Create a new contact
		Contact newContact = new Contact("Java 101", "John", "Johnson", "1234567890", "123 Address St");
		//add new contact
		service.add(newContact);
		// new name 
		String newAddress = "1243 New Address St";
		//updating the first name 
		service.updateAddress( newAddress , newContact.getId());
		//checking to see if the first name matches the 
		Assertions.assertEquals(service.get(newContact.getId()).getAddress(), newAddress) ;
	}
}
