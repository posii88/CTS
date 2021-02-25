package Program;

import clase.Girafa;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z=new Zoo();
	
		//deci am putut sa ne folosim de clasa abstracta pt a face tot chiar daca nu am avut o clasa concreta de animal
		
		Girafa girafa=new Girafa("girafa1");
		Girafa girafa2=new Girafa("girafa2");
		
		z.addAnimal(girafa);
		z.addAnimal(girafa2);
		
		z.feedAllAnimals();
		
		Zebra z1=new Zebra("z1");
		Zebra z2=new Zebra("z2");
		
		z.addAnimal(z1);
		z.addAnimal(z2);
		
		z.feedAllAnimals();
	}

}
