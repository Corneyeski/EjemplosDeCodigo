package polymorphism.animals.entities;

import utils.Utils;

public class Cow extends Animal {

    private String pattern;
    private String color;

    public Cow(String name, int age, String pattern, String color) {
        super(name, age, "Muuu");
        this.pattern = pattern;
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
