package home_theater;

public class Projector {
	
	public static final boolean on = true;
	public static final boolean off = false;
	
	private boolean projectorState = off;
	
	public void turnOn(){
		if(projectorState = off){
			projectorState = on;
		}
	}
	
	public void turnOff(){
		if(projectorState = on){
			projectorState = off;
		}
	}
	
	public boolean getprojectorState(){
		return projectorState;
	}
}
