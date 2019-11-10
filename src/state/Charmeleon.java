package state;

public class Charmeleon extends EvolutionState{
	
	private Charmeleon() {
		System.out.println("Your pokemon evolved into a "+this+"!");
	}

	private static final EvolutionState INSTANCE = new Charmeleon();
	
	public static EvolutionState getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println(this+" uses ember!");
		evolve(pokemon, Charizard.getInstance());
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println(this+" defends from incoming attacks with skillful grace!");
	}

	@Override
	public void recover(Pokemon pokemon) {
		System.out.println(this+" takes a moment to recover.");
	}

	public String toString() {
		return "Charmeleon";
	}
}
