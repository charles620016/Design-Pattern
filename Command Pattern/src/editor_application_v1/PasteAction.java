package editor_application_v1;

public class PasteAction implements Action{
	private Document document;
	public PasteAction(Document doc){
		this.document = doc;
	}
	
	@Override
	public void excute(){
		document.paste();
	}
}
