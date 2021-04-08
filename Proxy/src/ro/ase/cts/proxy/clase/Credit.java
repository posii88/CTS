package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract{


	@Override
	public void OferaCredit(TipMoneda moneda, float suma) {
		System.out.println("S-a achizitionat credit de "+suma+ " "+moneda);

		
	}
	
}
