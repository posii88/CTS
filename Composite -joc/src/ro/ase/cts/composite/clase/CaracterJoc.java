package ro.ase.cts.composite.clase;

public class CaracterJoc extends AbstractNod {
	//el e nodul frunza
	
	
	public CaracterJoc(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataca(String inamic) {
		System.out.println(this.nume +" ataca pe "+inamic);
		
	}

	@Override
	public void seApara() {
	System.out.println(this.nume +" se apara");
		
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(this.nume +" se vindeca");
		
	}

	//varianta 1
//	
//	@Override
//	public void adauga(AbstractNod nod) {
//		throw new UnsupportedOperationException();
//		//aveam aceasta metoda, dar nu e la nivel logic si n ar trebui apelata
//		
//	}
//
//	@Override
//	public void sterge(int index) {
//		throw new UnsupportedOperationException(); 
//		
//	}
//
//	@Override
//	public AbstractNod get(String nume) {
//		throw new UnsupportedOperationException();
//	}
//	
//	
}
