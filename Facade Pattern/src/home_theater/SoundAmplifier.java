package home_theater;

public class SoundAmplifier {
	public static final boolean on = true;
	public static final boolean off = false;
	
	private boolean ampliferState = off;
	private int volume = 50; // 0%~100%  
	
	public void turnOn(){
		if(ampliferState = off){
			ampliferState = on;
		}
	}
	
	public void turnOff(){
		if(ampliferState = on){
			ampliferState = off;
		}
	}
	
	public void setDvdPlayer(DvdPlayer dvdPlayer){ // Knowing which player the amplifer connect to 
		System.out.println("Setting player : " + dvdPlayer);
	}
	
	public void adjustVolume(int volume){
		this.volume = volume;
	}
	
	public boolean getAmpliferState(){
		return ampliferState;
	}
	
	public int getVolume(){
		return volume;
	}
}
