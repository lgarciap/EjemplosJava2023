public class Trabajador{
    private String nombre;
    private String nit;
    private long dpi;


    public Trabajador() {
        this.nombre = "";
        this.nit = "";
        this.dpi=0;
    }


    public Trabajador(String nombre, String nit, long dpi) {
        this.nombre = nombre;
        this.nit = nit;
        this.dpi = dpi;
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

    public long getDpi() {
        return this.dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nit='" + getNit() + "'" +
            ", dpi='" + getDpi() + "'" +
            "}";
    }


}