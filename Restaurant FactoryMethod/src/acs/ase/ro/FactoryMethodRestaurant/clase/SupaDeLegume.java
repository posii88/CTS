package acs.ase.ro.FactoryMethodRestaurant.clase;

public class SupaDeLegume extends Supa {

	public SupaDeLegume(int gramaj) {
		super(gramaj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SupaDeLegume [gramaj=").append(gramaj).append("]");
		return builder.toString();
	}




}
