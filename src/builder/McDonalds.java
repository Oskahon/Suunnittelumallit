package builder;

import java.util.ArrayList;
import java.util.List;

public class McDonalds extends BurgerMaker{
	
	List<Filling> burger;

	@Override
	public void buildBun() {
		burger.add(new McBun());
	}

	@Override
	public void buildPatty() {
		burger.add(new McPatty());		
	}

	@Override
	public void buildCheese() {
		burger.add(new McCheese());		
	}

	@Override
	public void buildSauce() {
		burger.add(new McSauce());		
	}

	@Override
	public Object getBurger() {
		return burger;
	}
	
	@Override
	public void createNewBuger() {
		burger = new ArrayList<>();		
	}

}
