package acs.ase.ro.FactoryMethodRestaurant.clase;

public class FabricaSupaDeCreveti implements FabricaSupa{

	@Override
	public Supa getSupe(int gramaj) {
		return new SupaDeCreveti(gramaj);
	}

}
