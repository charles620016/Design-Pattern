package home_theater;

public class DvdPlayer {

	public static final boolean on = true;
	public static final boolean off = false;
	
	private boolean playerState = off;
	
	public void turnOn(){
		if(playerState = off){
			playerState = on;
		}
	}
	
	public void turnOff(){
		if(playerState = on){
			playerState = off;
		}
	}
	
	public void setMoive(String movieName){
		System.out.println("The movie in this DVD Player is : " + movieName);
	}
	
	public void startPlaying(){
		playerState = on;
		System.out.println("Start playing the movie!" );
	}
	
	public void stopPlaying(){
		playerState = off;
		System.out.println("Stop playing the movie!");
	}
	
	public boolean getDvdPlayerState(){
		return playerState;
	}
}
