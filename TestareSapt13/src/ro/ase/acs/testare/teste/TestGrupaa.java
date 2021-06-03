package ro.ase.acs.testare.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.acs.testare.categorii.GetPromovabilitateCategory;
import ro.ase.acs.testare.clase.Grupa;
import ro.ase.acs.testare.clase.Student;

public class TestGrupaa {

	@Test
	public void testConstructorCorect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}


	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrowException() {
		Grupa grupa=new Grupa(999);
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testConstructorShouldThrowException2() {
		Grupa grupa=new Grupa(1200);
		
	}


	@Test(timeout=500)
	public void testConstructorPerformanta() {
		Grupa g=new Grupa(1085);
	}

	
	@Test
	public void testConstructorExistenceList() {
		Grupa grupa=new Grupa(1065);
		assertNotNull(grupa.getStudenti());
	}



	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1084);
		for(int i=0;i<3;i++) {
			Student student=new Student("Alinuta");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<6;i++) {
			Student student=new Student("Georgel");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		float promovabilitate=0.7f;
		assertEquals(promovabilitate,grupa.getPromovabilitate(),0.1);//pica testul, deci metoda e gresita si o corectam
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLowerBoundary() {
		Grupa grupa=new Grupa(1084);
		for(int i=0;i<3;i++) {
			Student student=new Student("Alinuta");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);

		
		
		
	}
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateUpperBoundary() {
		Grupa grupa=new Grupa(1084);
		for(int i=0;i<3;i++) {
			Student student=new Student("Alinuta");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);

		
		
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition(){
		Grupa grupa=new Grupa(1084);
		grupa.getPromovabilitate();
		

	}
}
