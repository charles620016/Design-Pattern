package remote_control_v2;

public class Stereo {
	
	private boolean stereoState = false;
	private CDPlayer cdPlayer = new CDPlayer();
	private Volume volume = new Volume(); 
	
	public void turnOn(){
		if(!stereoState){
			stereoState = true;
		}
	}
	
	public void setCD(){
		cdPlayer.setCDPlayer();
		cdPlayer.turnOn();
	}
	
	public void setVolume(){
		volume.turnOn();
	}
	
	public boolean getStereoState(){
		return stereoState;
	}
}
