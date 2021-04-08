package ro.ase.cts.proxy.clase;

public class Proxy implements CreditAbstract {

	private CreditAbstract credit;
	
	
	
	public Proxy(CreditAbstract credit) {
		super();
		this.credit = credit;
	}



	public void OferaCredit(TipMoneda moneda, float suma) {
	if(moneda==TipMoneda.RON) {
		credit.OferaCredit(moneda, suma);
	}else
	{
		System.out.println("banca nu mai ofera credite in alte monede!");
	}
}
}
