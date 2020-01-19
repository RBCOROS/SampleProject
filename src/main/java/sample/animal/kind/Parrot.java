package sample.animal.kind;

import sample.animal.base.Animal;

public class Parrot extends Bird {

    public Parrot(String kind) {
        super(kind);
    }

    public void makeSound(Animal animal) {
        animal.makeSound();
    }
}
