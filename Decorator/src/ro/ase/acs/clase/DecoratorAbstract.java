package ro.ase.acs.clase;

public abstract class DecoratorAbstract  implements NotaAbstracta{
	//trebuie declarata abstracta pt a fi 
	//decoratorul concret care adauga functionalitatea
	private NotaAbstracta nota;

	@Override
	public void printeaza() {
	nota.printeaza();
		
	}

	public DecoratorAbstract(NotaAbstracta nota) {
		super();
		this.nota = nota;
	}
	
	public abstract void printeazaFelicitate();
	
}
