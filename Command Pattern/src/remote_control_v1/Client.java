package remote_control_v1;

public class Client {
	public static void main(String args[]){
		RemoteController remoteController = new RemoteController();
		StereoSystem stereo = new StereoSystem();
		
		remoteController.switchOn(stereo);
	}
}
