package ro.ase.acs.clase;

public class ContEconomii extends Cont {
	public ContEconomii(float sold) {
		super(sold);

	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma) {
			System.out.println("ai platit cu contul de economii");
			super.setSold(super.getSold()-suma);
		}else
		{
			if(super.getSuccesor()==null) {
				System.out.println("nu se poate plati");
			}else {
				super.getSuccesor().plateste(suma);
			}
		}
		
	}
}
