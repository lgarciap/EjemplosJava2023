import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalBingo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		Bingo miBingo = new Bingo();
		//Se muestra el menú
		int opcion = menu();
		NumberFormat formatoQ = NumberFormat.getCurrencyInstance();
		NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(Locale.US);
	
		
		System.out.println("Bienvenido al Bingo de los números Pares\n");
		while (opcion !=3){
			if (opcion == 1){ //Opcion jugar
				if (miBingo.getSaldo()>=12){//Significa que aún hay saldo
					miBingo.jugar();
					if (miBingo.gano()){ //Si ganó
						//miBingo.getSaldo(); //Obtiene el saldo
						System.out.println("¡Bien! Ha ganado");
						System.out.println(miBingo);
					}
					else
					{
						System.out.println(miBingo);
						System.out.println("Lo siento ha perdido");
					}
				}
				else{
					System.out.println("Usted no tiene saldo para seguir jugando");
					opcion = 3;
				}
				opcion = menu();
			}
			if (opcion == 2){
				System.out.println("Su saldo acumulado en quetzales es:" + formatoQ.format(miBingo.getSaldo())); //Se muestra el saldo en quetzales
				System.out.println("Su saldo acumulado en dólares es:" + formatoDolar.format(miBingo.convertirAdolares(7.83))); //Se muestra el saldo en dólares
				opcion = menu();
			}
		}
		
		System.out.println("Gracias por participar");
		System.out.println("Usted se lleva "+formatoQ.format(miBingo.getSaldo()));
			
    }

    public static int menu(){
		Scanner teclado = new Scanner(System.in);
		String opString = ""; //Opción sin validar
		boolean bueno = false;
		int opcion = 0; //opcion para validar

		while (!bueno){
			System.out.println("Menú");
			System.out.println("1. Jugar");
			System.out.println("2. Mostrar Saldo");
			System.out.println("3. Salir");
			System.out.println("\nSeleccione la opción que desea: ");
			opString = teclado.nextLine();
			
			try{
				opcion = Integer.parseInt(opString);
				if (opcion<1 || opcion>3) //DEbe ser una opción válida
					System.out.println("Debe ingresar una de las opciones del menú");
				else
					bueno = true;
			}
			catch(Exception e){
				System.out.println("Debe ingresar un número entero\n");
			}
		}
		return opcion;
	}
}