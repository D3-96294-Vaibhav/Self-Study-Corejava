 package Question_3;

abstract class Animal {
	String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound(); 

    void eat() {
        System.out.println(name + " is eating");
    }
}
