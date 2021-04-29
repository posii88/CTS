package ro.ase.acs.factoryMet.clase;

public class FabRaceala implements AbstractFactory {

	@Override
	public Produse getProduse(int pret, String nume) {
		// TODO Auto-generated method stub
		return new Raceala(pret,nume);
	}

}
