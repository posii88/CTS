package ro.ase.acs.clase;

public abstract class Cont {
private Cont succesor=null;
private float sold;
public Cont(float sold) {
	super();
	this.sold = sold;
}
public void setSuccesor(Cont succesor) {
	this.succesor = succesor;
}

public float getSold() {
	return sold;
}
public void setSold(float sold) {
	this.sold = sold;
}
public Cont getSuccesor() {
	return succesor;
}
public abstract void plateste(float suma);


}
