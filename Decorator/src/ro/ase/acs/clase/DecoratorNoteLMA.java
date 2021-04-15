package ro.ase.acs.clase;

public class DecoratorNoteLMA extends DecoratorAbstract{

	public DecoratorNoteLMA(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitate() {
		System.out.println("Felicitare de la multi ani!");;
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("LMA");
	}

}
