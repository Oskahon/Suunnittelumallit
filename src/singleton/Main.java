package singleton;

public class Main {

	public static void main(String[] args) {

		Koodari jasper = new Koodari();
		
		jasper.puePäälle(AdidasTehdas.getInstance());
		jasper.esitteleVaatteet();
		
		jasper.puePäälle(BossTehdas.getInstance());
		jasper.esitteleVaatteet();
		
	}

}
