package abstract_syntax_tree_v1;

public interface IVisitor{
	public abstract void visit(AssignmentNode assignmentNode);
	public abstract void visit(VarRefNode varRefNode);
	public abstract void visit(ArithExpNode arithExpNode);
}
