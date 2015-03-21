package document_editor_v1;

public class Character implements EmbeddedElement{
	private char character;
	private int x; 
	private int y;
	
	public Character(char character){
		this.character = character;
	}
	
	public void setLocationX(int x) {
		this.x = x;
    }

    public void setLocationY(int y) {
    	this.y = y;
	}
    
	@Override
	public void draw() {
		System.out.println("Draw the character : " + character +  " [" + x + "," + y + "]" );
	}
}
