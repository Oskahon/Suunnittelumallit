package decorator;

public class Tuna extends Filling{

	private double price = 2;

	public Tuna(Pizza pizzaBase) {
		super(pizzaBase);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+getFillingPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"\nTuna "+getFillingPrice()+"e";
	}
	
	private double getFillingPrice() {
		return price;
	}
}
