public class Trabajador{
    protected String nombre;
    protected String nit;
    protected double salarioBase;
    protected int horasAusencia;
    protected String telefono;
    protected long dpi;
    protected String dir;


    public Trabajador() {
        nombre = "";
        nit = "";
        salarioBase = 0;
        horasAusencia = 0;
        telefono = "";
        dpi = 0;
        dir = "";
    }


    public Trabajador(String nombre, String nit, double salarioBase, int horasAusencia, String telefono, long dpi, String dir) {
        this.nombre = nombre;
        this.nit = nit;
        this.salarioBase = salarioBase;
        this.horasAusencia = horasAusencia;
        this.telefono = telefono;
        this.dpi = dpi;
        this.dir = dir;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasAusencia() {
        return this.horasAusencia;
    }

    public void setHorasAusencia(int horasAusencia) {
        this.horasAusencia = horasAusencia;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getDpi() {
        return this.dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public String getDir() {
        return this.dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nit='" + getNit() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            ", horasAusencia='" + getHorasAusencia() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", dpi='" + getDpi() + "'" +
            ", dir='" + getDir() + "'" +
            "}";
    }

    public double calcularSalario(){
        double tarifaHoraria =  salarioBase/192;
        double descXausencia = tarifaHoraria*horasAusencia;
        double salarioGral = salarioBase - descXausencia;
        return salarioGral;
    }

}