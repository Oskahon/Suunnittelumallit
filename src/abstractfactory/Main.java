package abstractfactory;

public class Main {

	public static void main(String[] args) {

		Koodari jasper = new Koodari();
		
		jasper.puePäälle(new AdidasTehdas());
		jasper.esitteleVaatteet();
		
		jasper.puePäälle(new BossTehdas());
		jasper.esitteleVaatteet();
	}

}
