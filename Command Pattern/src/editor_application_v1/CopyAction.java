package editor_application_v1;

public class CopyAction implements Action{
	private Document document;
	public CopyAction(Document doc){
		this.document = doc;
	}
	
	@Override
	public void excute(){
		document.copy();
	}
	
}
