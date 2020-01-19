package sample.animal.kind;

import sample.animal.base.Walk;
import sample.animal.base.Animal;

public class BaseLandAnimal extends Animal implements Walk {

    public BaseLandAnimal(String kind) {
        super(kind);
    }

    public void walk() {
        animalBase.getAnimalHandler().walk();
    }

    @Override
    public void eat() {
        System.out.println("I eat food!");
    }

    @Override
    public void makeSound() {

    }
}
