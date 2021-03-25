package ro.ase.cts.FactoryMethod.clase;

public class Infiemier extends PersonalSpital {

	public Infiemier(String nume) {
		super(nume);
	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Infirmier [nume=");
		builder.append(nume);

	builder.append("]");
		return builder.toString();
	}


}
