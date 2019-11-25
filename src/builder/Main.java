package builder;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		BurgerMaker hesburger = new Hesburger();
		BurgerMaker mcDonalds = new McDonalds();
		
		restaurant.setBurgerMaker(hesburger);
		restaurant.constructBurger();
		System.out.println(restaurant.getBurger());
		System.out.println();
		
		restaurant.setBurgerMaker(mcDonalds);
		restaurant.constructBurger();
		System.out.println(restaurant.getBurger());
	}

}
