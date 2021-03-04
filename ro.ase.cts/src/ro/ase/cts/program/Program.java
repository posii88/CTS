package ro.ase.cts.program;
import java.util.List;
//import ro.ase.cts.*; --incalcam principiu de nefolosire
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = AngajatReader.readAngajati("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
