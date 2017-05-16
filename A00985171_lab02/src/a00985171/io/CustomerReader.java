/**
 * @author bruna
 *
*/

package a00985171.io;

import a00985171.data.Customer;

public class CustomerReader {


	public static Customer[] populateCustomer(String arg) {
		Customer[] team = null;
		String[] temp1;
		String[] temp2;

		String str = arg;
		
			temp1 = str.split("\\:");
			team = new Customer[temp1.length];

			for (int i = 0; i < temp1.length; i++) {
				temp2 = temp1[i].split("\\|");
				for (int j = 0; j < temp2.length; j++) {
							
					Customer person = new Customer.Builder(temp2[0], temp2[6]).firstName(temp2[1]).lastName(temp2[2]).streetName(temp2[3]).postalCode(temp2[4]).phone(temp2[5]).build();
					team[i] = person;
				}
			}
	
		return team;
	}
	
}

	