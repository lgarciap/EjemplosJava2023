

/**
 * 
 */
public class Equipo {

    /**
     * Default constructor
     */
    public Equipo() {
    }

    /**
     * nombre del equipo
     */
    private String nombre;

    /**
     * 
     */
    private int posicion;

    /**
     * 
     */
    private int tirosEsquina;

    /**
     * 
     */
    private int ganados;

    /**
     * 
     */
    private int perdidos;

    /**
     * 
     */
    private int tirosAgol;

    /**
     * 
     */
    private int goles;

    /**
     * 
     */
    private int amarillas;

    /**
     * 
     */
    private int rojas;

    /**
     * 
     */
    private int faltas;

    /**
     * 
     */
    public void Equipo() {
        nombre = "";
        posicion = 1;
        tirosEsquina=0;
        ganados = 0;
        perdidos = 0;
        tirosAgol = 0;
        goles = 0;
        amarillas = 0;
        rojas = 0;
        faltas = 0;
    }

    /**
     * @return
     */
    public String toString() {
        String cadena = "Información del Equipo:\n";
        cadena = cadena + "Nombre: " + nombre+"\n";
        cadena = cadena + "Posición en el torneo: " + posicion+"\n";
        cadena = cadena + "Tiros de esquina en el torneo: " + tirosEsquina+"\n";
        cadena = cadena + "Tiros a Gol en el torneo: " + tirosAgol +"\n";
        cadena = cadena + "Juegos ganados: " + ganados +"\n";
        cadena = cadena + "Juegos perdidos: " + perdidos +"\n";
        cadena = cadena + "Cantidad de goles: " + goles +"\n";
        cadena = cadena + "Cantidad de tarjetas amarillas: " + amarillas +"\n";
        cadena = cadena + "Cantidad de tarjetas rojas: " + rojas +"\n";
        cadena = cadena + "Cantidad de tarjetas faltas: " + faltas +"\n";
        return cadena;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param value
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param value
     */
    public void setPosicion(int posicion) {
       this.posicion = posicion;
    }

    /**
     * @return
     */
    public int getTirosEsquina() {
        return tirosEsquina;
    }

    /**
     * @param value
     */
    public void setTirosEsquina(int tirosEsq) {
       this.tirosEsquina = tirosEsq;
    }

    /**
     * @return
     */
    public int getGanados() {
        return ganados;
    }

    /**
     * @param value
     */
    public void setGanados(int ganados) {
       this.ganados = ganados;
    }

    /**
     * @return
     */
    public int getPerdidos() {
        return perdidos;
    }

    /**
     * @param value
     */
    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    /**
     * @return
     */
    public int getTirosAgol() {
        return tirosAgol;
    }

    /**
     * @param value
     */
    public void setTirosAgol(int tiros) {
       this.tirosAgol = tiros;
    }

    /**
     * @return
     */
    public int getGoles() {
        return goles;
    }

    /**
     * @param value
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * @return
     */
    public int getAmarillas() {
        return amarillas;
    }

    /**
     * @param value
     */
    public void setAmarillas(int amarillas) {
       this.amarillas = amarillas;
    }

    /**
     * @return
     */
    public int getRojas() {
        return rojas;
    }

    /**
     * @param value
     */
    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    /**
     * @return
     */
    public int getFaltas() {
            return faltas;
    }

    /**
     * @param value
     */
    public void setFaltas(int faltas) {
       this.faltas = faltas;
    }

}