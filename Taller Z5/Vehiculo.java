public class Vehiculo{
    private String marca;
    private String linea;
    private int modelo;
    private String color;
    private String placa;


    public Vehiculo() {
        this.marca = "";
        this.linea = "";
        this.color = "";
        this.modelo = 0;
        this.placa = "";
    }


    public Vehiculo(String marca, String linea, int modelo, String color, String placa) {
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return this.linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", linea='" + getLinea() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", color='" + getColor() + "'" +
            ", placa='" + getPlaca() + "'" +
            "}";
    }


}