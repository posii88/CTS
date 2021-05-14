package ro.ase.cts.composite;

public class Nod implements AbstractComponent{
String numeSectie;


	public Nod(String numeSectie) {
	super();
	this.numeSectie = numeSectie;
}

	@Override
	public void adaugaNod(Nod nod) {
		throw new IllegalArgumentException("nu este implementata");
		
	}

	@Override
	public void stergeNod(int index) {
		throw new IllegalArgumentException("nu este implementata");
		
	}

	@Override
	public Nod genComponenta(int index) {
	 throw new IllegalArgumentException("nu este implementata");
	}

	@Override
	public void printeazaNume() {
		System.out.println("Numele sectiei este: "+numeSectie);
		
	}

}
