import java.util.Scanner;

import javax.security.auth.SubjectDomainCombiner;
public class DatosYexpresiones{
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        System.out.println(cadena);

        cadena = "Hola Mundo a todo el \"mundo\"";
        System.out.println(cadena);
        
        String cadena1 = "Hola", cadena2="mundo";
        //Concatenación de cadenas
        cadena = cadena1+" "+cadena2; 
        System.out.println(cadena);

        int numero1 = 10;
        short numero2 = 15;
        float numero3 = 0.5f;

        int numero = numero2;
        numero2 = (short)numero;

        System.out.println(numero);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su nombre: ");

        System.out.println("Bienvenid@ "+nombre);

    }
}