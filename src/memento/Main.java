package memento;

public class Main {

	public static void main(String[] args) {
		
		Arvuuttaja arvuuttaja = Arvuuttaja.getInstance();
		
		Asiakas[] pelaajat = new Asiakas[3];
		for (int i=0; i<pelaajat.length; i++) {
			pelaajat[i] = new Asiakas(arvuuttaja, i+1);
			pelaajat[i].liityPeliin();
		}
		
		for (Asiakas a: pelaajat) {
			a.start();
		}
		
	}

}
