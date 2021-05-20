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
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		int note1=10;
		int note2=3;
		int note3=7;
		int note4=8;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		float medie=(note1+note2+note3)/3.0f;
		assertEquals(medie,student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student=new Student();
		int note1=10;
		student.adaugaNota(note1);
		assertEquals(note1,student.calculeazaMedie(),0.01);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testCalculeazaMedieZeroNote() {
		Student student=new Student();
		student.calculeazaMedie();
	}
	
	
	@Test
	public void testAreRestanta() {
		Student student=new Student();
		int note1=2;
		int note2=4;
		int note3=7;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);

		assertTrue(student.areRestante());
	}
	
	@Test
	public void testGetPozitieIncorecta() {
		Student student=new Student();
		
		int note1=2;
		int note2=4;
		int note3=7;
		student.adaugaNota(note1);
		student.adaugaNota(note2);
		student.adaugaNota(note3);
		//1
		try {
			//2
			student.getNota(3);
			//3
			fail("metoda arunca exceptie");
		} catch (IndexOutOfBoundsException e) {
		//4
			
		}
		//5
	}
	
	}


