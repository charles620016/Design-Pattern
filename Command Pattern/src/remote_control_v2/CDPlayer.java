package remote_control_v2;

public class CDPlayer {
	private boolean state = false;
	
	public void setCDPlayer(){
		if(state){
			System.out.println("CDPlayer is ready!");
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
