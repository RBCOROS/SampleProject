package sample.animal.kind;

import sample.animal.base.Fly;
import sample.animal.base.Swim;

public class Duck extends BaseBird implements Fly, Swim {

    public Duck(String kind) {
        super(kind);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack! Quack!");

    }

    public void swim() {
        animalBase.getAnimalHandler().swim();
    }

    public void fly () {
        animalBase.getAnimalHandler().fly();
    }

}
