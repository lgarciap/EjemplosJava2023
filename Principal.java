/*
 * @author: POO seccion 20
 * @date: 13/07/2023
 * @version: clase 1
 * Esta clase creará objetos del tipo Perro. 
 *  */
public class Principal{
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        Perro miPerro;
        miPerro = new Perro();
        System.out.println("El perro por defecto");
        System.out.println("----------------------");
        System.out.println(miPerro);
        //Laika
        miPerro.setNombre("Laika");
        miPerro.setEdad(9);
        miPerro.setColor("negro");
        miPerro.setGenero("hembra");
        miPerro.setTamanio("mediano");
        miPerro.setRaza("labrador");
        //imprimimos Laika
        System.out.println("\nMi perra:");
        System.out.println("----------------------");
        System.out.println(miPerro);
        // Bruno
        Perro otroPerro = new Perro();
        otroPerro.setNombre("Bruno");
        otroPerro.setColor("champan");
        otroPerro.setEdad(1);
        otroPerro.setGenero("macho");
        otroPerro.setRaza("pug");
        otroPerro.setTamanio("pequeño");
        //Imprimimos a bruno
        System.out.println(otroPerro);

    }
}