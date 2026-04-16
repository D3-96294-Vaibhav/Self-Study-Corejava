import java.util.*;

class Animal{
	String name;
	int age;
	double weight;
	
	
	public void eat() {};
	public void sleep() {};
	public void makeSound() {};
	public void displayInfo() {};
}



class Lion extends Animal{
	public Lion(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void eat() {
		System.out.println("Lion eating...");
	};
	public void sleep() {System.out.println("Lion sleeping...");};
	public void makeSound() {System.out.println("roar...roarrrr....");};
	public void displayInfo() {
		System.out.println("age:" +age +"name:"+name+"weight:"+weight );
	};
}



class Elephant extends Animal{
	public Elephant(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void eat() {
		System.out.println("elephant eating...");
	};
	public void sleep() {System.out.println("elephant sleeping...");};
	public void makeSound() {System.out.println("trump...trumppp....");};
	public void displayInfo() {
		System.out.println("age:" +age +"name:"+name+"weight:"+weight );
	};
}

class Monkey extends Animal{
	public Monkey(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void eat() {
		System.out.println("Monkey eating...");
	};
	public void sleep() {System.out.println("Monkey sleeping...");};
	public void makeSound() {System.out.println("krrrrrchchhee...krrrchhhheee....");};
	public void displayInfo() {
		System.out.println("age: " +age +"name: "+name+"weight: "+weight );
	};
}

class ZooKeeper{
	Zoo z;
	
	public ZooKeeper(Zoo z){
		this.z=z;
	}
	public void callZooKeeper() {
		System.out.println("Hello I am Zoo Keeper,May I help you...");
	}
}


class Ticket{
	Zoo z;
	
	public Ticket(Zoo z){
		this.z=z;
	}
	public void collectTicket() {
		System.out.println("Ticket collected... enjoy your journey");
	}
}

class Zoo{
	
	ArrayList<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal a){
		animals.add(a);
	}
	
	public void displayAnimalas() {
		for(Animal a:animals) {
			a.displayInfo();
		}
		
	}
	
	public void makeAllSounds() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }
	
	public void eatAllAnimals() {
		for(Animal a :animals) {
			a.eat();
		}
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		
		Zoo z=new Zoo();
		
		z.addAnimal(new Lion("Lion",33,200));
		z.addAnimal(new Elephant("Element",20,500));
		z.addAnimal(new Monkey("Monkey",15,60));
		
		z.displayAnimalas();
		z.eatAllAnimals();
		z.makeAllSounds();
		
		Ticket t=new Ticket(z);
		t.collectTicket();
		
		ZooKeeper zk=new ZooKeeper(z);
		zk.callZooKeeper();
		

	}

}
