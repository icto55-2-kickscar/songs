package songs;

public class SongApp {

	public static void main(String[] args) {
		
//		Song song = new Song();
//		song.setTitle( "좋은날" );
//		song.setAlbum( "Real" );
//		song.setArtist( "아이유" );
//		song.setComposer( "이민수" );
//		song.setTrack( 3 );
//		song.setYear( 2010 );
	
Song song1 = new Song( "좋은날", "Real", "아이유", "이민수", 3, 2010 );		
Song song2 = new Song( "러빙유", "씨스타" );
Song song3 = new Song( "여수 밤바다", "버스커 버스커" );          		

song1.show();
song2.show();
song3.show();
		
		
	}
}
