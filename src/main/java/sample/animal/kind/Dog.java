package sample.animal.kind;

public class Dog extends BaseLandAnimal {

    public Dog(String kind) {
        super(kind);
    }

    public void eat() {
        System.out.println("I eat dog food!");
    }

    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
