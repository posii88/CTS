package ro.ase.cts.prototype.program;


import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		ContClient contClient1=new ContClient("ioana",22,12);
	ContClient contclient2=(ContClient)contClient1.copiaza();
	
	System.out.println(contClient1);
	System.out.println(contclient2);
	
	Bilet biletPrototype=new Bilet(1,"dinamo","staua","22.01.2022");
	Bilet bilet1=(Bilet)biletPrototype.copiaza();
	bilet1.setCodBilet(100);
	Bilet bilet2=(Bilet)biletPrototype.copiaza();
	bilet2.setCodBilet(101);
	
	System.out.println(bilet1);
	System.out.println(bilet2);
	}
	

}
