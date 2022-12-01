package forloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        int posicion;

        for (int i = 0; i < numericos.length; i++) {

            /*if(numericos[i] == 5)
                posicion = i;*/

            for (int j = 0; j < numericos[i].length; j++) {
                System.out.print(numericos[i][j]);
            }
            System.out.println();
            //execution
        }


        int[] arrayDeEjemplo2 = {
                3, 7, 9, 0, 2
        };

        for (int numero : arrayDeEjemplo2) {
            System.out.println(numero);
        }


        String[] arrayDeNombres = {
                "Alan", "david", "jose", "Noemi", "laura"
        };

        for (String nombre : arrayDeNombres) {
            System.out.println(nombre);
        }


        //...
    }


    private void test() throws IOException {
        String[][] alumnos = new String[4][10];
        for (int contador1 = 0; contador1 < 10; contador1++) {
            alumnos[2][contador1] = String.valueOf(pedirNota(alumnos[0][contador1]));
        }
    }

    private double pedirNota(String name) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean check = true;
        double nota = 0.0;

        while (check) {
            System.out.println("Introduzca la nota del alumno " + name + ".");
            nota = Double.parseDouble(buffer.readLine());

            if(nota < 0 || nota > 10) {
                System.out.println("La nota introducida no es valida");
            }else {
                check = false;
            }
        }
        return nota;
    }

    private void ejercicioNotas() {

        String[] nombres = new String[10];
        double[] notas = new double[10];


        //ValidarNotas(noptas[0])

        String[][] nombresNotas = new String[2][10];

        for (int i = 0; i < nombresNotas.length; i++) {
            System.out.println("Nombre: " + nombresNotas[0][i] + "nota: " + nombresNotas[1][i]);
        }
    }

}
