/**
 * 
 */
package a00985171;
import a00985171.data.music.AudioFile;
import a00985171.data.music.CompactDisk;
import a00985171.data.music.VinylRecordAlbum;

/**
 * @author bruna
 *
 */
public class Lab1{

	/**
	 * @param args -  not used in this application
	 */
	public static void main(String[] args) {
	
		
		new Lab1().test();
		
	}

	private void test() {
		//create Audio
		System.out.println("> create, play, and delete an audio file....");
		AudioFile audio =  new AudioFile("title1", "artist1","file1.mp3", 3.5);
		System.out.println(audio);
		audio.play();
		audio.save(null, null);
		audio.delete(null, null);
		
		//create CompactDisk
		System.out.println(" ");
		System.out.println("> ccreate and play a compact disk.....");
		CompactDisk disk =  new CompactDisk("title2", "artist2",12);
		System.out.println(disk);
		disk.play();
		
		//create Vinyl
		System.out.println(" ");
		System.out.println("> create a vinyl record and test weight validation...");
		VinylRecordAlbum vinyl =  new VinylRecordAlbum("title3", "artist3", 12, 5);
		VinylRecordAlbum vinyl2 =  new VinylRecordAlbum("title2", "artist2", 13, 130);
		System.out.println(vinyl);
		System.out.println(vinyl2);

	}
}
