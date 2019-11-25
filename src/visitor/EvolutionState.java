package visitor;

public abstract class EvolutionState {
	public abstract void attack(Pokemon pokemon, Visitor evolver);
	public abstract void defend(Pokemon pokemon, Visitor evolver);
	public abstract void recover(Pokemon pokemon, Visitor evolver);
	public void evolve(Pokemon pokemon, EvolutionState evolutionState) {
		pokemon.evolve(evolutionState);
	}
}
