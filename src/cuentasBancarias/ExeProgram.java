package cuentasBancarias;

import java.util.Scanner;

public class ExeProgram {
    private static final Scanner lector = new Scanner ( System.in );

	public static int menuBienvenida () {
        System.out.printf ( "Bienvenido a la app del banco Sin Fondos.%n" );
        System.out.printf ( "1.- Darte de alta en el banco.%n" );
        System.out.printf ( "2.- Ingresar dinero a mi cuenta.%n" );
        System.out.printf ( "3.- Retirar dinero de mi cuenta.%n" );
        System.out.printf ( "4.- Ingresar dinero a otra cuenta.%n" );
        System.out.printf ( "5.- Mostrar mi saldo.%n" );
        System.out.print ( "Escoge una opción = " );
        return lector.nextInt ();
    }// fin menuBienvenida
	
	public static void main(String[] args) {
		
        char continua;

		do {
			int op = menuBienvenida ();
			
			switch (op) {
			case 1: 
				
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
			
			System.out.print ( "¿Deseas salir? (S/N) = " );
            continua = lector.next ().charAt ( 0 );
            continua = Character.toLowerCase ( continua );

        } while ( continua == 'n' );
	}
		
	
}// fin-class ExeProgram
