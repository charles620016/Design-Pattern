package document_editor_v1;

import java.util.Random;

public class DocumentEditor {
	public static void main(String arg[]){
		
		GenerateElement generateElement = new GenerateElement();
		
		// 創建新頁面
		generateElement.createColumn().draw(); 
		
		// 在此頁面的某的地方創建一個row，假設可以大小為30個row
		Random random = new Random();
		int rowNumber = random.nextInt(30);
		generateElement.createRow(rowNumber).draw();
		
		//在此row創建一些文字
		for(int i = 0; i < 10; i++){
			char character = (char)(random.nextInt(65) + '0'); //0123....ABC....xyz
			Character c = (Character) generateElement.createCharacter(character);
			c.setLocationX(random.nextInt(20)); //假設一行可以塞20個字
			c.setLocationY(random.nextInt(2)); // 這個row有兩行
			c.draw();
		}
	}
}
