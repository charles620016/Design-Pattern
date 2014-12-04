package remote_control_v2;

public class StereoOnCommand implements Command{
	private Stereo stereo = null;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	public void execute(){
		stereo.turnOn();
		stereo.setCD();
		stereo.setVolume();
	}	
}
