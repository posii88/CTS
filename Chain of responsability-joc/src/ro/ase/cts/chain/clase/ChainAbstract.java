package ro.ase.cts.chain.clase;

public abstract class ChainAbstract {

ChainAbstract next;
String numeModul;

public ChainAbstract(String numeModul) {
	super();
	this.numeModul = numeModul;
}

public void setNext(ChainAbstract next) {
	this.next = next;
}




public abstract void procesareMesaj(Mesaj mesaj) ;

}
