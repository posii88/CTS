package ro.ase.acs.state.clase;



public class Masa {
private int numar;
private Stare stare;



public Masa(int numar) {
	super();
	this.numar = numar;
	this.stare=new MasaLibera();
}

public int getNumar() {
	return numar;
}
public void setNumar(int numar) {
	this.numar = numar;
}
public Stare getStare() {
	return stare;
}
public void setStare(Stare stare) {
	this.stare = stare;
}

public void ocupaMasa() {
	MasaOcupata masaOcupata=new MasaOcupata();
	masaOcupata.modificaStare(this);
}

public void rezervaMasa() {
	MasaRezervata masaRezervata=new MasaRezervata();
	masaRezervata.modificaStare(this);
}

public void elibereazaMasa() {
	MasaLibera masaLibera=new MasaLibera();
	masaLibera.modificaStare(this);
}

}
