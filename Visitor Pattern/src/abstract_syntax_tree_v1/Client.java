package abstract_syntax_tree_v1;


public class Client {
	public static void main(String args[]){
		Program program = new Program();
		INode node1 = new VarRefNode();
		IVisitor visitor1 = new CodeGeneratingVisitor();
		
		program.addElement(node1);
		program.handleRequest(visitor1);
	}
}
