package Question_3;

public class Lion extends Animal {
	Lion(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " roars");
    }
}
