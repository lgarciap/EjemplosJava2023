public class Docente extends Trabajador{
    private String gradoCient;
    private int antiguedad;


    public Docente() {
        super();
        gradoCient = "";
        antiguedad = 0;    
    }


    public Docente(String gradoCient, int antiguedad,String nombre, String nit, double salarioBase, int horasAusencia, String telefono, long dpi, String dir) {
        super(nombre, nit, salarioBase, horasAusencia, telefono, dpi, dir);
        this.gradoCient = gradoCient;
        this.antiguedad = antiguedad;
    }


    public String getGradoCient() {
        return this.gradoCient;
    }

    public void setGradoCient(String gradoCient) {
        this.gradoCient = gradoCient;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    @Override
    public String toString() {
        return "{" +
            " gradoCient='" + getGradoCient() + "'" +
            ", antiguedad='" + getAntiguedad() + "'" +
            "}";
    }

    public double plusGradoCientifico(){
        if (this.gradoCient.equals("Maestria"))
            return 80;
        if (this.gradoCient.equals("Doctorado"))
            return 120;
        return 0;
    }

    public double plusAntiguedad(){
        return antiguedad%5 * 20; 
    }

    public double calcularSalario(){
        return super.calcularSalario()+plusAntiguedad() + plusGradoCientifico();
        
    }



}