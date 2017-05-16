/**
 * 
 */
package a00985171.io;

/**
 * @author bruna
 *
 */
public interface FileManager {
	
	/**
	 * @param path - the directory where the file is located
	 * @param fileName - the name of the file to be saved
	 */
	void save(String path, String fileName);
	
	/**
	 * @param path - the directory where the file is located
	 * @param fileName - the name of the file to be deleted
	 */
	void delete(String path, String fileName);
}
