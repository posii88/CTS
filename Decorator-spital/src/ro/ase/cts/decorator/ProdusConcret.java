package ro.ase.cts.decorator;

public class ProdusConcret  implements AbstractRezultate{

	String diagnostic;
	
	
	
	public ProdusConcret(String diagnostic) {
		super();
		this.diagnostic = diagnostic;
	}



	@Override
	public void print() {
		System.out.println("Diagnosticul este: "+diagnostic);
		
	}

}
