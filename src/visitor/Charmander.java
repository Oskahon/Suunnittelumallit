package visitor;

public class Charmander extends EvolutionState{

	private Charmander() {
	}
	
	private static final EvolutionState INSTANCE = new Charmander();
	
	public static EvolutionState getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void attack(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" uses claw!");
		pokemon.addExp(10);
		evolver.visit(this, pokemon);
	}

	@Override
	public void defend(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" tries to defend, but fails horribly!");	
		pokemon.addExp(5);
		evolver.visit(this, pokemon);
	}

	@Override
	public void recover(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" falls asleep to recover.");
		pokemon.addExp(2);
		evolver.visit(this, pokemon);
	}
	
	public String toString() {
		return "Charmander";
	}

}
