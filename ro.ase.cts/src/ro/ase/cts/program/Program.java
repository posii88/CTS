package ro.ase.cts.program;
import java.util.List;
//import ro.ase.cts.*; --incalcam principiu de nefolosire
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.AngajatReader;
import ro.ase.cts.reader.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	
	//Principiul Dependency .... "ala de nivel inalt nu trebuie sa depinda de fct de nivel jos"
//		implementarile pe care le realizati sa nu depinda direct de clase concrete, ci de tipul abstract
//		nu mai avem List<Angajat> ci List<Aplicant> si e bun si pt student si pt elev si inlocuim dupa doar o linie (AngajatReader)
		
//		functie vs metoda -> metodele au pe prima pozitie pointerul this, fata de functii (deci facem statica)
		public static List<Aplicant> CitireAplicanti(AplicantReader reader) throws FileNotFoundException{
			return reader.readAplicanti();
		}
		
		public static void main(String[] args) {
			List<Aplicant> listaAngajati;
			try {
				
				listaAngajati = CitireAplicanti(new AngajatReader("angajati.txt"));
				for(Aplicant angajat:listaAngajati)
					System.out.println(angajat.toString());
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}