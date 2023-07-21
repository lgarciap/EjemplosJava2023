
import java.util.Scanner;

/**
 * 
 */
public class PrincipalTorneo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Torneo palatino = new Torneo();
        System.out.println("Bienvenido a las Estadísticas de Torneo Palatino: \n\n");
        System.out.println("Ingrese la siguiente información: \n");
        String nombre = "";
        int pos=0,tirosEsq=0, ganados=0, perdidos = 0;
        int tirosG = 0, goles = 0, tA = 0, tR = 0, faltas = 0;
        for (int i=1;i<6;i++){
            System.out.println("Nombre del equipo: ");
            nombre = teclado.nextLine();
            System.out.println("Posición en el torneo: ");
            pos = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Tiros de esquina: ");
            tirosEsq = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Juegos ganados: ");
            ganados = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Juegos perdidos: ");
            perdidos = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Tiros a Gol: ");
            tirosG = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Cantidad de goles: ");
            goles = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Cantidad de tarjetas amarillas: ");
            tA = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Cantidad de tarjetas rojas: ");
            tR = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Cantidad de faltas: ");
            faltas = teclado.nextInt();
            teclado.nextLine();
               palatino.llenarInfoEquipos(i,nombre,pos,tirosEsq,ganados,perdidos,tirosG,goles,tA,tR,faltas);

        }
        System.out.println(palatino);
        System.out.println("Estadísticas: \n\n");
        System.out.print("Goles del torneo: ");
        System.out.println(palatino.golesTorneo());
        System.out.print("Tiros de Esquina del torneo: ");
        System.out.println(palatino.tirosEsquinaTorneo());
        System.out.print("Tarjetas amarillas del torneo: ");
        System.out.println(palatino.amarillasTorneo());
        System.out.print("Tarjetas rojas del torneo: ");
        System.out.println(palatino.rojasTorneo());

        System.out.println("Ingrese el nombre del equipo que quiere consultar ");
        nombre = teclado.nextLine();
        System.out.println(palatino.estadisticasEquipos(nombre));
    }

}