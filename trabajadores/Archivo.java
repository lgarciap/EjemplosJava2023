import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
    private File archivo;

    public Archivo(String nombreArchivo){
        archivo = new File(nombreArchivo);

    }

    public void escribirArchivo(ArrayList<Trabajador> trabajadores) throws Exception{
        PrintWriter escritor = new PrintWriter(archivo, "UTF-8");
        //String nombre, String nit, double salarioBase, int horasAusencia, String telefono, long dpi, String dir
        String linea = "Nombre,Nit,SalarioBase,HorasAusencia,Telefono,dpi,dir,TipoTrabajador,Antiguedad,GradoCientifico,feriados\n";
        escritor.print(linea);
        for (Trabajador trab:trabajadores){
            linea = trab.getNombre() + "," +trab.getNit() + "," + trab.getSalarioBase() + "," + trab.getHorasAusencia() + "," + trab.getTelefono() + "," + trab.getDpi() + ","+trab.getDir()+",";
            if (trab instanceof Docente)
                linea = linea + "1"+ ","+((Docente)trab).getAntiguedad()+","+((Docente)trab).getGradoCient()+",";
            else
                linea = linea + "2"+","+","+","+((NoDocente)trab).getFeriados();
            escritor.println(linea);
        }
        escritor.close();
    }
}
