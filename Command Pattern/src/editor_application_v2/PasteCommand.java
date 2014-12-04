package editor_application_v2;

public class PasteCommand extends Command{
	private Document doc;

	PasteCommand(Document doc){
		this.doc = doc;
	}
	
	public void execute(){
		doc.paste();
	}
}
