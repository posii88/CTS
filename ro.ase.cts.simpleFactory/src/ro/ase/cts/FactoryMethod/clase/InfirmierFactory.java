package ro.ase.cts.FactoryMethod.clase;

public class InfirmierFactory implements FactoryPersonal{
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Infiemier(nume);
	}
}
