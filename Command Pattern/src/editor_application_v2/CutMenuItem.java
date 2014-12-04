package editor_application_v2;

public class CutMenuItem extends MenuItem{
	private CutCommand cutCommand;
	
	public void clicked(){
		cutCommand.execute();
	}
}
