package document_editor_v1;

public class Column implements EmbeddedElement{
	
	private int columnNumber;
	
	Column(int columnNumber){
		this.columnNumber = columnNumber;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw the column : " + columnNumber); 
	}
}
