package adapter;

import java.util.ArrayList;
import java.util.List;

public class ListToLowerCase {
	
	public List<String> lower(String input){
		List<String> lowered = new ArrayList<>();
		lowered.add(input.toLowerCase());
		return lowered;
	}

}
