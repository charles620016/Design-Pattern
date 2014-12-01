package home_theater;

public class TheaterLights {
	
	public static final boolean on = true;
	public static final boolean off = false;
	
	private boolean lightState = off;
	private int lightness = 50; // lightness(0%~100%)
	
	public void turnOn(){
		if(lightState = off){
			lightState = on;
		}
	}
	
	public void turnOff(){
		if(lightState = on){
			lightState = off;
		}
	}
	
	public void adjustLightness(int lightness){
		this.lightness = lightness;
		System.out.println("The lightness of screen now is " + lightness);
	}
	
	public int getLightness(){
		return lightness;
	}	
	
	public boolean getLightState(){
		return lightState;
	}
}
