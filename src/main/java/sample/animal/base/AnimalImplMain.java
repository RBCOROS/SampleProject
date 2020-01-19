package sample.animal.base;

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

}
