package rtf_converter_v1;

public interface Converter {
	public abstract void convertCharacter(char character);
	public abstract void convertFont();
	public abstract void convertParagraph();
}
