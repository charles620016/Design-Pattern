package home_theater;

public class HomeTheater {
	private SoundAmplifier amplifer = new SoundAmplifier();
	private DvdPlayer dvdPlayer = new DvdPlayer();
	private Projector projector = new Projector();
	private TheaterLights lights = new TheaterLights();
	private Screen screen = new Screen();
	private PopcornPopper popper = new PopcornPopper();
	private String movieName;
	
	
	HomeTheater(String movieName){
		this.movieName = movieName;
	}
	
	public void watchMovie(){
		System.out.println("Welcome!Let's watch the movie " + movieName);
		popper.turnOn();
		popper.poppingProcess(); //It will stop when popping process is finished.
		lights.adjustLightness(70);
		screen.screenDown();
		projector.turnOn();
		amplifer.turnOn();
		amplifer.setDvdPlayer(dvdPlayer);
		dvdPlayer.turnOn();
		dvdPlayer.setMoive(movieName);
		dvdPlayer.startPlaying();	
	}
	
	public void endMovie(){
		System.out.println("The movie" + movieName +"was over.");
		lights.turnOff();
		screen.screenUp();
		projector.turnOff();
		amplifer.turnOff();
		dvdplayer.turnOff();
	}
}
