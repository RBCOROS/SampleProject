package sample.animal.kind;

import sample.animal.base.Insect;
import sample.animal.base.Animal;

public class Butterfly extends Animal implements Insect {

    private static Insect caterpillar = new Caterpillar();

    public Butterfly (String kind) {
        super(kind);
    }

    public boolean fly() {
        return true;
    }

    public boolean walk() {
        return true;
    }

    public boolean hasSound() {
        return false;
    }

    @Override
    public void makeSound() {

    }

    public static void metamorphosis (String kind) {
        System.out.println("Caterpillar, fly :" + caterpillar.fly() + " , make sound : " + caterpillar.hasSound() + " walk : " + caterpillar.walk() );
        caterpillar = new Butterfly(kind);
        System.out.println("Butterfly, fly :" + caterpillar.fly() + " , make sound : " + caterpillar.hasSound() + " walk : " + caterpillar.walk() );

    }

    @Override
    public void eat() {
        System.out.println("I eat flowers!");
    }
}
