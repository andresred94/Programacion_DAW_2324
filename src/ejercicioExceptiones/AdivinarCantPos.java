package ejercicioExceptiones;

import java.util.Scanner;

import javax.swing.text.Position;

public class AdivinarCantPos {
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		boolean realizado = false;

		int[] numsEnteros = new int[(int) (Math.random() * 100 + 1)];

		for (int i = 0; i < numsEnteros.length; i++) {
			numsEnteros[i] = (int) (Math.random() * 10 + 1);
		}

		do {

			try {
				int pos = 1;
				do {
					System.out.printf("¿ Qué posición del vector quieres ver ? [Introduce un valor negativo para salir] = ");
					pos = Integer.parseInt(lector.nextLine());
					if (pos >= 0) {
						System.out.printf("Posisición %d: num - %d%n", pos, numsEnteros[pos]);
					}

				} while (pos >= 0);

				realizado = true;

			} catch (NumberFormatException e1) {
				System.err.println("Error: Has ingresado una LETRA o un CARACTER NO VÁLIDO.");
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.err.println("Error: El indice ingreado no existe en el array.");
			} finally {
				System.out.println("Saliendo del programa...");
			}

		} while (!realizado);

	}

}// fin-class ArrayDenteros
