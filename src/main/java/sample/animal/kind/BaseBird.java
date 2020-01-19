package sample.animal.kind;


import sample.animal.base.Walk;
import sample.animal.base.Animal;

public class BaseBird extends Animal implements Walk {

    public BaseBird(String kind) {
        super(kind);
    }

    public void walk() {
       animalBase.getAnimalHandler().walk();
    }

    @Override
    public void eat() {
        System.out.println("I eat worms!");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp! chirp!");

    }

    public void commonFly () {
        animalBase.getAnimalHandler().fly();
    }
}
