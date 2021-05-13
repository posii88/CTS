package ro.ase.cts.composite.clase;

public abstract class AbstractNod {

	String nume;

	public AbstractNod(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
	//metode specifice caracterelor din joc
	public abstract void ataca(String inamic);
	public abstract void seApara();
	public abstract void seVindeca(int puncte);
	
	//metode specifice grupurilor
	//noduri de tip composite
	
	//varianta1
//	public abstract void adauga(AbstractNod nod);
//	public abstract void sterge(int index);
//	public abstract AbstractNod get(String nume);

	
	//Versiunea 2
	
	public void adauga(AbstractNod nod) {
		throw new UnsupportedOperationException();
		//aveam aceasta metoda, dar nu e la nivel logic si n ar trebui apelata
		
	}

	public void sterge(int index) {
		throw new UnsupportedOperationException(); 
		
	}


	public AbstractNod get(String nume) {
		throw new UnsupportedOperationException();
	}
	
	
	
}
