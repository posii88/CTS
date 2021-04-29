package ro.ase.acs.factoryMet.clase;

public class Body extends Produse{

	public Body(int pret, String denumire) {
		super(pret, denumire);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Body [pret=");
		builder.append(pret);
		builder.append(", denumire=");
		builder.append(denumire);
		builder.append("]");
		return builder.toString();
	}

}
