/**
 * Project: Lab9
 * File: CustomerReader.java
 * @author Bruna Vieira, A00985171
 * 
 */

package a00985171.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import a00985171.data.Customer;
import a00985171.data.util.ApplicationException;
import a00985171.data.util.CompareByJoinedDate;
import a00985171.data.util.Validator;

public class CustomerReader {

	public static final String RECORD_DELIMITER = ":";
	public static final String FIELD_DELIMITER = "\\|";

	/**
	 * This method split unformatted input string
	 * 
	 * @param input
	 *            input string
	 * @return Customers list
	 * @throws ApplicationException
	 */
	public ArrayList<Customer> splitDataAndCreateCustomersList() throws ApplicationException {

		ArrayList<String> unFormattedArrayOfCustomers = readFile();
		ArrayList<Customer> customersList = new ArrayList<>();
		Customer newCustomer;

		for (int i = 0; i < unFormattedArrayOfCustomers.size(); i++) {
			String[] customerInformation = unFormattedArrayOfCustomers.get(i).split(FIELD_DELIMITER);
			Validator.isAppropriateNumberOfFieldsForRecord(customerInformation);

			newCustomer = new Customer.Builder(Integer.parseInt(customerInformation[0]), Validator.validatePhoneNumber(customerInformation[6]))
					.firstName(customerInformation[1]).lastName(customerInformation[2]).streetName(customerInformation[3])
					.city(customerInformation[4]).postalCode(Validator.validatePostalCode(customerInformation[5]))
					.email(Validator.validateEmail(customerInformation[7])).date(Validator.validateDateTime(customerInformation[8])).build();

			customersList.add(newCustomer);

		}

		return customersList;
	}

	/**
	 * This method split unformatted input string
	 * 
	 * @return Customers list sorted by joined date in ascending order
	 * @throws ApplicationException
	 */
	public ArrayList<Customer> splitDataAndCreateCustomersListSortedByJoinedDate() throws ApplicationException {
		return CompareByJoinedDate.sortByJoinedDate(splitDataAndCreateCustomersList());
	}

	private ArrayList<String> readFile() throws ApplicationException {

		ArrayList<String> listOfCustomersLines = new ArrayList<>();

		File sourceFile = new File("customers.txt");
		if (!sourceFile.exists()) {
			throw new ApplicationException("File customers.txt not exist");
		}

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(sourceFile));
			String line = br.readLine(); // Skipping the first line
			while ((line = br.readLine()) != null) {
				listOfCustomersLines.add(line);
			}
			br.close();
		} catch (IOException e) {
			throw new ApplicationException(e.getCause());
		}

		return listOfCustomersLines;
	}

}
