package sample.vo;

public class AnimalChars {

    private String kind;
    private String name;
    private String size;
    private String color;
    private String hobby;

    public boolean isEatsFish() {
        return eatsFish;
    }

    public void setEatsFish(boolean eatsFish) {
        this.eatsFish = eatsFish;
    }

    public boolean isTellsJokes() {
        return tellsJokes;
    }

    public void setTellsJokes(boolean tellsJokes) {
        this.tellsJokes = tellsJokes;
    }

    private boolean eatsFish;
    private boolean tellsJokes;



    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString () {

        StringBuilder builder = new StringBuilder();
        builder.append("Animal characteristics : [ ");
        builder.append(" kind : ");
        builder.append(getKind());
        builder.append(" name : ");
        builder.append(getName());
        builder.append(" size : ");
        builder.append(getSize());
        builder.append(" color : ");
        builder.append(getColor());
        builder.append(" hobby ");
        builder.append(getHobby());
        builder.append(" eats fish : ");
        builder.append(isEatsFish());
        builder.append(" tells jokes ");
        builder.append(isTellsJokes());
        builder.append(" ]");
        return builder.toString();

    }
}
