package whileloop;

public class WhileExample {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            System.out.println("La vuelta actual es: " + contador);
            contador++; //contador = contador + 1;
        }

        System.out.println("**************************************************************");

        do {
            System.out.println("La vuelta actual es: " + contador);
        } while (contador < 10);


    }
}
