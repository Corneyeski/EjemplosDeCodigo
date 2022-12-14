package clases.colegio.entidades;

public class Materia {

    private String nombre;
    private Alumno[] alumnos;
    private Profesor profesor;

    public Materia(String nombre, Alumno[] alumnos, Profesor profesor) {
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno getAlumno(int i) {
        return alumnos[i];
    }

    public void setAlumno(int i, Alumno alumno) {
        this.alumnos[i] = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
