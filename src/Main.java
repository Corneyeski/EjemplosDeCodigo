import calculadora.CalculadoraMenu;
import utils.Types;
import utils.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Utils utils = new Utils();

        Integer testInt = utils.ask("Insert number: ", Types.INT);
        System.out.println(testInt);
    }
    private static void ejemploArray(){

        //int[] arrayDeEjemplo = new int[5];
        int[] arrayDeEjemplo = {
          3, 7, 9, 0, 2
        };

        int[][] numericos = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Ejemplo de Lista");

        for (int i = 0; i < arrayDeEjemplo.length; i++) {
            System.out.print(arrayDeEjemplo[i]);
        }

        System.out.println();
        System.out.println("Ejemplo de Matriz");

        for (int i = 0; i < numericos.length; i++) {

            for (int j = 0; j < numericos[i].length; j++){
                System.out.print(numericos[i][j]);
            }
            System.out.println();
            //execution
        }

        //...
    }
}
