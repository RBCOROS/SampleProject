package sample.animal.kind;

public class Rooster extends BaseBird {

    public Rooster(String kind) {
        super(kind);
    }

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");

    }
}
