import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        /**
         * Ejemplo para leer valores escritos por terminal
         */
        try {

            //Iniciamos la clase que accedera a la terminal
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            /**
             * Mostramos un mensaje por terminal para hacer saber al usuario que tiene que introducir un valor
             */
            System.out.println("Introduce tu dia de nacimiento");
            //buffer.readLine(); recoge el valor escrito por el usuario
            String diaSr = buffer.readLine();

            System.out.println(diaSr);

            /**
             * Pasar String a int
             */
            int dia = Integer.parseInt(diaSr);

            System.out.println(dia + 1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}