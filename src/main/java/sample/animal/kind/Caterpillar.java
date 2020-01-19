package sample.animal.kind;

import sample.animal.base.Insect;

public class Caterpillar implements Insect {

    public boolean fly() {
        return false;
    }

    public boolean walk() {
        return true;
    }

    public boolean hasSound() {
        return true;
    }
}
