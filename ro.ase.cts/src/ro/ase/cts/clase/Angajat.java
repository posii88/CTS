package ro.ase.cts.clase;



public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare = 10;

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ocupatie " + ocupatie);
		builder.append("salariu" + salariu);
		return builder.toString();
	}

	public int finantare() {
		int s = 10;
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
		return s;
	}

	@Override
	public int getFinantare() {

		return sumaFinantare;
	}

}
