package acs.ase.builder.clase;

public class Factura {
private boolean ACerutPungi;
private int nrPungi;
private boolean plataCuCardul;
private boolean cardDeFidelitate;
private boolean EstePlatitorDeTVA;
private int cotaTVA;
public Factura(boolean aCerutPungi, int nrPungi, boolean plataCuCardul, boolean cardDeFidelitate,
		boolean estePlatitorDeTVA, int cotaTVA) {
	super();
	
	ACerutPungi = aCerutPungi;
	if(aCerutPungi==true)
	this.nrPungi = nrPungi;
	else
	nrPungi=0;
	if(nrPungi>0) {
		aCerutPungi=true;
	}
	this.plataCuCardul = plataCuCardul;
	this.cardDeFidelitate = cardDeFidelitate;
	EstePlatitorDeTVA = estePlatitorDeTVA;
	if(estePlatitorDeTVA==true) {
	this.cotaTVA = cotaTVA;
	}else
		this.cotaTVA = 0;	
	if(cotaTVA>0) {
		estePlatitorDeTVA=true;
	}
}

public boolean isACerutPungi() {
	return ACerutPungi;
}
public void setACerutPungi(boolean aCerutPungi) {
	ACerutPungi = aCerutPungi;
}
public int getNrPungi() {
	return nrPungi;
}
public void setNrPungi(int nrPungi) {
	this.nrPungi = nrPungi;
}
public boolean isPlataCuCardul() {
	return plataCuCardul;
}
public void setPlataCuCardul(boolean plataCuCardul) {
	this.plataCuCardul = plataCuCardul;
}
public boolean isCardDeFidelitate() {
	return cardDeFidelitate;
}
public void setCardDeFidelitate(boolean cardDeFidelitate) {
	this.cardDeFidelitate = cardDeFidelitate;
}
public boolean isEstePlatitorDeTVA() {
	return EstePlatitorDeTVA;
}
public void setEstePlatitorDeTVA(boolean estePlatitorDeTVA) {
	EstePlatitorDeTVA = estePlatitorDeTVA;
}
public int getCotaTVA() {
	return cotaTVA;
}
public void setCotaTVA(int cotaTVA) {
	this.cotaTVA = cotaTVA;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Factura [ACerutPungi=");
	builder.append(ACerutPungi);
	builder.append(", nrPungi=");
	builder.append(nrPungi);
	builder.append(", plataCuCardul=");
	builder.append(plataCuCardul);
	builder.append(", cardDeFidelitate=");
	builder.append(cardDeFidelitate);
	builder.append(", EstePlatitorDeTVA=");
	builder.append(EstePlatitorDeTVA);
	builder.append(", cotaTVA=");
	builder.append(cotaTVA);
	builder.append("]");
	return builder.toString();
}


}
