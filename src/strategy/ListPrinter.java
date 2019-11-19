package strategy;

import java.util.List;

public class ListPrinter {

	ListConverter strategy;
	
	public ListPrinter(ListConverter strategy) {
		this.strategy = strategy;
	}
	
	public void printList(List<?> list) {
		System.out.println(strategy.listToString(list));
	}
	
	public void setStrategy(ListConverter strategy) {
		this.strategy = strategy;
	}
}
