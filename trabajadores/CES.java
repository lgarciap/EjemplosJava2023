import java.util.ArrayList;

public class CES {
    private ArrayList<Docente> trabajadoresDocentes;
    private ArrayList<NoDocente> trabajadorNoDocentes;

    public CES(){
        trabajadorNoDocentes = new ArrayList<NoDocente>();
        trabajadoresDocentes = new ArrayList<Docente>();
    }

    public void agregarTrabajador(String nombre, String nit, double salarioBase, int horasAusencia, String telefono, long dpi, String dir,
    String gradoCient, int antiguedad,int feriados,int tipoTrabajador){
        switch (tipoTrabajador) {
            case 1:
                Docente doc = new Docente(gradoCient, antiguedad, nombre, nit, salarioBase, horasAusencia, telefono, dpi, dir);
                trabajadoresDocentes.add(doc);
                break;
            case 2:
                NoDocente noDocente = new NoDocente(feriados, nombre, nit, salarioBase, horasAusencia, telefono, dpi, dir);
                trabajadorNoDocentes.add(noDocente);
                break;
        }
    }

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

}