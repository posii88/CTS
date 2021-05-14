package ro.ase.acs.proxy.clase;

public class Proxy implements InterfataInternare {

	InterfataInternare internare;
	
	public Proxy(InterfataInternare internare) {
		super();
		this.internare = internare;
	}

	@Override
	public void gestioneazaPacienti(String nume, boolean asigurareSanatate) {
		if(asigurareSanatate==true) {
			internare.gestioneazaPacienti(nume, asigurareSanatate);
		System.out.println("se poate realiza spitalizarea pentru "+nume);
		}
		else {
			internare.gestioneazaPacienti(nume, asigurareSanatate);
			System.out.println("nu se poate realiza spitalizarea pentru "+nume);
	}
	

	}
}
