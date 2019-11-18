package strategy;

import java.util.List;

public class Second implements ListConverter {

	@Override
	public String listToString(List<?> list) {
		
		String convertedList = "";
		String[] array = new String[list.size()];
		array = list.toArray(array);
		
		int times = 0;
		for (String s : array) {
			times++;
			if ((times%2)==0) {
				convertedList+=s+"\n";
			} else {
				convertedList+=s;
			}
		}
		
		return convertedList;
	}

}
