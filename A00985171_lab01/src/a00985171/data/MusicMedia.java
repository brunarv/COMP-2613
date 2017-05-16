/**
 * 
 */
package a00985171.data;

/**
 * @author bruna
 *
 */
public abstract class MusicMedia {
	String title;
	String artist;
	
	/*
	 * Default constructor
	 */
	
	public MusicMedia(){
		
	}

	/**
	 * @param title - used to set the title field
	 * @param artist - used to set the artist field
	 */
	public MusicMedia(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	public abstract void play();

	/**
	 * @return the title as a String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artist as a String
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MusicMedia [title=" + title + ", artist=" + artist + "]";
	}

	
}
