package core.entities;

public class Customer {
	
	private int customerNationalID;
	private String customerPassportNumber;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String businessName;
	
	public Customer(String customerPassportNumber, String firstName, String lastName, String emailAddress,
			String businessName) {
		this.customerPassportNumber = customerPassportNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.businessName = businessName;
	}

	public Customer(int customerNationalID, String firstName, String lastName, String emailAddress,
			String businessName) {
		
		this.customerNationalID = customerNationalID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.businessName = businessName;
	}

	public int getCustomerNationalID() {
		return customerNationalID;
	}

	public void setCustomerNationalID(int customerNationalID) {
		this.customerNationalID = customerNationalID;
	}

	public String getCustomerPassportNumber() {
		return customerPassportNumber;
	}

	public void setCustomerPassportNumber(String customerPassportNumber) {
		this.customerPassportNumber = customerPassportNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}	

}
