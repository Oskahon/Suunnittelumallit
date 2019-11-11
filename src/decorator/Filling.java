package decorator;

public class Filling implements Pizza {

	private Pizza pizzaBase;
	
	public Filling(Pizza pizzaBase) {
		this.pizzaBase = pizzaBase;
	}
	
	@Override
	public double getPrice() {
		return pizzaBase.getPrice();
	}

	@Override
	public String getDescription() {
		return pizzaBase.getDescription();
	}

}
