public class NoDocente extends Trabajador{
    private int feriados;


    public NoDocente() {
        super();
    }

    public NoDocente(int feriados,String nombre, String nit, double salarioBase, int horasAusencia, String telefono, long dpi, String dir) {
        super(nombre, nit, feriados, feriados, telefono, feriados, dir);
        this.feriados = feriados;
    }

    public int getFeriados() {
        return this.feriados;
    }

    public void setFeriados(int feriados) {
        this.feriados = feriados;
    }

    @Override
    public String toString() {
        return "{" +
            " feriados='" + getFeriados() + "'" +
            "}";
    }

    public double calcularSalario(){
        double tarifaDiaria = salarioBase/24;
        return super.calcularSalario()+ tarifaDiaria*2*feriados;
    }


}