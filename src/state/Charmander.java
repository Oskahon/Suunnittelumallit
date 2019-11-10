package state;

public class Charmander extends EvolutionState{

	private Charmander() {
	}
	
	private static final EvolutionState INSTANCE = new Charmander();
	
	public static EvolutionState getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println(this+" uses claw!");
		evolve(pokemon, Charmeleon.getInstance());
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println(this+" tries to defend, but fails horribly!");	
	}

	@Override
	public void recover(Pokemon pokemon) {
		System.out.println(this+" falls asleep to recover.");
	}
	
	public String toString() {
		return "Charmander";
	}

}
