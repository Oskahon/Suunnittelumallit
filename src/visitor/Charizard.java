package visitor;

public class Charizard extends EvolutionState{
	
	private Charizard() {
		System.out.println("Your pokemon evolved into a "+this+"!");
	}

	private static final EvolutionState INSTANCE = new Charizard();

	public static EvolutionState getInstance() {
		return INSTANCE;
	}

	@Override
	public void attack(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" uses flamethrower!");
	}

	@Override
	public void defend(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" isn't interested in defending, it attacks instead!");
		pokemon.attack();
	}

	@Override
	public void recover(Pokemon pokemon, Visitor evolver) {
		System.out.println(this+" isn't interested in recovering, it attacks instead!");
		pokemon.attack();
	}

	public String toString() {
		return "Charizard";
	}
}
