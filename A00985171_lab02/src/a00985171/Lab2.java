/**
 * 
 */
package a00985171;

import a00985171.data.util.Validator;
import a00985171.io.CustomerReader;
import a00985171.io.CustomerReport;

/**
 * @author bruna
 *
 */
public class Lab2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Validator.validate_args(args);
	
		CustomerReport.displayPlayers(CustomerReader.populateCustomer(args[0]));

		System.exit(0);
	}

}
