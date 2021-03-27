package acs.ase.ro.FactoryMethodRestaurant.clase;

public class FabricaSupaDeLegume implements FabricaSupa{

	@Override
	public Supa getSupe(int gramaj) {
		return new SupaDeLegume(gramaj);
	}

}
