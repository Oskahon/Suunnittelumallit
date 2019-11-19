package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");		list.add("B");
		list.add("C");		list.add("D");
		list.add("E");		list.add("F");
		list.add("G");		list.add("H");

		ListPrinter printer = new ListPrinter(new First());
		printer.printList(list);
		
		printer.setStrategy(new Second());
		printer.printList(list);

		printer.setStrategy(new Third());
		printer.printList(list);
		
	}

}
