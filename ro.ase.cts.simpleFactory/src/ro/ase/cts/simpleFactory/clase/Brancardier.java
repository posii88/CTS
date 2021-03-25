package ro.ase.cts.simpleFactory.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume) {
		super(nume);
	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [nume=");
		builder.append(nume);

		builder.append("]");
		return builder.toString();
	}

}
