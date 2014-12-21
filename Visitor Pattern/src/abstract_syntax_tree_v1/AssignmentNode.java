package abstract_syntax_tree_v1;

public class AssignmentNode implements INode{
	@Override
	public void accept(IVisitor Visitor){
		Visitor.visit(this);
	}
}
