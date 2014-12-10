package rtf_converter_v1;

public class RTFReader{
	private Converter converter = null;
	private Document doc =null;
	
	public RTFReader(Document doc) {
		this.doc = doc;
	}
	
	public void setConvert(Converter converter){
		this.converter = converter;
	}
	
	public void parseRTF(){
		
	}
}
