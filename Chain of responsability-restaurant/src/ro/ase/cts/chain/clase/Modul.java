package ro.ase.cts.chain.clase;

public abstract class Modul {
Modul next;
String numeModul;
public Modul(String numeModul) {
	super();
	this.numeModul = numeModul;
}
public void setNext(Modul next) {
	this.next = next;
}

public abstract void procesareMesaj(Mesaj m);

}
