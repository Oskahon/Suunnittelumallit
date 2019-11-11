package decorator;

public class Cheese extends Filling{

	private double price = 1;

	public Cheese(Pizza pizzaBase) {
		super(pizzaBase);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+getFillingPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"\nCheese "+getFillingPrice()+"e";
	}
	
	private double getFillingPrice() {
		return price;
	}
	
}
