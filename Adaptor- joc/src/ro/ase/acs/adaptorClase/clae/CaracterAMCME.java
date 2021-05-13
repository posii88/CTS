package ro.ase.acs.adaptorClase.clae;

public class CaracterAMCME implements InterfataCaractereLaInceput{
protected String nume;
protected int puncte;
public CaracterAMCME(String nume, int puncte) {
	super();
	this.nume = nume;
	this.puncte = puncte;
}
@Override
public String getNume() {
	// TODO Auto-generated method stub
	return nume;
}
@Override
public int getPuncteViata() {
	// TODO Auto-generated method stub
	return puncte;
}
@Override
public void getDescriere() {
	System.out.println(nume+ "   "+puncte);
	
}
@Override
public void esteAtacat(int puncte) {
	System.out.println(nume + " E atacat");
	this.puncte-=puncte;
	
}
@Override
public void seVindeca(int puncte) {
	System.out.println(nume +" sE vindeca");
	this.puncte+=puncte;
	
}


}
