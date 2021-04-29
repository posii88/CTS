package ro.ase.acs.factoryMet.clase;

public class FabBody implements AbstractFactory{

	@Override
	public Produse getProduse(int pret, String nume) {
		
		return new Body(pret, nume);
	}

}
