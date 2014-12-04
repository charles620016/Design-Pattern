package editor_application_v2;

public class CopyMenuItem extends MenuItem{
	private CopyCommand copyCommand;
	
	public void clicked(){
		copyCommand.execute();
	}
}
