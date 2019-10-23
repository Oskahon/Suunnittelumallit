package abstractfactory;

public class Koodari {
	
	private Hattu hattu = null;
	private Paita paita = null;
	private Housut housut = null;
	private Kengät kengät = null;
	
	public void puePäälle(VaateTehdas tehdas) {
		hattu = tehdas.createHattu();
		paita = tehdas.createPaita();
		housut = tehdas.createHousut();
		kengät = tehdas.createKengät();
	}
	
	public void esitteleVaatteet() {
		System.out.println("Päässäni on "+hattu+", paita on "+paita+", housut on "+housut+" ja jalassa on "+kengät+".");
	}
	
}
