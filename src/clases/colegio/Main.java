package clases.colegio;

import clases.colegio.entidades.Alumno;
import clases.colegio.entidades.Materia;
import clases.colegio.entidades.Profesor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {


    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static final Profesor[] profesores = new Profesor[10];

    public static void main(String[] args) throws IOException {

        Profesor profesor = new Profesor("Alan", "C/ falsa", 26, new Date(), "Programacion", new Materia[5]);

        //Guardamos el profesor en el array a traves de una variable
        profesores[0] = profesor;

        //Creamos el profesor directamente en una posicion del array
        profesores[1] = new Profesor("Alan", "C/ falsa", 26, new Date(), "Programacion", new Materia[5]);


        Alumno alumno = new Alumno("Javier", 28);

        Materia materia = new Materia("Java", new Alumno[1], profesor);
        materia.setAlumno(0, alumno);

        profesor.getMaterias()[0] = materia;

        for (int i = 0; i < profesor.getMaterias(0).getAlumnos().length ; i++){
            System.out.println(profesor.getMaterias(0).getAlumnos()[i].getNombre());
        }

        ejemploInstanciar();
    }

    private static void ejemploInstanciar() throws IOException {
        //Enseñar que profesores dan que clases a que alumnos en que aulas

        Profesor profesor1 = new Profesor("Alan", "C/ piruleta", 26, new Date(), "Programacion Java");
        Profesor profesor2 = new Profesor("Juanita", "C/ falsa 123", 35, new Date(), "Programacion HTML");


        System.out.println(profesor1.getNombre());
        profesor1.setNombre("Gabriel");
        System.out.println(profesor1.getNombre());


        profesor1.setNombre("Gabrielafdhadfhadfhfdahdahadfhadfhgeray6ereryaeryaeryyraeyaeryaery");
        System.out.println(profesor1.getNombre());

        System.out.println("Nombre del profesor");
        String nombre = reader.readLine();

        System.out.println("Edad del profesor");
        int edad = Integer.parseInt(reader.readLine());


        Profesor profesor3 = new Profesor(nombre, edad);
        profesor3.setRama("testeo");
        System.out.println(profesor3.getEdad());
        System.out.println(profesor3.getNombre());


        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno("Test", 21);
    }
}
