package ro.ase.cts.observer.clase;

public interface Subject {
	
	public void adaugareAbonat(Observer observer);
	public void stergereAbonat(Observer observer);
	public void trimitereMesaj(String text);
}
