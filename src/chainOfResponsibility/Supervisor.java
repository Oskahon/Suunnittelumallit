package chainOfResponsibility;

public class Supervisor extends Handler{

	private double percentage = 2;

	@Override
	public double getPercentage() {
		return percentage;
	}
	
	public String toString() {
		return "Your supervisor";
	}
}
