package ejercicioExceptiones;

import java.util.Scanner;

public class ArrayDenteros {
	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numeros [] = {1,2,3,4,5};
				
		try {			
			int n = numeros[10];
			System.out.println(n);
			
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Error: Índice fuera de los límites del array.");
			
		}
	}

}
