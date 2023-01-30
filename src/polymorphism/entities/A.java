package polymorphism.entities;

import polymorphism.I;

public class A implements I {

    private String name;

    {
        this.name = "A";
    }

    public A() {

    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String printClassName() {
        return "I am " + name + " implementor of " + I.name;
    }
}
