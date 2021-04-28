package acs.ase.builder.clase;

public class FacturaBuilder implements AbstractBuilder{
private Factura factura;



public FacturaBuilder() {
	super();
	this.factura = new Factura(false, 0, false, false, false, 0);
}


public FacturaBuilder NrPungi(int nrPungi,Boolean aCerutPungi) {
	if(aCerutPungi==true) {
		if(nrPungi>0) {
	factura.setNrPungi(nrPungi);
		}
		else {
			factura.setNrPungi(1);
		}
	factura.setACerutPungi(true);
	}else {
		factura.setNrPungi(0);
		factura.setACerutPungi(false);
	}
	return this;
}

public FacturaBuilder PlataCuCard(boolean plataCuCard) {
	factura.setPlataCuCardul(plataCuCard);
	return this;
}

public FacturaBuilder CotaTVA(boolean ArecotaTVA,int cota) {
	if(ArecotaTVA==false) {
		factura.setCotaTVA(0);
		factura.setEstePlatitorDeTVA(false);
	}else
		if(cota>0) {
	factura.setCotaTVA(cota);
	factura.setEstePlatitorDeTVA(true);
		}
		else
		{
			factura.setCotaTVA(1);
			factura.setEstePlatitorDeTVA(true);
		}
	
	return this;
}



@Override
public Factura build() {
	
	return factura;
}
}
