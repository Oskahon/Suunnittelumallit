package template;

public class Main {

	public static void main(String[] args) {

		Game diceGame = DiceGame.getInstance();
		
		diceGame.playOneGame(4);
		
	}

}
