package ro.ase.acs.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.acs.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="gigi";
		Student student=new Student(nume);
		
		//assertia aia este cam acelasi lucru cu if ul ala comentat
		
		
//		if(nume !=student.getNume()) {
//			fail("numele e diferit");
//		}
		
		assertNotNull(student.getNume());
		assertNotNull(student.getNume());
	}
		
	
	@Test
	public void testConstructorFaraParametri() {
		String nume="gigi";
		Student student=new Student(nume);
		
		//assertia aia este cam acelasi lucru cu if ul ala comentat
		
		
//		if(nume !=student.getNume()) {
//			fail("numele e diferit");
//		}
		
		assertEquals("Numele nu a fost initializat" ,nume, student.getNume());
		//assertNotEquals(null, student.getNote());
		assertNotNull("Lista de note nu a fost nitializata",student.getNote());
	}
		
	
	@Test
		public void testSetterNume() {
			String nume="Maria";
	
			Student student=new Student();
			
			student.setNume(nume);
			
			
			assertEquals(nume, student.getNume());
		}
	
	@Test
	public void testAdaugareNotaInLista() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void DimensiuneLista() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	}


