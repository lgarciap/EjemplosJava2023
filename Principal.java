/*
 * @author: POO seccion 20
 * @date: 13/07/2023
 * @version: clase 1
 * Esta clase creará objetos del tipo Perro. 
 *  */
import java.util.Scanner;
public class Principal{
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        Perro miPerro;
        Scanner teclado = new Scanner(System.in);
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

        //Vamos a ingresar un perro
        System.out.println("Ingrese los datos de su Perro: ");
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el nombre de su perro: ");
        String nombrePerro = teclado.nextLine();
        System.out.println("Ingrese la edad de su perro: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el tamaño de su perro (pequeño,mediano,grande,gigante): ");
        String tamanioPerro = teclado.nextLine();
        System.out.println("Ingrese el género de su perro (hembra,macho): ");
        String generoPerro = teclado.nextLine();
        System.out.println("Ingrese la raza de su perro: ");
        String razaPerro = teclado.nextLine();
        System.out.println("Ingrese el color de su perro: ");
        String colorPerro = teclado.nextLine();

        Perro nuevoPerro = new Perro();
        nuevoPerro.setNombre(nombrePerro);
        nuevoPerro.setColor(colorPerro);
        nuevoPerro.setEdad(edad);
        nuevoPerro.setGenero(generoPerro);
        nuevoPerro.setTamanio(tamanioPerro);
        nuevoPerro.setRaza(razaPerro);

        System.out.println("Revise los datos de su mascota: ");
        System.out.println(nuevoPerro);



    }
}