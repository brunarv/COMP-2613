/**
 * 
 */
package a00985171.data.music;

import a00985171.data.MusicMedia;

/**
 * @author bruna
 *
 */
public class CompactDisk extends MusicMedia {
	
    int numberOfTracks;
	
	public CompactDisk(){
		
	}

	/**
	 * @param title - to set the title
	 * @param artist - to set the artist
	 * @param numberOfTracks - to set the numberOfTracks
	 */
	public CompactDisk(String title, String artist, int numberOfTracks) {
		super(title, artist);
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks the numberOfTracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public void play(){
		//System.out.println("Playing" + " " + AudioFile.this.getFileName() + ".");
		System.out.println("Playing" + " " + "getFileName()" + ".");
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompactDisk [numberOfTracks=" + numberOfTracks + ", toString()=" + super.toString() + "]";
	}

	

}
