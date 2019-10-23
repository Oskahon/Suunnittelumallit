package abstractfactory;

public class BossTehdas implements VaateTehdas{

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
