package ro.ase.cts.chain.clase;

public class TrimiteManager extends Modul {

	public TrimiteManager(String numeModul) {
		super(numeModul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesareMesaj(Mesaj m) {
		if(m.adresaEmail.isEmpty() ==true && m.nrTelefon.isEmpty()==true) {
			System.out.println("se trimite numele managerului");
		}
		
	}

}
