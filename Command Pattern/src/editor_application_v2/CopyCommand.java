package editor_application_v2;

public class CopyCommand extends Command{
	private Document doc;

	CopyCommand(Document doc){
		this.doc = doc;
	}
	
	public void execute(){
		doc.copy();
	}
}
