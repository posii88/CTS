package ro.ase.cts.adaptorClase.clase;

public class AdapterCreditClase extends Leasing implements CreditAbstract{

	public AdapterCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
	}
	
	@Override
public void oferaCredit() {
	super.imprumuta();
}


}
