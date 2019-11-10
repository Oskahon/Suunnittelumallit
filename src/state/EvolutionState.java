package state;

public abstract class EvolutionState {
	public abstract void attack(Pokemon pokemon);
	public abstract void defend(Pokemon pokemon);
	public abstract void recover(Pokemon pokemon);
	public void evolve(Pokemon pokemon, EvolutionState evolutionState) {
		pokemon.evolve(evolutionState);
	}
}
