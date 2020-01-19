package sample.animal.base;

import sample.animal.constants.FishValidationConstant;
import sample.animal.kind.*;
import sample.vo.AnimalChars;


public class AnimalImplMain {

    private static AnimalChars animalChars = new AnimalChars();

    public static void main (String[] args) {
        //1.
        birdCharacteristics();

        //2.
        duckCharacteristics();
        chickenCharacteristics();

        //3.
        roosterCharacteristics();

        //4.
        parrotSound();

        //B-1 and 2
        fishCharacteristics();
    }

    /**
     * This is for item #1
     * implement sing()
     * unit test
     */
    private static void birdCharacteristics () {
        System.out.println("***** Model a bird *****");
        animalChars.setKind("Bird");

        Bird bird = new Bird(animalChars.getKind());
        bird.printKind();
        bird.walk();
        bird.makeSound();
        bird.eat();
        bird.fly();
        bird.sing();
    }

    /**
     * this is for item #2
     * Model duck that make a sound 'Quack Quack'
     * and can swim
     */
    private static void duckCharacteristics () {
        System.out.println("***** Model a duck *****");
        animalChars.setKind("Duck");

        Duck duck = new Duck(animalChars.getKind());
        duck.printKind();
        duck.walk();
        duck.makeSound();
        duck.fly();
        duck.swim();
    }

    /**
     * this is for item #2
     * Model a chicken that make a sound 'Cluck , cluck'
     * but cannot swim!
     *
     */
    private static void chickenCharacteristics () {
        System.out.println("***** Model a chicken *****");
        animalChars.setKind("Chicken");

        Chicken chicken = new Chicken(animalChars.getKind());
        chicken.printKind();
        chicken.walk();
        chicken.makeSound();
    }

    /**
     * this is for item #3
     * Model a rooster that make a sound 'Cock a doodle doo'
     * How is the rooster related to the chicken
     * Other ways without using inheritance
     */
    private static void roosterCharacteristics () {
        System.out.println("***** Model a rooster *****");
        animalChars.setKind("Rooster");
        String roosterStr = animalChars.getKind();
        Rooster rooster = new Rooster(roosterStr);
        rooster.printKind();
        rooster.walk();
        rooster.makeSound();

        // chicken and rooster are both birds, they eat worms!
        checkRelation();


    }

    private static void eat(BaseBird bird) {
        bird.eat();
    }


    private static void checkRelation() {
        Chicken chicken = new Chicken("Chicken");
        Rooster rooster = new Rooster("Rooster");

        eat(chicken);
        eat(rooster);
    }

    /**
     * Item #4
     * parrot with makes sounds
     */
    private static void parrotSound () {
        System.out.println("***** Parrot that makes sounds depends on the environment! *****");
        Parrot parrot = new Parrot("Parrot");
        // parrot who lives with dogs
        Dog dog = new Dog("Dog");
        parrot.makeSound(dog);
        // parrot who lives with cats
        Cat cat = new Cat("Cat");
        parrot.makeSound(cat);
        Rooster rooster = new Rooster("Rooster");
        parrot.makeSound(rooster);
    }

    /**
     * B. model fish
     * Item #1
     * fish don't sing
     * fish don't walk
     * fish can swim
     * #Item # 3 : fish specialization
     */
    private static void fishCharacteristics () {
        System.out.println("***** B. Model fish *****");
        Fish fish = new Fish("Fish");
        fish.eat();
        fish.makeSound();
        fish.swim();
        //validate if fish is a shark or a clownfish
        System.out.println("Validate fish");
        animalChars = shark();
        System.out.println("Given : " + animalChars.toString());
        String kind = FishValidationConstant.getFishKind(animalChars);
        System.out.println("kind : " + kind);

        animalChars = clownfish();
        System.out.println("Given : " + animalChars.toString());
        kind = FishValidationConstant.getFishKind(animalChars);
        System.out.println("kind : " + kind);
    }

    private static AnimalChars shark() {
        animalChars.setColor("Grey");
        animalChars.setSize("Large");
        animalChars.setEatsFish(true);
        animalChars.setTellsJokes(false);
        return animalChars;
    }

    private static AnimalChars clownfish() {
        animalChars.setColor("Orange");
        animalChars.setSize("Small");
        animalChars.setEatsFish(false);
        animalChars.setTellsJokes(true);
        return animalChars;
    }

}
