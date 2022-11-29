package forloop;

import java.io.IOException;

public class ForLoop {

    public static void main(String[] args) throws IOException {
        ejemploArray();
    }

    private static void ejemploArray() {

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

            for (int j = 0; j < numericos[i].length; j++) {
                System.out.print(numericos[i][j]);
            }
            System.out.println();
            //execution
        }

        //...
    }
}
