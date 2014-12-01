package home_theater;

public class PopcornPopper {
	
	public static final boolean on = true;
	public static final boolean off = false;
	
	private boolean popperState = off;
	private int popcornTime = 5; // measure time by the minutes
	
	public void setTime(int popcornTime) { // You can set the popping time or not
		this.popcornTime = popcornTime;
	}
	
	public void poppingProcess(){ 
		int second = popcornTime*60; // convert minutes into seconds
		for(int i = 0; i < second; i++){
			//waiting the popping process
		}
		popperState = off;
	}
	
	public void turnOn(){
		if(popperState == off){
			popperState = on;
		}
	}
	public void turnOff(){
		if(popperState == on ){
			popperState = off;
		}
	}
	
	public boolean getPopperState(){
		return popperState;
	}
}
