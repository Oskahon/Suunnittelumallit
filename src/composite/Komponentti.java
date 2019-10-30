package composite;

public interface Komponentti {

	public abstract double getHinta();
	public abstract void lisaa(Komponentti komponentti);
	public abstract void poista(Komponentti komponentti);
	public abstract Komponentti getChild(int i);
}
