package sample.animal.constants;

public enum PrintlnConstant {
    CAN_SWIM("I can swim!"),
    CAN_FLY("I can fly!"),
    CAN_SING("I can sing!"),
    CAN_WALK("I can walk!");

    private final String msg;

    PrintlnConstant(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
