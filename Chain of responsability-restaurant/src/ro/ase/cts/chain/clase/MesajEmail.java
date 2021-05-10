package ro.ase.cts.chain.clase;

public class MesajEmail extends Modul {

	public MesajEmail(String numeModul) {
		super(numeModul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesareMesaj(Mesaj m) {
		if(m.adresaEmail.isEmpty()!=true) {
			System.out.println("Se trimite mesaj clientului prin adresa: "+m.adresaEmail);
		}
		else {
			System.out.println("Nu exista adresa de email");
		if(this.next!=null) {
			this.next.procesareMesaj(m);
		}
		}
	}

}
