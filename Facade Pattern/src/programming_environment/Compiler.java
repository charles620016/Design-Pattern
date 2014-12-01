package programming_environment;

import java.io.InputStream;

public class Compiler {
    public void run(InputStream in) {
		BytecodeStream out;
        Scanner scanner = new Scanner(in);
        Parser parser = new Parser();
        ProgramNodeBuilder nodeBuilder = new ProgramNodeBuilder();
        
        parser.parse(scanner, nodeBuilder);
        
        CodeGenerator generator = new CodeGenerator();
        out = generator.byteCodeGenerate();
    }
}
