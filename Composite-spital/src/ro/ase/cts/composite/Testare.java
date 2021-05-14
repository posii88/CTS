package ro.ase.cts.composite;

public class Testare {

	public static void main(String[] args) {
		
		Nod nod1=new Nod("copii");
		CompositeSubDepartament subDepartament=new CompositeSubDepartament("pediatrie");
		
		subDepartament.adaugaNod(nod1);
		subDepartament.adaugaNod(new Nod("adulti"));
		
		subDepartament.printeazaNume();
		
		subDepartament.stergeNod(1);

		subDepartament.printeazaNume();
		subDepartament.adaugaNod(new Nod("adulti"));
		
		
	}

}
