package memento;

import java.util.Random;

public class Arvuuttaja {
	
	private Random rand = new Random();
	
	private static final Arvuuttaja INSTANCE = new Arvuuttaja();
	
	public static Arvuuttaja getInstance() {
		return INSTANCE;
	}
	
	public void liityPeliin(Asiakas asiakas) {
		int arvottu = rand.nextInt(10)+1;
		System.out.println(asiakas+" sai luvukseen: "+arvottu);
		asiakas.setObj(new Memento(arvottu));
	}
	
	public synchronized boolean arvaaLuku(Object obj, int arvaus) {
		Memento memento = (Memento)obj;
		if (memento.getLuku()==arvaus) {
			return true;
		} else {
			return false;
		}
	}
	
	private class Memento {

		private int luku;

		public Memento(int luku) {
			this.luku = luku;
		}
		
		public int getLuku() {
			return luku;
		}
	}
	
}
