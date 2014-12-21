package abstract_syntax_tree_v1;

import java.util.ArrayList;
import java.util.Collection;

public class Program {
	private Collection<INode> col = new ArrayList<>();
	
	public void handleRequest(IVisitor visitor){
		for(INode n : col){
			n.accept(visitor);
		}
	}
	public void addElement(INode node){
		this.col.add(node);
	}
}
