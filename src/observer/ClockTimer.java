package observer;

import java.time.LocalDateTime;
import java.util.Observable;

public class ClockTimer extends Observable{
	
	private LocalDateTime currentTime;

	public int getHour() {
		return currentTime.getHour();
	}
	public int getMinute() {
		return currentTime.getMinute();
	}
	public int getSecond() {
		return currentTime.getSecond();
	}

	public void tick() {
		while (true) {
			currentTime = LocalDateTime.now();	
			setChanged();
			notifyObservers();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error");
			}
		}
	}
}
