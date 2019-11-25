package visitor;

public class Evolver implements Visitor{

	private int exp;
	
	@Override
	public void visit(Charmander state, Pokemon pokemon) {
		exp = pokemon.getExperience();
		if (exp>10) {
			pokemon.evolve(Charmeleon.getInstance());
		}
	}

	@Override
	public void visit(Charmeleon state, Pokemon pokemon) {
		exp = pokemon.getExperience();
		if (exp>25) {
			pokemon.evolve(Charizard.getInstance());
		}
	}

}
