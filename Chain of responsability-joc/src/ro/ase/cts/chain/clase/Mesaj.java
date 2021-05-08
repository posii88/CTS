package ro.ase.cts.chain.clase;

public class Mesaj {

	String text;
	int prioritate;
	String destinatar;
	public Mesaj(String text, int prioritate, String destinatar) {
		super();
		this.text = text;
		this.prioritate = prioritate;
		this.destinatar = destinatar;
	}
	public String getText() {
		return text;
	}
	public int getPrioritate() {
		return prioritate;
	}
	public String getDestinatar() {
		return destinatar;
	}
	
	//rol doar de a stoca datele procesate
	
}
