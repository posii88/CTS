package ro.ase.acs.testare.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.acs.testare.clase.Grupa;
import ro.ase.acs.testare.clase.IStudent;
import ro.ase.acs.testare.clase.Student;
import ro.ase.acs.testare.clase.dubluri.DummyStudent;

public class TesthrupaWithDummy {

	@Test
	public void test() {
		IStudent student=new DummyStudent();
		Grupa grupa=new Grupa(1083);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

}
