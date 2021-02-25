package clase;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//Clasa abstracta sa aiba o metoda virtual pura in C, dar in java mu i obligatoruiu, trb sa scriu sus abstract
	//Daca o clasa e abstracta, nu poate fi instantiata
	//dar o putem mosteni si folosi ca ReferenceType
	//putem folosi un pointer la aceasta clasa
	
}
