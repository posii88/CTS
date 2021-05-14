package ro.ase.acs.proxy.clase;

public class Main {

	public static void main(String[] args) {

Internare internare1=new Internare();
Internare internare2=new Internare();

Proxy proxy=new Proxy(internare1);
proxy.gestioneazaPacienti("Maria", true);


Proxy proxy2=new Proxy(internare2);
proxy.gestioneazaPacienti("Dana", false);
	}

}
