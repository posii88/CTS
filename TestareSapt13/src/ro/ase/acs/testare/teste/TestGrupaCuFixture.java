package ro.ase.acs.testare.teste;

import org.junit.Before;
import org.junit.Test;

import ro.ase.acs.testare.clase.Grupa;
import ro.ase.acs.testare.clase.Student;

public class TestGrupaCuFixture {
private Grupa grupa;
	
	@Before
	public void setUp() {
		
		grupa=new Grupa(1075);
		for(int i=0;i<35;i++) {
			Student student=new Student("Alinuta");
			for (int j=0;j<6;j++) {
				student.adaugaNota(7);
			}
			grupa.adaugaStudent(student);
		}
		
	}
	
		@Test(timeout=500)
		public void testPromovabilitatePerformance() {
			
			grupa.getPromovabilitate();
			
		}
}
