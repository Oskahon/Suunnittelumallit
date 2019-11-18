package strategy;

import java.util.List;

public class Third implements ListConverter {

	@Override
	public String listToString(List<?> list) {
		String convertedList = "";
		
		int times = 0;
		for (int i = 0; i < list.size();i++) {
			times++;
			if ((times%3)==0) {
				convertedList+=list.get(i)+"\n";
			} else {
				convertedList+=list.get(i);
			}
		}
		
		return convertedList;
	}

}
