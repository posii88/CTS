package ro.ase.acs.strategy.clase;
import java.util.Random;

public class StaraterieRandom implements InterfataCalculPuncteBonus {

	@Override
	public int getPuncteBonus() {
		Random random=new Random();
		return random.nextInt(1000);
	}

}
