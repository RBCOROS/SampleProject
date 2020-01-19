package sample.animal.kind;

import sample.animal.base.Swim;
import sample.animal.base.Animal;

public class Dolphin extends Animal implements Swim {

    public Dolphin(String kind) {
        super(kind);
    }

    public void eat() {
        System.out.println("I eat small fish!");
    }

    public void makeSound() {
        System.out.println("flip, flip flip!");
    }

    public void swim() {
        animalBase.getAnimalHandler().swim();
    }
}
