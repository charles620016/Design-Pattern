package rtf_converter_v1;

public class Document {
	
	private String text;
	private int count;
	
	public Document(String s){
		text = s;
	}
	
	public char getNextToken(){
		return text.charAt(count);
	}
}
