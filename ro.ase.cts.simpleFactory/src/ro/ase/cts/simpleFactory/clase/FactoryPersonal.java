package ro.ase.cts.simpleFactory.clase;

public class FactoryPersonal {

	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume) throws Exception {
		switch (tipPersonal) {
		case MEDIC:
		{
			Medic medic=new Medic(nume);
			return medic;
		}
		case ASISTENT:
		{
			Asistent asistent=new Asistent(nume);
			return asistent;
		}
		case BRANCARDIER:
			return new Brancardier(nume);
		default:
			throw new Exception();
		}
	}
	
}
