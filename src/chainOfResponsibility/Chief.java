package chainOfResponsibility;

public class Chief extends Handler{

	private double percentage = 5;
	
	@Override
	public double getPercentage() {
		return percentage;
	}
	
	public String toString() {
		return "The section chief";
	}

}
