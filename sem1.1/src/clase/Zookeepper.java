package clase;

public class Zookeepper {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Zookeepper(String name) {
	super();
	this.name = name;
}

public void feed(Animal a) {
	System.out.println(name+" hranesyte animalul: "+a.getName());
}


}
