package clases.enums.entities;

import static clases.enums.entities.FileType.UNKNOWN;

public class UserFile {
    private String name;
    private int size;

    /**
     * Al asignar el valor (UNKNOWN) a fileType, este sera el valor por defecto que tendran todas las entidades.
     *
     * Si utilizamos el constructor de la linea 17, este valor se cambiara por el recibido en el constructor.
     * Si utilizamos el constructor de la linea 25, el valor de fileType sera el por defecto, UNKNOWN.
     */
    private FileType fileType = UNKNOWN;
    private FileExtension fileExtension;

    public UserFile(String name, int size, FileType fileType, FileExtension fileExtension) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.fileExtension = fileExtension;
    }

    public UserFile(String name, int size, FileExtension fileExtension) {
        this.name = name;
        this.size = size;
        this.fileExtension = fileExtension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public FileExtension getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(FileExtension fileExtension) {
        this.fileExtension = fileExtension;
    }

    /**
     * toString es un metodo que nos permite hacer un System.out.println() de un objeto directamente,
     * al añadir esta funcion, solo tendremos que poner nuestro objeto en los parentesis () y este se mostrara en el formato que vemos en el metodo.
     * <p>
     * Para generar un toString, solamente tenemos que:
     * <p>
     * - Alt + intro -> toString()
     * <p>
     * - click derecho -> generate -> toString()
     * <p>
     * Y listo!
     *
     */
    @Override
    public String toString() {
        return "UserFile{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", fileType=" + fileType +
                ", fileExtension=" + fileExtension +
                '}';
    }
}
