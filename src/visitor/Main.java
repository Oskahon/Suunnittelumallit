package visitor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Visitor evolver = new Evolver();
		Pokemon pokemon = new Pokemon(evolver);
		Scanner in = new Scanner(System.in);
		String input;
		boolean running = true;

		while (running == true) {
			System.out.println("What do you want to do?");
			System.out.println("1. Attack");
			System.out.println("2. Defend");
			System.out.println("3. Recover");
			System.out.println("4. Quit");
			
			input = in.nextLine();

			switch(input) {
			case "1":
				pokemon.attack();
				break;
			case "2":
				pokemon.defend();
				break;
			case "3":
				pokemon.recover();
				break;
			case "4":
				running = false;
				break;
			}
		}

	}

}
