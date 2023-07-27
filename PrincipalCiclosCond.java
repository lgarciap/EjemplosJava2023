import java.util.Scanner;
public class PrincipalCiclosCond{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opciones = "Bienvenidos a mi menú\n1: Opción1\n2: Opcion2\n3: Opcion3\n4: Salir";
        int op = 1;
        while (op<4 && op>=1){
            System.out.println(opciones);
            System.out.println("Ingrese la opción deseada");
            op = teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1:{
                    System.out.println("Usted seleccionó la opción 1");
                    System.out.println("Ahora yo voy a hacer lo que sea que hace ");
                    System.out.println("la opción 1");
                    break;
                }
                case 2:{
                    System.out.println("Usted seleccionó la opción 2");
                    System.out.println("Ahora yo voy a hacer lo que sea que hace ");
                    System.out.println("la opción 2");
                    break;
                }
                case 3:{
                    System.out.println("Usted seleccionó la opción 3");
                    System.out.println("Ahora yo voy a hacer lo que sea que hace ");
                    System.out.println("la opción 3");
                    break;
                }
                case 4: {
                    System.out.println("¿Me botaste? ¡Adios!");
                }

            }
        }
    }
}