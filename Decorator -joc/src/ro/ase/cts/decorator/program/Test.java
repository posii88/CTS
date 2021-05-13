package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.CaracterAMCME;
import ro.ase.cts.decorator.clase.DecoratorAlerta;
import ro.ase.cts.decorator.clase.DecoratorScut;
import ro.ase.cts.decorator.clase.InterfataCaractereLaInceput;

public class Test {
public static void main(String[] args) {
	InterfataCaractereLaInceput superman=new CaracterAMCME("supermaan", 1000);
	InterfataCaractereLaInceput batman=new CaracterAMCME("batman", 1000);
	
	superman.esteAtacat(200);
	
	DecoratorScut supermanCuScut=new DecoratorScut(superman, " tip 1");
	supermanCuScut.esteAtacat(200);
	superman.getDescriere();
	
	DecoratorAlerta batmanRanitCritic=new DecoratorAlerta(batman);
	batmanRanitCritic.esteAtacat(910);
	batman.getDescriere();
	
	DecoratorAlerta supermanCuScutSiAlerta=new DecoratorAlerta(supermanCuScut);
	
	supermanCuScutSiAlerta.esteAtacat(1300);
	supermanCuScutSiAlerta.getDescriere();
}
}
