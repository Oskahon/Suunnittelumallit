package visitor;

public class Charmeleon extends EvolutionState{
	
	private Charmeleon() {
		System.out.println("Your pokemon evolved into a "+this+"!");
	}

	private static final EvolutionState INSTANCE = new Charmeleon();
	
	public static EvolutionState getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void attack(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" uses ember!");
		pokemon.addExp(15);
		evolver.visit(this, pokemon);
	}

	@Override
	public void defend(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" defends from incoming attacks with skillful grace!");
		pokemon.addExp(10);
		evolver.visit(this, pokemon);
	}

	@Override
	public void recover(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" takes a moment to recover.");
		pokemon.addExp(5);
		evolver.visit(this, pokemon);
	}

	public String toString() {
		return "Charmeleon";
	}
}
