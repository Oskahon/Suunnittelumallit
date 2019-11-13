package template;

import java.util.Random;

public class DiceGame extends Game{
	
	private DiceGame() {};
	
	Random rand;
	int[] rolls;
	int plays;
	int highestRoller;
	int ties;
	
	private static final Game INSTANCE = new DiceGame();
	
	public static Game getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void initializeGame() {
		rand = new Random();
		rolls = new int[super.playersCount];
		highestRoller = 0;
		ties = 0;
	}

	@Override
	public void makePlay(int player) {
		rolls[player] = rand.nextInt(10)+1;
		plays++;
		System.out.println("player "+(player+1)+": "+rolls[player]);
	}

	@Override
	public boolean endOfGame() {
		if (plays == super.playersCount) {
			int highroll = 0;
			for (int i = 0; i < super.playersCount;i++) {
				if (rolls[i]>highroll) {
					highroll = rolls[i];
					highestRoller = i+1;
				} else if (rolls[i] == highroll) {
					ties++;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public void printWinner() {
		if (ties == 0) {
		System.out.println("The winner is player "+highestRoller+"!");
		} else {
			System.out.println("It's a tie!");
		}
	}

}
