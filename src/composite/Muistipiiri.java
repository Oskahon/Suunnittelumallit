package composite;

public class Muistipiiri implements Komponentti {

	private double hinta = 10;

	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void lisaa(Komponentti komponentti) {
		throw new RuntimeException
		("Tähän komponenttiin ei voi lisätä toista komponenttia");
	}

	@Override
	public void poista(Komponentti komponentti) {
		throw new RuntimeException
		("Tämä komponentti ei sisällä muita komponentteja");
	}

	@Override
	public Komponentti getChild(int i) {
		throw new RuntimeException
		("Tämä komponentti ei sisällä muita komponentteja");
	}

}
