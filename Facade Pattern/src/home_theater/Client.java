package home_theater;

public class Client {
	public static void main(String[] args) {
		String movieName = "The Lord of the Ring";
		
		HomeTheater homeTheater = new HomeTheater(movieName);
		homeTheater.watchMovie();
		homeTheater.endMovie();
	}
}
