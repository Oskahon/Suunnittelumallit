package singleton;

public class AdidasTehdas implements VaateTehdas{

	private AdidasTehdas() {}
	
	private static final VaateTehdas INSTANCE = new AdidasTehdas();
	
	public static VaateTehdas getInstance() {
		return INSTANCE;
	}
	
	public Hattu createHattu() {
		return new AdidasHattu();
	}

	@Override
	public Paita createPaita() {
		return new AdidasPaita();
	}

	@Override
	public Housut createHousut() {
		return new AdidasHousut();
	}

	@Override
	public Kengät createKengät() {
		return new AdidasKengät();
	}
	
}
