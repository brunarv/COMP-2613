/**
 * 
 */
package a00985171.data.music;

import a00985171.data.MusicMedia;

/**
 * @author bruna
 *
 */
public class VinylRecordAlbum extends MusicMedia{

    int numberOfTrack;
    int weight;
    public static final int STANDARD_WEIGHT=120;
    
	public VinylRecordAlbum(){
		
	}
	
	/**
	 * @param numberOfTrack
	 */
	public VinylRecordAlbum(String title, String artist, int numberOfTrack) {
		super(title, artist);
		this.numberOfTrack = numberOfTrack;
	}

	public VinylRecordAlbum(String title, String artist, int numberOfTrack, int weight) {
		super(title, artist);
		this.numberOfTrack = numberOfTrack;
		this.weight = weight;
	}

	/**
	 * @return the numberOfTrack
	 */
	public int getNumberOfTrack() {
		return numberOfTrack;
	}

	/**
	 * @param numberOfTrack the numberOfTrack to set
	 */
	public void setNumberOfTrack(int numberOfTrack) {
		this.numberOfTrack = numberOfTrack;
	}

	/**
	 * @return the standardWeight
	 */
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight){
		if(weight >= STANDARD_WEIGHT){
			this.weight = 2;
		}
		else {
			this.weight = 0;
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VinylRecordAlbum [numberOfTrack=" + numberOfTrack + ", weight=" + weight + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
