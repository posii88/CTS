package ro.ase.cts.proxy.clase;

public class ProxyModulLogin implements InterfataLogin {

	InterfataLogin modulLogin;
	int contorIncercari=0;
	
	
	
	public ProxyModulLogin(InterfataLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}




	@Override
	public boolean login(String username, String password) {
		if(contorIncercari>=3) {
			System.out.println("Notific utilizatorul");
			return false;
		}
		
		boolean esteAutentificat=this.modulLogin.login(username, password);
		if(!esteAutentificat) {
			contorIncercari+=1;
		}
		else	
				contorIncercari=0;
		
			return esteAutentificat;
		
	}
	
}
