/**
 * 
 */
package a00985171.data;

/**
 * @author bruna
 *
 */
public class Customer {
	
	private final String id;
	private final String firstName;
	private final String lastName;
	private final String streetName;
	private final String postalCode;
	private final String phone;
	private final String email;
	
	public static class Builder {
		// Required parameters
		private final String id;
		private final String email;

		// Optional parameters - initialized to default values
		private String firstName;
		private String lastName;
		private String streetName;
		private String postalCode;
		private String phone;

		public Builder(String id, String email) {
			this.id = id;
			this.email = email;
		}

		public Builder firstName(String val) {
			firstName = val;
			return this;
		}

		public Builder lastName(String val) {
			lastName = val;
			return this;
		}

		public Builder streetName(String val) {
			streetName = val;
			return this;
		}

		public Builder postalCode(String val) {
			postalCode = val;
			return this;
		}
		
		public Builder phone(String val) {
			phone = val;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}
	}

	public Customer(Builder builder) {
		id = builder.id;
		firstName = builder.firstName;
		lastName = builder.lastName;
		streetName = builder.streetName;
		postalCode = builder.postalCode;
		phone = builder.phone;
		email = builder.email;
	}

	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}




	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}




	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}




	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}




	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}




	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}




	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", streetName="
				+ streetName + ", postalCode=" + postalCode + ", phone=" + phone + ", email=" + email + "]";
	}
	
}

