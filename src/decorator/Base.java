package decorator;

public class Base implements Pizza {

	private double price = 5;
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return "Pizza base "+getPrice()+"e";
	}

}
