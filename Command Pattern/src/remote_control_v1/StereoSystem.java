package remote_control_v1;

public class StereoSystem implements Machine{
	
	private boolean state = false;
	private CdPlayer cdPlayer = new CdPlayer();
	private Volume volume = new Volume(); 
	
	public void turnOn(){
		state = true;
		cdPlayer.turnOn();
		volume.turnOn();
	}
	
	public void turnOff(){
		state = false;
		cdPlayer.turnOff();
		volume.turnOff();
	}
	
	public boolean getState(){
		return state;
	}
}
