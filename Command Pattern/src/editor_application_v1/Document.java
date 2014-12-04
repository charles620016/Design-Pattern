package editor_application_v1;

public class Document {
	private String text = null;
	
	public Document(String text){
		this.text = text;
	}
	
	public void cut(){
		System.out.print("Cut the text : " + text);
	}
	
	public void copy(){
		System.out.print("Copy the text : " + text);
	}
	
	public void paste(){
		System.out.print("Paste the text : " + text);
	}
}
