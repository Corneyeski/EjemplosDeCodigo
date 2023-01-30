package polymorphism.entities;

import polymorphism.I;

public class C extends B implements I {

    private String father;

    {
        this.father = "B";
    }

    public C() {
        super();
    }

    public C(String father) {
        super("C");
        this.father = father;
    }

    @Override
    public String printClassName() {
        return "I am " + getName() + " implementor of " + I.name + " son of " + this.father + " grandson of " + super.getFather();
    }
}
