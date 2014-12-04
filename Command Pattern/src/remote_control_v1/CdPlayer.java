package remote_control_v1;

public class CdPlayer {
	private boolean state = false;
	
	public void setCdPlayer(String nowPlaying){
		if(state){
			System.out.println("Now playing is " + nowPlaying);
		}
	}
	
	public void turnOn(){
		state = true;
	}
	
	public void turnOff(){
		state = false;
	}
	
	public boolean getState(){
		return state;
	}
	
}
