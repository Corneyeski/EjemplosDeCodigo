package clases.colegio.entidades;

public class Alumno {

    private String nombre;
    private int edad;

    private Materia[] materias;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    public Alumno(String nombre, int edad, Materia[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public Materia getMateria(int i) {
        return materias[i];
    }

    public void setMateria(int i, Materia materia) {
        materias[i] = materia;
    }
}
