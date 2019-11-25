package builder;

public class Hesburger extends BurgerMaker{
	
	StringBuilder burger;

	@Override
	public void buildBun() {
		burger.append("regular bun");
	}

	@Override
	public void buildPatty() {
		burger.append(", beef patty");		
	}

	@Override
	public void buildCheese() {
		burger.append(", cheddar cheese");		
	}

	@Override
	public void buildSauce() {
		burger.append(", ketchup");		
	}

	@Override
	public Object getBurger() {
		return burger;
	}

	@Override
	public void createNewBuger() {
		burger = new StringBuilder("Burger with ");
	}
}
