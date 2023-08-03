import java.text.NumberFormat;
import java.util.Random;
public class PrincipalEjemploAliasyClases{
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        Perro miOtroPerro = new Perro();
       /* System.out.println(miPerro);
        System.out.println(miOtroPerro);
        miPerro.setNombre("Laika");
        miPerro.setEdad(9);
        miPerro.setColor("negro");
        miPerro.setRaza("Labrador");
        miPerro.setTamanio("Mediano");
        miPerro.setGenero("hembra");
        miOtroPerro.setNombre("Lisa");
        miOtroPerro.setEdad(1);
        miOtroPerro.setColor("manto negro");
        miOtroPerro.setRaza("Pastor Alemán");
        miOtroPerro.setTamanio("Mediano");
        miOtroPerro.setGenero("Hembra");
        System.out.println(miPerro);
        System.out.println(miOtroPerro);
        miPerro = miOtroPerro;
        System.out.println(miPerro);
        System.out.println(miOtroPerro);
        
        miPerro.setEdad(2);
        miOtroPerro.setNombre("Lisa Garcia Perez");
        
        System.out.println(miPerro);
        System.out.println(miOtroPerro);*/
        //RANDOM
        Random generadorRandom = new Random(); //crea el generador de números aleatorios
        int miNumero = generadorRandom.nextInt(10);
        System.out.println(miNumero);
        //generadorRandom.setSeed(123);
        int miNumero2 = generadorRandom.nextInt(10);
        System.out.println(miNumero2);
        //nextInt(HASTA-DESDE+1)+DESDE
        int miNumero3 = generadorRandom.nextInt(6-1+1)+1;
        System.out.println("Números entre 1 y 6");
        System.out.println(miNumero3);
        System.out.println("Raiz cuadrada de numero aleatorio 1");
        System.out.println(Math.sqrt(miNumero));

        //Number Format
        
        System.out.println(NumberFormat.getInstance().format(100000000));
        System.out.println(NumberFormat.getCurrencyInstance().format(100000000));
       
    }
}