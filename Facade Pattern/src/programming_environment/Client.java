package programming_environment;

import java.io.*;

public class Client {
	public static void main(String args[]){
		InputStream in = new InputStream() {
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		}; 
		
		Compiler compiler = new Compiler();
		
		compiler.run(in);
	}
}
