package ro.ase.cts.chain.clase;

public class MesajeTelefon extends Modul {

	public MesajeTelefon(String numeModul) {
		super(numeModul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesareMesaj(Mesaj m) {
	if(m.nrTelefon.isEmpty()!=true) {
		System.out.println("trimitem mesaj pe telefon");
	}
	else {
		System.out.println("Lipsa numar de telefon");
		if(this.next!=null) {
			this.next.procesareMesaj(m);
		}
	}
		
	}

}
