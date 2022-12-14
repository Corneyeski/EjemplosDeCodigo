package clases.enums.entities;

/**
 * A los ENUM, ademas de definir los valores que queramos, podemos tambien añadirles propiedades, como por ejemplo, un nombre.
 * Esto nos permitira obtener un valor de tipo especifico (String, int, char etc) y despues podremos obtener ese valor con su get
 */
public enum FileExtension {
    PNG(".png"),
    JPEG(".jpeg"),
    MP3(".mp3"),
    MP4(".mp4"),
    DOCX(".docx"),
    PDF(".pdf"),
    WAV(".wav"),
    WMA(".wma"),
    MKV(".mkv"),
    ASF(".asf");

    private final String extensionName;

    FileExtension(String extensionName) {
        this.extensionName = extensionName;
    }

    @Override
    public String toString() {
        return this.extensionName;
    }
}
