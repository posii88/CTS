package ro.ase.cts.clase;


public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare=20;
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getanStudii() {
		return anStudii;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	public static int getSumaFinantare() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(int sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}
	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder("angajat: ");
		builder.append(super.toString());
		builder.append("Facultate=" + facultate);
		builder.append("anStudii=" + anStudii);
		return builder.toString();
		}
	
	
	
	@Override
	public int getFinantare() {
		
		return sumaFinantare;
	}
	
}