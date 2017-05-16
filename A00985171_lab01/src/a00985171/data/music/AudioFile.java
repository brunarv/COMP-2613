/**
 * 
 */
package a00985171.data.music;
import a00985171.data.MusicMedia;
import a00985171.io.FileManager;

/**
 * @author bruna
 *
 */
public class AudioFile extends MusicMedia implements FileManager{
		
    String fileName;
    double fileSize;
	
	public AudioFile(){
		
	}

	/**
	 * @param title - the title to set
	 * @param artist - the artist to set
	 * @param fileName - the fileName to set
	 * @param fileSize - the fileSize to set
	 */
	public AudioFile(String title, String artist, String fileName, double fileSize) {
		super(title, artist);
		this.fileName = fileName;
		this.fileSize = fileSize;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileSize
	 */
	public double getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public void play(){
		System.out.println("Playing" + " " + getFileName()+ ".");
	}
	

	@Override
	public void save(String path, String fileName) {
		System.out.println("Saving " + getFileName() + " to" +  " 'C:/My Music/iTunes' " + "folder.");
	}

	@Override
	public void delete(String path, String fileName) {
		System.out.println("Deliting " + getFileName() + "from" +  " 'C:/My Music/iTunes' " + "folder.");	
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AudioFile [fileName=" + fileName + ", fileSize=" + fileSize + ", toString()=" + super.toString() + "]";
	}



}
