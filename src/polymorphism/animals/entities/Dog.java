package polymorphism.animals.entities;

import utils.Utils;

public class Dog extends Animal {

    private String pattern;
    private String raze;

    public Dog(String name, int age, String pattern, String raze) {
        super(name, age, "guau");
        this.pattern = pattern;
        this.raze = raze;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getRaze() {
        return raze;
    }

    public void setRaze(String raze) {
        this.raze = raze;
    }
}
