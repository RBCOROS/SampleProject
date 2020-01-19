package sample.animal.constants;

public enum BooleanConstant {

    YES("YES"),
    NO("NO");

    private final String yesNo;

    BooleanConstant(String yesNo) {
        this.yesNo = yesNo;
    }

    public String getYesNo() {
        return yesNo;
    }


    public static String getYesNo(boolean yesNo) {
        if (yesNo)  {
            return BooleanConstant.YES.getYesNo();
        } else {
            return BooleanConstant.NO.getYesNo();
        }

    }
}
