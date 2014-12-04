package editor_application_v2;

public class PasteMenuItem extends MenuItem{
	private PasteCommand pasteCommand;
	
	public void clicked(){
		pasteCommand.execute();
	}
}
