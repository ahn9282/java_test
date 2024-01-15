package java_study0109;

public class study0109_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA", 1978,"스웨덴");
		song.show();
		Song ssong = new Song();
		ssong.title = "애국가";
		ssong.artist = "안준섭";
		ssong.year = 1997;
		ssong.country = "대한민국";
		ssong.show();
				
	}

}
class Song{
	String title;
	String artist;
	int year;
	String country;
	public Song() {
	}
	public  Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

