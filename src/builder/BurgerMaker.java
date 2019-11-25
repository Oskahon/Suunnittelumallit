package builder;

public abstract class BurgerMaker {
	public abstract void createNewBuger();
	public abstract void buildBun();
	public abstract void buildPatty();
	public abstract void buildCheese();
	public abstract void buildSauce();
	public abstract Object getBurger();
}
