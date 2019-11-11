package decorator;

public class Main {

	public static void main(String[] args) {

		Pizza margarita = new Cheese(new TomatoSauce(new Base()));
		System.out.println("Pizza margarita");
		System.out.println(margarita.getDescription());
		System.out.println("Total: "+margarita.getPrice()+"\n");
		
		Pizza hamPizza = new Ham(new Cheese(new TomatoSauce(new Base())));
		System.out.println("Ham pizza");
		System.out.println(hamPizza.getDescription());
		System.out.println("Total: "+hamPizza.getPrice()+"\n");
		
		Pizza opera = new Tuna(new Ham(new Cheese(new TomatoSauce(new Base()))));
		System.out.println("Pizza opera");
		System.out.println(opera.getDescription());
		System.out.println("Total: "+opera.getPrice());
		
	}

}
