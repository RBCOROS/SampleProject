package sample.animal.kind;

import sample.animal.base.Swim;
import sample.animal.base.Animal;

public class Fish extends Animal implements Swim {

    public Fish (String kind) {
        super(kind);
    }

    public void eat() {
        System.out.println("I eat algae!");
    }

    public void makeSound() {
        System.out.println("Blob, blob!");
    }

    public void swim() {
        animalBase.getAnimalHandler().swim();
    }


}
