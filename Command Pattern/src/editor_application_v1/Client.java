package editor_application_v1;

public class Client {
	public static void main(String args[]){
		Document doc = new Document("test");
		MenuBar menu = new MenuBar();
		
		menu.clickCut(new CutAction(doc));
	}
}
