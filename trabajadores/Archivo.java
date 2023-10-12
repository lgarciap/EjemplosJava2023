import java.io.File;

public class Archivo {
    private File archivo;

    public Archivo(String nombreArchivo){
        archivo = new File(nombreArchivo);
    }
}
