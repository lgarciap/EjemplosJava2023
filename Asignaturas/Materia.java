/**
 * 
 */
public class Materia implements Comparable{
    private String nombre;
    private double nota;

    public Materia() {
    }


    public Materia(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return " nombre: " + getNombre() +", nota:" + getNota();
    }


    @Override
    public int compareTo(Object otra) {
        // TODO Auto-generated method stub
        if (this.nota>((Materia)otra).getNota())
            return 1;
        if (this.nota<((Materia)otra).getNota())
            return -1;
        return 0;
    }
    
}