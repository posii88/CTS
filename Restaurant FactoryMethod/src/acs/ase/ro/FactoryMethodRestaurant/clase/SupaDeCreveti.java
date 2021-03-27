package acs.ase.ro.FactoryMethodRestaurant.clase;

public class SupaDeCreveti extends Supa {

	public SupaDeCreveti(int gramaj) {
		super(gramaj);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SupaDeCreveti [gramaj=").append(gramaj).append("]");
		return builder.toString();
	}
	
	

}
