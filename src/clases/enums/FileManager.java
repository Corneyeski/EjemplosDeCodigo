package clases.enums;

import clases.enums.entities.FileExtension;
import clases.enums.entities.FileType;
import clases.enums.entities.UserFile;

import static clases.enums.entities.FileExtension.*;
import static clases.enums.entities.FileType.*;

public class FileManager {

    public static void main(String... args) {

        /**
         * Creamos los objetos de UserFile
         */
        UserFile userFile = new UserFile("misApuntes", 10, FileType.DOCUMENT, FileExtension.DOCX);
        UserFile userFileNoType = new UserFile("misApuntes", 213, WAV);

        /**
         * Mostramos su valor antes de validarlos
         * <p>
         *     Mirar la linea 62 de la @Class UserFile
         * </p>
         *
         */
        System.out.println(userFile);
        System.out.println(userFileNoType);

        /**
         * Llamamos a la funcion de validar enviando el usuario
         */
        validateFileType(userFile);
        validateFileType(userFileNoType);

        /**
         * Volvemos a mostrar los objetos para ver si ha cambiado algun valor
         *
         * <p>
         *     Si ejecutais este programa, deberiais ver que el @Property fileType de la @Variable userFileNoType ha cambiado de valor.
         * </p>
         */
        System.out.println(userFile);
        System.out.println(userFileNoType);
    }

    /**
     * Los ENUM son muy utiles para realizar switch/case, ya que una variable o propiedad de un objeto tendra siempre uno de los valores definidos en el ENUM
     * @param userFile
     */
    private static void validateFileType(UserFile userFile) {

        switch (userFile.getFileType()) {

            case IMAGE -> {
                System.out.println("Es un " + IMAGE);
                imageDoSomething();
            }
            case DOCUMENT -> {
                System.out.println("Es un " + DOCUMENT);
                documentDoSomething();
            }
            case VIDEO -> {
                System.out.println("Es un " + VIDEO);
                videoDoSomething();
            }
            case SOUND -> {
                System.out.println("Es un " + SOUND);
                soundDoSomething();
            }
            case UNKNOWN -> {
                System.out.println("Es un " + UNKNOWN);
                assignType(userFile);
            }
        }
    }

    private static void assignType(UserFile userFile) {

        /**
         * Los cases pueden tener multiples coincidencias, de esta manera, conociendo la extension del fichero, podemos saber de que tipo de archivo se trata
         */
        switch (userFile.getFileExtension()) {

            case PNG, JPEG -> userFile.setFileType(IMAGE);

            case MP3, WAV, WMA -> userFile.setFileType(SOUND);

            case MP4, ASF, MKV -> userFile.setFileType(VIDEO);

            case DOCX, PDF -> userFile.setFileType(DOCUMENT);

        }
    }

    private static void soundDoSomething(){

    }

    private static void imageDoSomething(){

    }

    private static void documentDoSomething(){

    }

    private static void videoDoSomething(){

    }


}
