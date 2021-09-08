package test;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Song song = new Song();
//		song.setTitle("좋은날");
//		song.setArtist("Real");
//		song.setAlbum("이민수");
//		song.setComposer("아이유");
//		song.setYear(2010);
//		song.setTrack(3);
		
		Song song1 = new Song("좋은날", "아이유", "이민수", "Real", 2010, 3);
		song1.show();
		
		// 파라미터가 2개인 생성자 이용
		Song song2 = new Song("신호등", "이무진");
		song2.show();
		
	}

}
