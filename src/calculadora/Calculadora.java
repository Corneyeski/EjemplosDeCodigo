package calculadora;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {

    public static void main(String[] args) {

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el valor a operar");

            String textoRecoger1 = buffer.readLine();
            int numero1 = Integer.parseInt(textoRecoger1);

            System.out.println("Introduce el valor a operar");

            String textoRecoger2 = buffer.readLine();
            int numero2 = Integer.parseInt(textoRecoger2);

            System.out.println(
                    suma(numero1, numero2)
            );

        } catch(Exception exception) {
            exception.printStackTrace();
        }

    }

    private static int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }

}