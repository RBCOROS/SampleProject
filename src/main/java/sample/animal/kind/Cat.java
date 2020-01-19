package sample.animal.kind;

public class Cat extends BaseLandAnimal {

    public Cat(String kind) {
        super(kind);
    }

    public void eat() {
        System.out.println("I eat cat food!");
    }

    public void makeSound() {
        System.out.println("Meow, meow!");
    }
}
