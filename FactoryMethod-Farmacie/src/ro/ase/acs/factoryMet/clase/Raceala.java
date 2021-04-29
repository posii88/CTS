package ro.ase.acs.factoryMet.clase;

public class Raceala extends Produse {

	public Raceala(int pret, String denumire) {
		super(pret, denumire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raceala [pret=");
		builder.append(pret);
		builder.append(", denumire=");
		builder.append(denumire);
		builder.append("]");
		return builder.toString();
	}



}
