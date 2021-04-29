package ro.ase.acs.factoryMet.clase;

public abstract class Produse {
public int pret;
public String denumire;
public Produse(int pret, String denumire) {
	super();
	this.pret = pret;
	this.denumire = denumire;
}
public int getPret() {
	return pret;
}
public void setPret(int pret) {
	this.pret = pret;
}
public String getDenumire() {
	return denumire;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Produse [pret=");
	builder.append(pret);
	builder.append(", denumire=");
	builder.append(denumire);
	builder.append("]");
	return builder.toString();
}


}
