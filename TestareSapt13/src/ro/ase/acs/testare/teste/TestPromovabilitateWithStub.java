package ro.ase.acs.testare.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.acs.testare.clase.Grupa;
import ro.ase.acs.testare.clase.IStudent;
import ro.ase.acs.testare.clase.dubluri.StudentStub;

public class TestPromovabilitateWithStub {

	@Test
	public void test() {
		Grupa grupa=new Grupa(1083);
		IStudent student=new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}
