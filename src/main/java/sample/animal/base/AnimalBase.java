package sample.animal.base;

public class AnimalBase {

    protected AnimalBaseHandler animalHandler;

    public AnimalBase () {
        this.animalHandler = new AnimalBaseHandler();
    }

    public AnimalBaseHandler getAnimalHandler() {
        return animalHandler;
    }
}
