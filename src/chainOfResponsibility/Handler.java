package chainOfResponsibility;

public abstract class Handler {
	
	private Handler successor;
	
	abstract double getPercentage();
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public  void processRequest(RiseRequest request) {
		if (request.getAmount() <= getPercentage()) {
			System.out.println(this+" approves your request of "+request.getAmount()+"% payrise");
		} else {
			successor.processRequest(request);
		}
	}
}
