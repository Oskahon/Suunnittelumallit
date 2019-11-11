package decorator;

public class TomatoSauce extends Filling{
	
	private double price = 1;

	public TomatoSauce(Pizza pizzaBase) {
		super(pizzaBase);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+getFillingPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"\nTomatosauce "+getFillingPrice()+"e";
	}
	
	private double getFillingPrice() {
		return price;
	}
	
}
