package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
private Zookeepper ingrijitor;
private List<Animal> animale;

public Zoo(Zookeepper ingrijitor, List<Animal> animale) {
	super();
	this.ingrijitor = ingrijitor;
	this.animale = animale;
}

public Zoo() {
	//deci cand avem list, arrayList e clasa completa si l mosteneste, deci ne putem folosi de el
	super();
	this.ingrijitor=new Zookeepper("gigel");
	this.animale=new ArrayList<Animal>();
}

public void addAnimal(Animal a) {
	animale.add(a);
}

public void feedAllAnimals() {
	for(Animal a:animale) {
		ingrijitor.feed(a);
	}
}

}
