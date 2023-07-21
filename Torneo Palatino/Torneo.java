
import java.util.*;

/**
 * 
 */
public class Torneo {

    private Equipo equipo1;

    private Equipo equipo2;

    private Equipo equipo3;

    private Equipo equipo4;

    private Equipo equipo5;

    /**
     * 
     */
    public Torneo() {
        this.equipo1 = new Equipo();
        this.equipo2 = new Equipo();
        this.equipo3 = new Equipo();
        this.equipo4 = new Equipo();
        this.equipo5 = new Equipo();
    }

    /**
     * @return
     */
    public String toString() {
        String cadena = this.equipo1.toString(); 
        cadena = cadena + "\n\n"+ this.equipo2.toString();
        cadena = cadena + "\n\n"+ this.equipo3.toString();
        cadena = cadena + "\n\n"+ this.equipo4.toString();
        cadena = cadena + "\n\n"+ this.equipo5.toString();
        return cadena;
    }

    /**
     * Llena la información del equipo
     * @param i 
     * @param nombreEq 
     * @param pos 
     * @param tirosEsq 
     * @param ganados 
     * @param perdidos 
     * @param tirosGol 
     * @param goles 
     * @param amarillas 
     * @param rojas 
     * @param faltas
     */
    public void llenarInfoEquipos(int i, String nombreEq, int pos, int tirosEsq, int ganados, int perdidos, int tirosGol, int goles, int amarillas, int rojas, int faltas) {
        if (i == 1){
            this.equipo1.setNombre(nombreEq);
            equipo1.setPosicion(pos);
            equipo1.setAmarillas(amarillas);
            equipo1.setFaltas(faltas);
            equipo1.setGanados(ganados);
            equipo1.setGoles(goles);
            equipo1.setPerdidos(perdidos);
            equipo1.setRojas(rojas);
            equipo1.setTirosEsquina(tirosEsq);
            equipo1.setTirosAgol(tirosGol);
        }
        if (i == 2){
            equipo2.setNombre(nombreEq);
            equipo2.setPosicion(pos);
            equipo2.setAmarillas(amarillas);
            equipo2.setFaltas(faltas);
            equipo2.setGanados(ganados);
            equipo2.setGoles(goles);
            equipo2.setPerdidos(perdidos);
            equipo2.setRojas(rojas);
            equipo2.setTirosEsquina(tirosEsq);
            equipo2.setTirosAgol(tirosGol);

        }
        if (i == 3){
            equipo3.setNombre(nombreEq);
            equipo3.setPosicion(pos);
            equipo3.setAmarillas(amarillas);
            equipo3.setFaltas(faltas);
            equipo3.setGanados(ganados);
            equipo3.setGoles(goles);
            equipo3.setPerdidos(perdidos);
            equipo3.setRojas(rojas);
            equipo3.setTirosEsquina(tirosEsq);
            equipo3.setTirosAgol(tirosGol);

        }
        if (i == 4){
            equipo4.setNombre(nombreEq);
            equipo4.setPosicion(pos);
            equipo4.setAmarillas(amarillas);
            equipo4.setFaltas(faltas);
            equipo4.setGanados(ganados);
            equipo4.setGoles(goles);
            equipo4.setPerdidos(perdidos);
            equipo4.setRojas(rojas);
            equipo4.setTirosEsquina(tirosEsq);
            equipo4.setTirosAgol(tirosGol);

        }
        if (i == 5){
            equipo5.setNombre(nombreEq);
            equipo5.setPosicion(pos);
            equipo5.setAmarillas(amarillas);
            equipo5.setFaltas(faltas);
            equipo5.setGanados(ganados);
            equipo5.setGoles(goles);
            equipo5.setPerdidos(perdidos);
            equipo5.setRojas(rojas);
            equipo5.setTirosEsquina(tirosEsq);
            equipo5.setTirosAgol(tirosGol);

        }
    }

    
    /** 
     * devolver los goles del torneo
     * @return int
     */
    public int golesTorneo(){
        int total = equipo1.getGoles()+equipo2.getGoles()+equipo3.getGoles()+equipo4.getGoles()+equipo5.getGoles();
        return total;
    }

    
    /** 
     * devolver la cantidad de tiros de esquina
     * @return int
     */
    public int tirosEsquinaTorneo(){
        return equipo1.getTirosEsquina()+equipo2.getTirosEsquina()+equipo3.getTirosEsquina()+equipo4.getTirosEsquina()+equipo5.getTirosEsquina();
    }

    
    /** 
     * devolver la cantidad de tarjetas amarillas del torneo
     * @return int
     */
    public int amarillasTorneo(){
        return equipo1.getAmarillas()+equipo2.getAmarillas()+equipo3.getAmarillas()+equipo4.getAmarillas()+equipo5.getAmarillas();
    }

    /** 
     * devolver la cantidad de tarjetas rojas del torneo
     * @return int
     */
    public int rojasTorneo(){
        return equipo1.getRojas()+equipo2.getRojas()+equipo3.getRojas()+equipo4.getRojas()+equipo5.getRojas();
    }

    /** 
     * devolver la estadística de un equipo
     * @param nombreEquipo: El nombre del equipo seleccionado
     * @return String
     */
    public String estadisticasEquipos(String nombreEquipo){
        if (equipo1.getNombre().equals(nombreEquipo))
            return equipo1.toString();    
        if (equipo2.getNombre().equals(nombreEquipo))
            return equipo2.toString();
        if (equipo3.getNombre().equals(nombreEquipo))
            return equipo3.toString();
        if (equipo4.getNombre().equals(nombreEquipo))
            return equipo4.toString();
        if (equipo5.getNombre().equals(nombreEquipo))
            return equipo5.toString();

        return "No existe el equipo";

    }

}