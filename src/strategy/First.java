package strategy;

import java.util.Iterator;
import java.util.List;

public class First implements ListConverter {

	@Override
	public String listToString(List<?> list) {
		
		String convertedList = "";

		Iterator<?> itr = list.iterator();
		while (itr.hasNext()) {
			convertedList+=itr.next()+"\n";
		}
		
		return convertedList;
	}

}
