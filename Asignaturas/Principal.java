import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Semestre primerCiclo = new Semestre();
        SemestreDinamico primerCiclo = new SemestreDinamico();
        String nombreAsig = "";
        double notaAsig = 0;
        String opciones = "1.Agregar Asignaturas\n2.Mostrar Asignaturas\n3.Calcular Promedio General\n4.Clase que mejor va\n5.Mejores cursos\n6.Peores Cursos\n7.Salir";
        int op = 0;
        /*System.out.println(opciones);
        System.out.println("Ingrese la opción deseada: ");
        op = teclado.nextInt();
        teclado.nextLine();*/
        while (op>=0 && op<7){
            try {
                System.out.println(opciones);
                System.out.println("Ingrese la opción deseada: ");
                op = teclado.nextInt();
                teclado.nextLine();
                switch (op) {
                    case 1:
                        int i = 0;
                        //while (i<5){
                            if (i < 5){
                                System.out.println("Ingrese el nombre la materia: ");
                                nombreAsig = teclado.nextLine();
                                System.out.println("Ingrese la nota: ");
                                notaAsig = teclado.nextDouble();
                                teclado.nextLine();
                                primerCiclo.agregarAsignatura(nombreAsig, notaAsig);
                                i++;
                            }
                            else
                                System.out.println("No puede ingresar más de 5 asignaturas");

                        //}
                        System.out.println(opciones);
                        System.out.println("Ingrese la opción deseada: ");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    case 2:
                        //Mostrar Asignaturas
                        System.out.println("Mostrar Asignaturas\n---------------------------------\n");
                        System.out.println(primerCiclo);
                        System.out.println(opciones);
                        System.out.println("Ingrese la opción deseada: ");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    case 3: 
                        //Calcular promedio general
                        System.out.println("Calcular promedio general\n---------------------------------\n");
                        System.out.println(primerCiclo.calcularPromedio());
                        System.out.println(opciones);
                        System.out.println("Ingrese la opción deseada: ");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    case 4:
                        //Clase que mejor va
                        System.out.println("Clase que mejor va\n---------------------------------\n");
                        System.out.println(primerCiclo.mejorClase());
                        System.out.println(opciones);
                        System.out.println("Ingrese la opción deseada: ");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    case 5: 
                        //Mejores cursos
                        System.out.println("Mejores cursos\n---------------------------------\n");
                        System.out.println(opciones);
                        System.out.println("Ingrese la opción deseada: ");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    case 6: 
                        //Peores cursos
                        System.out.println("Peores cursos\n---------------------------------\n");
                        System.out.println(opciones);
                        System.out.println("Ingrese la opción deseada: ");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        break;
                }
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("\nDebe ingresar un número (:() \n");
                System.out.println(e.getMessage());
                op=0;
                teclado.nextLine();
            }   
        }
        
    }
}