package ejercicioExceptiones;
import misExcepciones.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerUnEntero {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		boolean realizado = false;
		
		do {
			try {
				System.out.print("Ingresa un número entero = ");
				a = Integer.parseInt(lector.nextLine());
				
				if (String.valueOf(a).length() > 5) {
					throw new CantDigitosExcepcion ("El número ingresado tiene más de 5 digitos ");
				}
				realizado = true;
				
				System.out.printf("El número ingresado es %d." , a);
			}  catch (NumberFormatException n) {
                System.err.printf("%nNo puedes ingresar una LETRA o un número que no sea ENTERO. Vuelve a ingresar un número ENTERO = ");
                realizado = false;
            }	catch (CantDigitosExcepcion e) {
            	System.err.println("Error: "+ e.getMessage());

			}
		} while (!realizado);		
		
		lector.close();// Si cierro el scanner en el finally me da la excepcion IllegalStateException: Scanner closed
	}
}// fin-class LeerUnEntero
