package decorator;

public class Ham extends Filling{

	private double price = 2;

	public Ham(Pizza pizzaBase) {
		super(pizzaBase);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+getFillingPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"\nHam "+getFillingPrice()+"e";
	}
	
	private double getFillingPrice() {
		return price;
	}
}
