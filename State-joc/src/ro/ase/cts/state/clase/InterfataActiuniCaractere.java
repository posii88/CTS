package ro.ase.cts.state.clase;

public interface InterfataActiuniCaractere {
	
	
	//varianta 1--avem nevoie de ceva de la caracterul respectiv si trebuie sa i trimitem o referinta
	//si daca mergem pe varianta asta, intervata va deveni o clasa abstracta
	//CaracterJoc caracter;
	
	
	
public void seDeplaseaza();

//varianta 2-doar daca anumite metode au nevoie de o referinta la obiect, vom treansmite referinta la lista de parametrii

public void ataca(String inamic,int pucte, CaracterJoc caracter);
}
