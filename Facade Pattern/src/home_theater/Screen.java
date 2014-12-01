package home_theater;

public class Screen {
	
	public static final boolean up = false;
	public static final boolean down = true;
	
	private boolean screenState = up;

	public void screenUp(){
		if(screenState == down){
			screenState = up;
		}
	}
	
	public void screenDown(){
		if(screenState == up){
			screenState = down;
		}
	}
	
	public boolean getLightState(){
		return screenState;
	}
}
