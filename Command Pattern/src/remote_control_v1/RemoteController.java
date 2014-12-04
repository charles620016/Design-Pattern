package remote_control_v1;

public class RemoteController {
	
	public void switchOn(Machine machine){
		machine.turnOn();
	}
	
	public void SwitchOff(Machine machine){
		machine.turnOff();
	}
}
