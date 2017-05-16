/**
 * 
 */
package a00985171.data.util;

/**
 * @author bruna
 *
 */

public class Validator {
	static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	static final String INT_REGEX = "^\\d+$";

	public static boolean validate_email(String emailStr) {
		return emailStr.matches(EMAIL_REGEX);
	}

	public static int validate_id(String id) {
		if (id.matches(INT_REGEX)) {
			return Integer.parseInt(id);
		} else {
			System.err.println("Id in the list of players must be integer");
			System.exit(-1);
		}
		return 0;
	}

	public static void validate_args(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage java -jar A00123456Lab2.jar <input string>");
			System.exit(-1);
		}

	}

}
