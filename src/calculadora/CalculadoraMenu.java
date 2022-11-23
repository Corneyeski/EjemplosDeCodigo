package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraMenu {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static int number1 = 0;
    static int number2 = 0;

    public static void main(String[] args) throws IOException {

        int option = 0;

        do {
            System.out.println("1 - Sumar");
            System.out.println("2 - restar");
            System.out.println("3 - dividir");
            System.out.println("4 - multiplicar");
            System.out.println("0 - Salir de la app");

            option = Integer.parseInt(buffer.readLine());

            if(option > 0 && option < 5){
                askNumber();
            }

            switch (option) {
                case 0 -> System.out.println("Saliendo...");
                case 1 -> sum(number1, number2);
                case 2 -> resta(number1, number2);
                case 3 -> division(number1, number2);
                case 4 -> multiplicacion(number1, number2);
                default -> System.out.println("La opcion introducida no es valida");
            }

        }while (option != 0);
    }

    private static void sum(int val1, int val2){
        System.out.println(val1 + val2);
    }
    private static void resta(int val1, int val2){
        System.out.println(val1 - val2);
    }
    private static void division(int val1, int val2){
        System.out.println(val1 / val2);
    }
    private static void multiplicacion(int val1, int val2){
        System.out.println(val1 * val2);
    }

    private static void askNumber() throws IOException {
        System.out.println("Introduce el primer numero a operar: ");
        number1 = Integer.parseInt(buffer.readLine());
        System.out.println("Introduce el segundo numero a operar: ");
        number2 = Integer.parseInt(buffer.readLine());

    }
}
