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

		ListConverter converter = new First();
		System.out.println(converter.listToString(list));
		
		converter = new Second();
		System.out.println(converter.listToString(list));
		
		converter = new Third();
		System.out.println(converter.listToString(list));
		
	}

}
