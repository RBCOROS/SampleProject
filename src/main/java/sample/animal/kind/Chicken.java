package sample.animal.kind;

public class Chicken extends BaseBird {

    public Chicken(String kind) {
        super(kind);
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck! Cluck!");

    }
}
