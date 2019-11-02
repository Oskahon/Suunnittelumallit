package singleton;

public class Main {

	public static void main(String[] args) {

		Koodari jasper = new Jasper();
		Koodari pertti = new Pertti();
		
		jasper.puePäälle(AdidasTehdas.getInstance());
		jasper.esitteleVaatteet();
		
		pertti.puePäälle(AdidasTehdas.getInstance());
		pertti.esitteleVaatteet();
		
	}

}
