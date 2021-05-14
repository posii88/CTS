package ro.ase.cts.facade;

public class Main {

public static void main(String[] args) {
	Facade f1=new Facade();
	System.out.println(f1.Internam(new Pacient("grava"), new Medic(), new Salon()));;


}
	
}
