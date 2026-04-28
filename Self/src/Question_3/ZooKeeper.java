package Question_3;

public class ZooKeeper {
	 String name;

	 ZooKeeper(String name) {
	     this.name = name;
	 }

	 void feedAnimal(Animal animal) {
	    System.out.println(name + " is feeding " + animal.name);
	    animal.eat();
	 }
}