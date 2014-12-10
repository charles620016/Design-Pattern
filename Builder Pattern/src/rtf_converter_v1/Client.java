package rtf_converter_v1;

public class Client {
	public static void main(String args[]){
		Document doc = new Document("Test");
		RTFReader rtfReader = new RTFReader(doc);
		TeXConverter texConverter = new TeXConverter();
		
		rtfReader.setConvert(texConverter);
		rtfReader.parseRTF();
	}
}
