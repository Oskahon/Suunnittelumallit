package chainOfResponsibility;

public class CEO extends Handler{

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  void processRequest(RiseRequest request) {
		System.out.println("Unfortunately due to the current state of the economy, "+this+
				" denies your request for a "
				+request.getAmount()+"% payrise.");
	}
	
	public String toString() {
		return "The CEO";
	}
}
