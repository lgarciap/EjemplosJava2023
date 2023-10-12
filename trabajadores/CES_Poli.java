import java.util.ArrayList;

public class CES_Poli {
    private ArrayList<Trabajador> trabajadores;
    private Archivo trabajadorCSV;
    

    public CES_Poli(){
       trabajadores = new ArrayList<Trabajador>();
       trabajadorCSV = new Archivo("trabajadores.csv");
    }

    
    /** 
     * Agrega un trabajador a la lista
     * @param nombre
     * @param nit
     * @param salarioBase
     * @param horasAusencia
     * @param telefono
     * @param dpi
     * @param dir
     * @param gradoCient
     * @param antiguedad
     * @param feriados
     * @param tipoTrabajador
     */
    public void agregarTrabajador(String nombre, String nit, double salarioBase, int horasAusencia, String telefono, long dpi, String dir,
    String gradoCient, int antiguedad,int feriados,int tipoTrabajador){
        switch (tipoTrabajador) {
            case 1:
                Docente doc = new Docente(gradoCient, antiguedad, nombre, nit, salarioBase, horasAusencia, telefono, dpi, dir);
                trabajadores.add(doc);
                break;
            case 2:
                NoDocente noDocente = new NoDocente(feriados, nombre, nit, salarioBase, horasAusencia, telefono, dpi, dir);
                trabajadores.add(noDocente);
                break;
        }
    }

    
    /** 
     * @return double
     */
    /* 
    public double calcularPlanilla(boolean docente, boolean noDocente){
        double suma = 0;
        if (docente)
            for (Docente doc:trabajadoresDocentes)
                if (doc != null)    
                    suma = suma + doc.calcularSalario();
        if (noDocente)
            for (NoDocente noDoc:trabajadorNoDocentes)
                if (noDoc != null)
                    suma = suma + noDoc.calcularSalario();
        return suma; 
    }
    */

    public double calcularPlanilla(){
        double suma = 0;
        for (Trabajador trab:trabajadores){
            suma = suma + trab.calcularSalario();
        }
        return suma;
    }

    public double calcularPlanillaDoc(){
        double suma = 0;
        for (Trabajador trab:trabajadores){
           if (trab instanceof Docente){
                suma = suma + trab.calcularSalario();
           }
        }
        return suma; 

    }

    public double calcularPlanillaNoDoc(){
        double suma = 0;
        for (Trabajador trab:trabajadores){
            if (trab instanceof NoDocente){
                suma = suma + trab.calcularSalario();
            }
        }
        return suma; 

    }

}