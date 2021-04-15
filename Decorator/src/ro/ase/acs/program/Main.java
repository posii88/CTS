package ro.ase.acs.program;

import ro.ase.acs.clase.DecoratorAbstract;
import ro.ase.acs.clase.DecoratorNotaPasteFericit;
import ro.ase.acs.clase.DecoratorNoteLMA;
import ro.ase.acs.clase.NotaAbstracta;
import ro.ase.acs.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaAbstracta nota=new NotaDePlata(100);
		
		nota.printeaza();
		
		DecoratorAbstract decorator=new DecoratorNotaPasteFericit(nota);
		
		decorator.printeazaFelicitate();
		
		decorator.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decoratorLMA=new DecoratorNoteLMA(nota);
		decoratorLMA.printeaza();
		
		
		NotaAbstracta notaNoua=new NotaDePlata(88);
		DecoratorAbstract decoratorLMAbstract=new DecoratorNoteLMA(notaNoua);
		
		DecoratorAbstract decoratorFelicitare=new DecoratorNotaPasteFericit(decoratorLMAbstract);
		
		decoratorFelicitare.printeaza();
	}
	
}
