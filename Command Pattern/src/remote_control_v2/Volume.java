package remote_control_v2;

public class Volume {
	private int volumeLevel = 0;
	
	Volume(){
		volumeLevel = 40;
	}
	
	public void turnOn(){
		System.out.println("The volume now is " + volumeLevel);
	}
	
	public void turnOff(){
		volumeLevel = 0;
		System.out.println("Mute mode");
	}
	public void setVolume(int volumeLevel){
		this.volumeLevel = volumeLevel;
		System.out.println("The volume now is " + volumeLevel);
	}
	
	public int getVolumeLevel(){
		return volumeLevel;
	}
}
