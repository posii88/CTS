package ro.ase.cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends AplicantReader {


	public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev=new Elev();
			super.readAplicant(input2,elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}
	public ElevReader(String fileName) {
		super(fileName);
		
	}
	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {

		return null;
	}

}
