package singleton;

public class BossTehdas implements VaateTehdas{

	private BossTehdas() {}
	
	private static final VaateTehdas INSTANCE = new BossTehdas();
	
	public static VaateTehdas getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Hattu createHattu() {
		return new BossHattu();
	}

	@Override
	public Paita createPaita() {
		return new BossPaita();
	}

	@Override
	public Housut createHousut() {
		return new BossHousut();
	}

	@Override
	public Kengät createKengät() {
		return new BossKengät();
	}

}
