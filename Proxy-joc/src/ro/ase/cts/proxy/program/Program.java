package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.ModulLogin;
import ro.ase.cts.proxy.clase.ProxyModulLogin;

public class Program {

	public static void main(String[] args) {
	
		//var fara proxy
		
		ModulLogin modulLogin=new ModulLogin("admin", "1234");
	String[] dictParole =new String[] {"123456","526","admin","root","1234"};
	
	for(String parola : dictParole) {
		System.out.println("incerc "+parola);
		if(modulLogin.login("admin",parola)) {
			System.out.println("am gasit parola");
		}else
			System.out.println("am gresit parola");
	}

	//cu proxy
	ProxyModulLogin proxy=new ProxyModulLogin(modulLogin);
	for(String parola : dictParole) {
		System.out.println("incerc "+parola);
		if(proxy.login("admin",parola)) {
			System.out.println("am gasit parola");
		}else
			System.out.println("am gresit parola");
	}
	}

}
