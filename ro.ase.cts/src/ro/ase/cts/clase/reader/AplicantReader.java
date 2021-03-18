package ro.ase.cts.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String fileName;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

	public Aplicant readAplicant(Scanner scanner,Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] denumiriProiecte  = new String[nr];
		for (int i = 0; i < nr; i++)
			denumiriProiecte[i] = scanner.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiri(nr,denumiriProiecte);
		return aplicant;
		
	}
}
