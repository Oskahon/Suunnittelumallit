package state;

public class Pokemon {
	
	private EvolutionState state;
	
	public Pokemon() {
		state = Charmander.getInstance();
	}
	
	public void attack() {
		state.attack(this);
	}
	
	public void defend() {
		state.defend(this);
	}
	
	public void recover() {
		state.recover(this);
	}
	
	protected void evolve(EvolutionState s) {
		state = s;
	}
}
