package visitor;

public interface Visitor {
	public void visit(Charmander state, Pokemon pokemon);
	public void visit(Charmeleon state, Pokemon pokemon);
}
