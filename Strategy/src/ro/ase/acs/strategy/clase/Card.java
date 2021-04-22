package ro.ase.acs.strategy.clase;

public class Card implements Strategy {


	@Override
	public void realizeazaPlata(float suma) {
	
		System.out.println("tranz a fpst efectuata cu cardul de "+suma);
	}

}
