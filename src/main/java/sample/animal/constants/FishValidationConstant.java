package sample.animal.constants;

import sample.vo.AnimalChars;

public enum FishValidationConstant {

    SHARK("shark","Large", "Grey", false, true),
    CLOWNFISH("clownfish","Small", "Orange", true, false);

    private final String fish;
    private final String size;
    private final String color;
    private final boolean tellsJokes;
    private final boolean eatsFish;

    FishValidationConstant(String fish, String size, String color, boolean tellsJokes, boolean eatsFish) {
        this.fish = fish;
        this.size = size;
        this.color = color;
        this.tellsJokes = tellsJokes;
        this.eatsFish = eatsFish;

    }

    public String getFish() {
        return fish;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isTellsJokes() {
        return tellsJokes;
    }

    public boolean isEatsFish() {
        return eatsFish;
    }

    public static String getFishKind(AnimalChars animalChars) {
        boolean isShark = FishValidationConstant.SHARK.getSize().equalsIgnoreCase(animalChars.getSize())
                && FishValidationConstant.SHARK.getColor().equalsIgnoreCase(animalChars.getColor())
                && animalChars.isEatsFish() && !animalChars.isTellsJokes();
        boolean isClownFish = FishValidationConstant.CLOWNFISH.getSize().equalsIgnoreCase(animalChars.getSize())
                && FishValidationConstant.CLOWNFISH.getColor().equalsIgnoreCase(animalChars.getColor())
                && !animalChars.isEatsFish() && animalChars.isTellsJokes();
        if (isShark) {
            return FishValidationConstant.SHARK.getFish();
        } else if (isClownFish) {
            return FishValidationConstant.CLOWNFISH.getFish();
        } else {
            return "other fish";
        }
    }
}
