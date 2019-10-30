package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Komponentti{

	private List<Komponentti> komponentit = new ArrayList<>();
	private double hinta = 100;

	@Override
	public double getHinta() {
		double kokonaisHinta = hinta;
		
		for (Komponentti komponentti: komponentit) {
			kokonaisHinta += komponentti.getHinta();
		}
		
		return kokonaisHinta;
	}

	@Override
	public void lisaa(Komponentti komponentti) {
		komponentit.add(komponentti);		
	}

	@Override
	public void poista(Komponentti komponentti) {
		komponentit.remove(komponentti);		
	}

	@Override
	public Komponentti getChild(int i) {
		return komponentit.get(i);
	}

}
