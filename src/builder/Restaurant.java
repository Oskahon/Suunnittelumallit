package builder;

public class Restaurant {
	private BurgerMaker burgerMaker;
	
	public void setBurgerMaker(BurgerMaker burgerMaker) {
		this.burgerMaker = burgerMaker;
	}
	public Object getBurger() {
		return burgerMaker.getBurger();
	}
	
	public void constructBurger() {
		burgerMaker.createNewBuger();
		burgerMaker.buildBun();
		burgerMaker.buildPatty();
		burgerMaker.buildCheese();
		burgerMaker.buildSauce();
	}
}
