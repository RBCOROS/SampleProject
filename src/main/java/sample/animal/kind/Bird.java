package sample.animal.kind;


import sample.animal.base.Fly;
import sample.animal.base.Sing;

public class Bird extends BaseBird implements Fly , Sing {

    public Bird(String kind) {
        super(kind);
    }

    public void fly() {
        commonFly();
    }

    public void sing() {
        System.out.println("I can sing!");
    }
}
