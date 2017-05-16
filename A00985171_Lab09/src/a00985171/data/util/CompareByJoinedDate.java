/**
 * Project: Lab9
 * File: CompareByJoinedDate.java
 * @author Bruna Vieira, A00985171
 * 
 */
package a00985171.data.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import a00985171.data.Customer;

public class CompareByJoinedDate {

	/**
	 * Sorting Customers list using Bubble Sort algorithm
	 * 
	 * @param customersList
	 * @return ArrayList<Customer> in ascending order
	 * @throws ApplicationException
	 */
	public static ArrayList<Customer> sortByJoinedDate(ArrayList<Customer> customersList) throws ApplicationException {

		boolean flag = true;
		Customer temp;

		while (flag) {
			flag = false;
			for (int j = 0; j < customersList.size() - 1; j++) {
				if (compareByDate(customersList.get(j), customersList.get(j + 1)) > 0) // change to < for descending sort
				{
					temp = customersList.get(j);
					customersList.set(j, customersList.get(j + 1));
					customersList.set(j + 1, temp);
					flag = true;
				}
			}
		}

		return customersList;
	}

	private static int compareByDate(Customer obj1, Customer obj2) throws ApplicationException {

		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd uuuu");
		Date date1 = new Date();
		Date date2 = new Date();

		try {
			date1 = sdf.parse(obj1.getDate());
			date2 = sdf.parse(obj2.getDate());
		} catch (ParseException e) {
			throw new ApplicationException(e.getMessage());
		}

		return date1.compareTo(date2);
	}

}
