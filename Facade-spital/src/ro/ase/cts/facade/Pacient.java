package ro.ase.cts.facade;

public class Pacient {
String Stare;

public Pacient(String stare) {
	super();
	this.Stare = stare;
}


public boolean esteStareGrava(String stare) {
if(stare=="grav") {
	return true;
}else
	return false;
}
}
