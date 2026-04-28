package Question_3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	String zooName;
	List<Animal> animals;
	ZooKeeper zooKeeper;
	public Zoo(String zooName, ZooKeeper zooKeeper) {
		super();
		this.zooName = zooName;
		animals = new ArrayList<>();
		this.zooKeeper = zooKeeper;
	}
	
	void addAnimal(Animal animal) {
        animals.add(animal);
    }
	
	void showAnimals() {
	    for (Animal a : animals) {
	         System.out.println(a.name + " is in the zoo");
	         a.makeSound();
	      }
	    }

	void feedAllAnimals() {
	    for (Animal a : animals) {
	       zooKeeper.feedAnimal(a);
	     }
	 }
	
	
}
