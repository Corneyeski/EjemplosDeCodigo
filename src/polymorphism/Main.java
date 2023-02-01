package polymorphism;

import polymorphism.entities.A;
import polymorphism.entities.B;
import polymorphism.entities.C;


public class Main {

    public static void main(String[] args) {

        I i = new A();
        I i2 = new B();
        I i3 = new C("B");

        System.out.println(i.printClassName());
        System.out.println(i2.printClassName());
        System.out.println(i3.printClassName());
    }

}
