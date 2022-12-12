package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraV2 {
    private static int number1 = 0;
    private static int number2 = 0;

    private static final String REQUEST_NO_1 = "Introduce el primer numero a operar: ";
    private static final String REQUEST_NO_2 = "Introduce el primer numero a operar: ";
    private static final String REQUEST_MENU = "Introduce la opcion: ";
    private static final String INVALID = "Valor introducido invalido";
    private static final String INVALID_MENU = "La opcion introducida no es valida";
    private static final String EXIT = "Saliendo...";

    public static void main(String[] args) throws IOException {

        int option = 0;

        do {
            showMenu();
            option = requestNumber(REQUEST_MENU);

            switch (option) {
                case 0 -> System.out.println(EXIT);
                case 1 -> sum();
                case 2 -> resta();
                case 3 -> division();
                case 4 -> multiplicacion();
                default -> System.out.println(INVALID_MENU);
            }
        } while (option != 0);
    }

    private static void sum() {
        askNumber();
        System.out.println(number1 + number2);
    }

    private static void resta() {
        askNumber();
        System.out.println(number1 - number2);
    }

    private static void division() {
        askNumber();
        System.out.println(number1 / number2);
    }

    private static void multiplicacion() {
        askNumber();
        System.out.println(number1 * number2);
    }

    //Calulcular la potencia


    private static void showMenu() {
        System.out.println("1 - Sumar");
        System.out.println("2 - restar");
        System.out.println("3 - dividir");
        System.out.println("4 - multiplicar");
        System.out.println("0 - Salir de la app");
    }

    private static void askNumber() {
        number1 = requestNumber(REQUEST_NO_1);
        number2 = requestNumber(REQUEST_NO_2);
    }

    private static int requestNumber(String text) {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(text);
            int valor = Integer.parseInt(buffer.readLine());

            if (valor < 0 || valor > 9)
                return requestNumber(text);
            else return valor;

        } catch (IOException e) {
            System.out.println(INVALID);
            return requestNumber(text);
        }
    }
}

