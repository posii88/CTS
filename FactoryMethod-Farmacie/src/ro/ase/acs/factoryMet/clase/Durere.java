package ro.ase.acs.factoryMet.clase;

public class Durere extends Produse {

	public Durere(int pret, String denumire) {
		super(pret, denumire);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Durere [pret=");
		builder.append(pret);
		builder.append(", denumire=");
		builder.append(denumire);
		builder.append("]");
		return builder.toString();
	}


}
