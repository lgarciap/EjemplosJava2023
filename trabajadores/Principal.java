import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        CES ispjae = new CES();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al Instituto Superior Politécnico José Antonio Echeverría");
        ispjae.agregarTrabajador("Sandra", "1231230-4",400 , 1, "23456789", 12341234, "La Habana. Cuba","Maestria", 12,0,1);
        System.out.println(ispjae.calcularPlanilla(true,true));


    }
}