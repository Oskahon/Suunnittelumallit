package chainOfResponsibility;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Handler supervisor = new Supervisor();
		Handler chief = new Chief();
		Handler ceo = new CEO();
		
		supervisor.setSuccessor(chief);
		chief.setSuccessor(ceo);
		
		System.out.println("Enter the percentage for your payrise request.");
		Scanner in = new Scanner(System.in);
		
		try {
			supervisor.processRequest(new RiseRequest(in.nextDouble()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
