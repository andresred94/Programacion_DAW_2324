package juegoAdivinaNumero;

import java.util.Scanner;

import misExcepciones.CantDigitosExcepcion;

public class Main {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int random = (int)( Math.random() * 98 + 1 );
		
		boolean adivinado = false;
		System.out.println(random);
		do {
			System.out.printf("Adivina un número del 1 al 99%n"
					+ " [  para salir ingresa -1 ]%n"
					+ " ingresa un número = ");
			int n = Integer.parseInt(lector.nextLine());
			try {
				if (String.valueOf(n).length() > 2) {
					throw new CantDigitosExcepcion("El número no debe ser mayor que 99");
				}
			} catch (CantDigitosExcepcion e) {
				System.err.println(e.getMessage());
			}
			
			if(n == random) {
				adivinado = true;
				System.out.println("¡Enhorabuena lo has adivinado!");
			} else if ( n == -1 ) {
				adivinado = true;
				System.out.println("Saliendo...");
			}
			
		} while (!adivinado);
		
	}
}
