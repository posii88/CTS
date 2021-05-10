package ro.ase.cts.chain.clase;

public class Mesaj {
	
	String nrTelefon;
	String adresaEmail;
	public Mesaj(String nrTelefon, String adresaEmail) {
		super();
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public String getAdresaEmail() {
		return adresaEmail;
	}


}
