package ro.ase.cts.program;
import java.util.List;
//import ro.ase.cts.*; --incalcam principiu de nefolosire
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.reader.AngajatReader;
import ro.ase.cts.clase.reader.AplicantReader;

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
			System.out.println(Angajat.getSumaFinantare());
			System.out.println(Student.getSumaFinantare());
			System.out.println(Elev.getSumaFinantare());
			
			Proiect proiectInitial=new Proiect(80);
			
			List<Aplicant> listaAngajati;
			try {
				
				listaAngajati = CitireAplicanti(new AngajatReader("angajati.txt"));
				for(Aplicant angajat:listaAngajati)
				{
					System.out.println(angajat.toString());
					System.out.println("angajatul are finatarea "+angajat.getFinantare());
				angajat.afisareStatutPeProiect(proiectInitial);
				}
					
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

	}