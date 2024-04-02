package ejercicioExceptiones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirDosNumeros {
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int b;
		boolean realizado = false;
		
		do {
			try {
				System.out.print("Ingresa el dividendo = ");
				a = lector.nextInt();
				System.out.print("Ingresa el divisor = ");
				b = lector.nextInt();
								
				if ( b == 0) {
					throw new ArithmeticException();
				}
				System.out.printf("%d / %d = %d " , a, b, a/b);
				realizado = true;
			} catch (ArithmeticException e1) {
				System.out.println("El divisor no puede ser 0.");

			} catch (InputMismatchException e2) {
				lector.nextLine();
				System.out.println("Tienes que ingresar un número ENTERO.");
			}
		} while (!realizado);
		
	}
}// fin - DividirDosNumeros
