package memento;

import java.util.Random;

public class Asiakas extends Thread{
	
	private int numero;
	private Arvuuttaja arvuuttaja;
	private Object obj;
	private Random rand = new Random();
	
	public Asiakas(Arvuuttaja arvuuttaja, int numero) {
		this.arvuuttaja = arvuuttaja;
		this.numero = numero;
	}

	public void liityPeliin() {
		arvuuttaja.liityPeliin(this);
	}
	
	public boolean arvaaLuku() {
		int luku = rand.nextInt(10)+1;
		System.out.println(this+": arvasi luvun "+luku);
		return arvuuttaja.arvaaLuku(obj, luku);
	}
	
	@Override
	public void run() {
		boolean tilanne;
		do {
			tilanne = arvaaLuku();
			if (!tilanne) {
				System.out.println(this+": arvasi väärin.");
				try {
					sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} while(!tilanne);
		System.out.println(this+": arvasi oikein!");
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public String toString() {
		return "Pelaaja "+numero;
	}

}
