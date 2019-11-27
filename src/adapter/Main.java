package adapter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		IText low = new ToLowerCase();
		IText up = new ToUpperCase();
		String input;
		Scanner in = new Scanner(System.in);

		boolean running = true;
		while (running) {

			System.out.println("1. Uppercase \n"
					+ "2. Lowercase \n"
					+ "3. Quit");
			input = in.nextLine();


			switch(input) {

			case "1":
				System.out.println("Enter text.");
				input = in.nextLine();
				System.out.println(up.changeTextSize(input));
				break;
			case "2":
				System.out.println("Enter text.");
				input = in.nextLine();
				System.out.println(low.changeTextSize(input));
				break;
			case "3":
				running = false;
				break;
			default:
				break;

			}

		}


	}

}
