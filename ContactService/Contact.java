package edu.snhu.jehrle.contacts;

public class Contact {
	//local elements
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//setting up the contact
	public Contact(String contactID, String firstName, String lastName, String phone,String address) {
		setContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	//Setters
	private void setContactID(String contactID) {

		if (contactID == null) {
			throw new IllegalArgumentException("Contact ID cannot be null");
		}
		
		else if (contactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID cannot be more than 10 characters");
		}

		this.contactID = contactID;	
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("First Name cannot be null");
		}
		
		else if (firstName.length() > 10) {
			throw new IllegalArgumentException("First Name cannot be more than 10 characters");
		}
		this.firstName = firstName;
		
	}
	
	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Last Name cannot be null");
		}
		
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name cannot be more than 10 characters");
		}
		this.lastName = lastName;
		
	}
	
	public void setPhone(String phone) {
		if (phone == null) {
			throw new IllegalArgumentException("Phone Number cannot be null");
		}
		
		else if (phone.length() != 10) {
			throw new IllegalArgumentException("Phone Number has to be 10 Characters");
		}
		this.phone = phone;
		
	}
	
	public void setAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Address cannot be null");
		}
		
		else if (address.length() > 30) {
			throw new IllegalArgumentException("Address cannot be more than 30 characters");
		}
		this.address = address;
		
	}
	
	//Getters
	public String getId() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
}
