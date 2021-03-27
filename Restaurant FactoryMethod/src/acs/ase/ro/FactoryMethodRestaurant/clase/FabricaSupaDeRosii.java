package acs.ase.ro.FactoryMethodRestaurant.clase;

public class FabricaSupaDeRosii implements FabricaSupa {

	@Override
	public Supa getSupe(int gramaj) {
		return new SupaDeRosii(gramaj);
	}

}
