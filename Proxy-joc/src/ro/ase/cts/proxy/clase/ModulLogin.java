package ro.ase.cts.proxy.clase;

public class ModulLogin implements InterfataLogin{

	String user;
	String pass;
	
	
	
	public ModulLogin(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}



	@Override
	public boolean login(String username, String password) {
if(user.equals(this.user)&& pass.equals(password)) {
	return true;
}else
		return false;
	}

}
