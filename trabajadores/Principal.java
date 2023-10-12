import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        CES_Poli ispjae = new CES_Poli();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al Instituto Superior Politécnico José Antonio Echeverría");
        ispjae.agregarTrabajador("Sandra", "1231230-4",400 , 1, "23456789", 12341234, "La Habana. Cuba","Maestria", 12,0,1);
        ispjae.agregarTrabajador("Rafael", "1231340-4",300 , 3, "23453349", 12341123, "Marianao. La Habana. Cuba","", 0,2,2);
        ispjae.agregarTrabajador("Maria", "1231240-4",350 , 0, "23451234", 12341009, "Cerro. La Habana. Cuba","", 0,1,2);
        ispjae.agregarTrabajador("Pedro", "1231230-4",600 , 0, "23556789", 12671234, "Centro Habana. Cuba","Doctorado", 40,0,1);
        System.out.println(ispjae.calcularPlanilla());
        System.out.println(ispjae.calcularPlanillaDoc());
        System.out.println(ispjae.calcularPlanillaNoDoc());


    }
}