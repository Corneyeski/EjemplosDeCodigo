package inheritance;

import inheritance.abstraction.A;
import inheritance.abstraction.B;
import inheritance.abstraction.C;
import inheritance.entities.Human;
import inheritance.entities.Police;

import java.util.Date;

public class Main {


    public static void main(String... args) {


        Human human = new Human("Alan", 26, 82.00, 180.0, new Date());

        Police police = new Police("Alan", 26, 82.00, 180.0, new Date(), 3721224L, 8, "Detective");

        /*police.getName();
        police.getHigh();
        police.getWeight();*/

        System.out.println(police.getName());

        police.setName("Paco");

        System.out.println(police.getName());

        Human human2 = police;

        System.out.println(human2.getName());

        Human human3 = new Police("test", 32, 82.00, 180.0, new Date(), 3721235224L, 8, "Detective");

        police.showProperties();
        police.showClass();

        human3.showProperties();

        Police police2 = (Police) human3;
        police2.setId(1212412L);
        System.out.println(police2.getRange());

        human.showProperties();

        System.out.println("**************************************************");

        new Police();

        String test = "test";

        test.toUpperCase();

        System.out.println(test);

        test = test.toUpperCase();

        System.out.println(test);

        //THIS THROWS EXCEPTION
        //Police police3 = (Police) new Human("Alan", 26, 82.00, 180.0, new Date());
        //police3.showProperties();

        System.out.println("**************************************************");

        A implementacion = new B();
        System.out.println(implementacion.multiplicaValor(2));

        A implementacion2 = new C();
        System.out.println(implementacion2.multiplicaValor(2));

    }


}
