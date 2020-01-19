package sample.animal.base;

import sample.animal.constants.PrintlnConstant;

public class AnimalBaseHandler implements Walk, Swim, Fly , Sing {

    public void fly() {
        System.out.println(PrintlnConstant.CAN_FLY.getMsg());
    }

    public void swim() {
        System.out.println(PrintlnConstant.CAN_SWIM.getMsg());
    }

    public void walk() {
        System.out.println(PrintlnConstant.CAN_WALK.getMsg());
    }

    public void sing() {
        System.out.println(PrintlnConstant.CAN_SING.getMsg());
    }
}
