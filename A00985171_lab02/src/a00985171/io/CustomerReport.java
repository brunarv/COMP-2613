/**
 * 
 */
package a00985171.io;

import a00985171.data.Customer;

/**
 * @author bruna
 *
 */
public class CustomerReport {

	
	private static String TABLE_TITLE = "Customer Report";
	private static String TABLE_HEADER_FORMAT = "%-5s%-5s%6s%-15s%-15s%-25s%-15s%-15s%-15s%-15s%n";
	private static String TABLE_BODY_FORMAT =   "%-5s%-5s%6s%-15s%-15s%-25s%-15s%-15s%-15s%n";
	private static String TABLE_LINE_SEPARATOR = String.format("%0133d", 0).replace("0", "-");
	
	public static void displayPlayers(Customer[] customers) {

		System.out.println(TABLE_TITLE);
		System.out.println(TABLE_LINE_SEPARATOR);
		System.out.format(TABLE_HEADER_FORMAT, "#.", "ID", " ", "First name", "Last name",  "Street Name", "City", "Postal Code", "Phone", "Email");
		System.out.println(TABLE_LINE_SEPARATOR);

		for (int i = 0; i < customers.length; i++) {
			System.out.format(TABLE_BODY_FORMAT, (i + 1) + ".", 
								customers[i].getId(), " ", 
								customers[i].getFirstName(),
								customers[i].getLastName(), 
								customers[i].getStreetName(), 
								customers[i].getPostalCode(), 
								customers[i].getPhone(),								
						        customers[i].getEmail());
			}

		System.out.println(TABLE_LINE_SEPARATOR);

	}
}


