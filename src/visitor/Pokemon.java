package visitor;

public class Pokemon {
	
	private EvolutionState state;
	private Visitor evolver;
	private int experience;
	
	public Pokemon(Visitor evolver) {
		this.evolver = evolver;
		setExperience(0);
		state = Charmander.getInstance();
	}
	
	public void attack() {
		state.attack(this, evolver);
	}
	
	public void defend() {
		state.defend(this, evolver);
	}
	
	public void recover() {
		state.recover(this, evolver);
	}
	
	protected void evolve(EvolutionState s) {
		state = s;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void addExp(int exp) {
		this.experience+=exp;
	}
	
	public String getState() {
		return ""+state;
	}
}
