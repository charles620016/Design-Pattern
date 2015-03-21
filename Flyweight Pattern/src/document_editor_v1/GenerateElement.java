package document_editor_v1;

import java.util.HashMap;
import java.util.Map;

public class GenerateElement {
	private Map<String, EmbeddedElement> characterPool = new HashMap<>();
	private Map<String, EmbeddedElement> rowPool = new HashMap<>();
	private int coulumnPool = 0;
	
	//檢查是否已經出現過此字元
	public EmbeddedElement createCharacter(char c){
		if(!characterPool.containsKey(c)){
			characterPool.put(c + "", new Character(c));
		}
		return characterPool.get(c + "");
	}
	
	//檢查所要增加row的地方，是否已經有了
	public EmbeddedElement createRow(int i){
		if(!rowPool.containsKey(i)){
			rowPool.put(Integer.toString(i), new Row(i));
		}
		return rowPool.get(Integer.toString(i));
	}
	
	//增加page
	public EmbeddedElement createColumn(){
		coulumnPool++;
		return new Column(coulumnPool);
	}
}
