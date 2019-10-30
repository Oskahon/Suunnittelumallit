package composite;

public class Main {

	public static void main(String[] args) {
		
		Komponentti kone = new Kotelo();
		
		Komponentti emolevy = new Emolevy();
		emolevy.lisaa(new Muistipiiri());		
		emolevy.lisaa(new Muistipiiri());
		
		kone.lisaa(emolevy);
		kone.lisaa(new Prosessori());
		kone.lisaa(new Näytönohjain());
		
		System.out.println(kone.getHinta()+" euroa.");
		
	}

}
