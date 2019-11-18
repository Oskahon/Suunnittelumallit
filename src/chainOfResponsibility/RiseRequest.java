package chainOfResponsibility;

public class RiseRequest {

	private double amount;
	
	public RiseRequest(double percentage) {
		amount = percentage;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
