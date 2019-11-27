package adapter;

public class ToLowerCase extends ListToLowerCase implements IText{

	@Override
	public String changeTextSize(String input) {
		
		String lowered = lower(input).get(0);
		
		return lowered;
	}

}
