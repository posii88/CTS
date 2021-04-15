package ro.ase.acs.clase;

public class DecoratorNotaPasteFericit extends DecoratorAbstract{

	public DecoratorNotaPasteFericit(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	public void printeaza() {
		super.printeaza();
		System.out.println("paste fericit");
	}

	@Override
	public void printeazaFelicitate() {
		System.out.println("Felicitare paaste feri!");;
		
	}


}
