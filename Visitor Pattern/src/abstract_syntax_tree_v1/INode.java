package abstract_syntax_tree_v1;

public interface INode {
	public abstract void accept(IVisitor Visitor);
}
