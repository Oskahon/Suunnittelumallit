package adapter;

public class ToUpperCase implements IText{

	@Override
	public String changeTextSize(String input) {
		return input.toUpperCase();
	}

}
