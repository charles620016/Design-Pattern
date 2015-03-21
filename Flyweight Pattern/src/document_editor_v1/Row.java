package document_editor_v1;

public class Row implements EmbeddedElement{
	
	private int rowNumber;
	
	Row(int rowNumber){
		this.rowNumber = rowNumber;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw the row : " + rowNumber); 
	}
}
