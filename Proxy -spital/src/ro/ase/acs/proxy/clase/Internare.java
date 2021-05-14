package ro.ase.acs.proxy.clase;

public class Internare implements InterfataInternare{

	@Override
	public void gestioneazaPacienti(String nume, boolean asigurareSanatate) {
		System.out.println("Vrea spitalizare pacientul cu numele "+nume);
		System.out.println("Are asigurare medicala? "+ asigurareSanatate);
		
	}

	
}
