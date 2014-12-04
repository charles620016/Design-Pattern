package editor_application_v1;

public class CutAction implements Action{
	private Document document;
	
	public CutAction(Document doc){
		this.document = doc;
	}
	
	@Override
	public void excute(){
		document.cut();
	}
}