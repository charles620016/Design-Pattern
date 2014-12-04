package editor_application_v2;

public class CutCommand extends Command{
	private Document doc;

	CutCommand(Document doc){
		this.doc = doc;
	}
	
	public void execute(){
		doc.cut();
	}
}
