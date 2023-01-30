package polymorphism.entities;

import polymorphism.I;

public class B extends A implements I {

    private String father;

    {
        this.father = "A";
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public B() {
        super("B");
    }

    public B(String name, String father) {
        super(name);
        this.father = father;
    }

    public B(String name) {
        super(name);
        this.father = "A";
    }

    @Override
    public String printClassName() {
        return "I am " + getName() + " implementor of " + I.name + " son of " + this.father;
    }

}
