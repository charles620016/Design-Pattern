package remote_control_v2;

public class Client {
	public static void main(String args[]){
		RemoteController remotecontroller = new RemoteController();
		Stereo stereo = new Stereo();
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		
		remotecontroller.setCommand(stereoOnCommand);
		remotecontroller.doCommand(0);
	}
}
