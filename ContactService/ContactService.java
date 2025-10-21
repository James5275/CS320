package edu.snhu.jehrle.contacts;


import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	private List<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList();
	}

	public void add(Contact newContact) {
		
		boolean isDup = false;
		//looping though contacts 
		for(Contact contact : contacts) {
			//if new contact is equal to a contact id in current list isDup is true 
			if(contact.getId().equals(newContact.getId())) {
				isDup = true;
				break;
			}
		}
		// if it is Dup throw exception
		if(isDup) {
			throw new IllegalArgumentException("Cannot Add School with same ID");
		}
		
		//if not dup add to contacts
		contacts.add(newContact);
	}
	public void delete(Contact newContact) {
		//loop through contacts list 
		for (Contact contact : contacts) {
			//if id is equal to the new contact id 
			if (contact.getId().equals(newContact.getId())) {
				//delete item 
				contacts.remove(contact);
				break;
			}
		}
	}
	
	public Contact get(String id) {
		Contact foundContact = null;
		//Loop through contactID
		for (Contact contact: contacts) {
			//check to see if that contact is currently in list
			if(contact.getId().equals(id)) {
				foundContact = contact;
				break;
			}
		}
		return foundContact;
	}
	
	public void updateFirstName(String newFirstName, String id) {
		//loop though contact list
		for (int i = 0; i < contacts.size(); i++) {
			//if contact matching id 
			if(contacts.get(i).getId().equals(id)) {
				//update first name 
				contacts.get(i).setFirstName(newFirstName);
				break;
			}
		}
	}

	public void updateLastName(String newLastName, String id) {
		//loop through contacts list 
		for (int i = 0; i < contacts.size(); i++) {
			//if contact matchings id
			if(contacts.get(i).getId().equals(id)) {
				//update last name 
				contacts.get(i).setLastName(newLastName);
				break;
			}
		}
	}

	public void updatePhone(String newPhone, String id) {
		//loop through contacts list
		for (int i = 0; i < contacts.size(); i++) {
			//if matching contact then update
			if(contacts.get(i).getId().equals(id)) {
				//update phone
				contacts.get(i).setPhone(newPhone);
				break;
			}
		}
	}

	public void updateAddress(String newAddress, String id) {
		//Looping through contacts
		for (int i = 0; i < contacts.size(); i++) {
			//if matching contact then update
			if(contacts.get(i).getId().equals(id)) {
				//update address
				contacts.get(i).setAddress(newAddress);
				break;
			}
		}
		
	}
	
}
