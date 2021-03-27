package acs.ase.ro.FactoryMethodRestaurant.clase;

public class SupaDeRosii extends Supa {

	public SupaDeRosii(int gramaj) {
		super(gramaj);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SupaDeRosii [gramaj=").append(gramaj).append("]");
		return builder.toString();
	}

	
	
}
