package composite;

public class Main {

	public static void main(String[] args) {
		
		Komponentti kone = new Kotelo();
		kone.lisaa(new Emolevy(4));
		kone.lisaa(new Prosessori());
		kone.lisaa(new Näytönohjain());
		
		System.out.println(kone.getHinta()+" euroa.");
		
	}

}
