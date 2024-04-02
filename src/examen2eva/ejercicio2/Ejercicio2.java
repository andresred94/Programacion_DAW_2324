package examen2eva.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	static Scanner lector = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("¿Cuantos hombres hay en la empresa?");
		int canthombres = lector.nextInt();
		System.out.println("¿Cuantas mujeres hay en la empresa?");
		int cantMujeres = lector.nextInt();
		
		double [][] salarios;
		salarios = new double [0][canthombres];
		salarios = new double [1][cantMujeres];
		
		double promHom=0;
		double promMujeres=0;
		
		for (int j = 0; j < salarios[0].length; j++) {
			System.out.println("¿Ingresa los salarios de los hombres?");
			salarios[0][j]= lector.nextDouble();
			promHom = promHom + salarios[0][j];
		}
		
		for (int j = 0; j < salarios[0].length; j++) {
			System.out.println("¿Ingresa los salarios de las mujeres?");
			salarios[0][j]= lector.nextDouble();
			promMujeres = promMujeres + salarios[0][j];
		}
		
		promHom = promHom / canthombres;
		System.out.printf("Sueldo promedio de hombres: %.2f euros.%n", promHom);
		
		promMujeres = promMujeres / cantMujeres;
		System.out.printf("Sueldo promedio de mujere: %.2f euros.%n", promMujeres);
		
		
		
		
	}// fin-main 
		
}// fin-class Ejercicio2
