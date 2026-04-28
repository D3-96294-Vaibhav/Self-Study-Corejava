package Question_3;

public class Program {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper("preetam");
		Zoo zoo = new Zoo("Pune Zoo", zooKeeper);
		
		Animal lion = new Lion("Simba", 5);
		Animal zebra = new Zebra("smarat", 3);
		
		zoo.addAnimal(zebra);
		zoo.addAnimal(lion);
		
		zoo.showAnimals();
		zoo.feedAllAnimals();
	}
}
