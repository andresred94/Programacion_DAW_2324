package lecturaQuijote;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		LecturaQuijote l1 = new LecturaQuijote();
		System.out.print("Ingresa el nombre del fichero = ");
		String nombFich = lector.nextLine();
		System.out.printf("En un fichero llamado %s hay...%n", nombFich);
		try {
			int letMinusculas = l1.contarLetrasMinusculas(nombFich);
			System.out.printf("letras minúsculas (sin acentuar ni diéresis) = %d%n" , letMinusculas);
			
			int letrasPuras = l1.contarLetrasPuras(nombFich);
			System.out.printf("letras puras (minúsculas, mayúsculas, acentuadas, etc.) = %d%n",letrasPuras);
			
			int lineas = l1.contarLineas(nombFich);
			System.out.printf("lineas del fichero = %d%n" , lineas);
		
			int palabras =  l1.contarPalabras(nombFich);
			System.out.printf("palabras = %d%n" , palabras);
			String silaba = "oz";
			System.out.printf("Palabras terminadas en %s:%n", silaba);
			TreeSet<String> lista = l1.palabrasTerminadas(nombFich,silaba);
			System.out.printf("hay %d palabras terminadas en -%s-%n" , lista.size() , silaba);
			for (String s : lista) {
				System.out.println(s);
			}

			System.out.printf("palabra(s) más larga(s) =  %n");
			l1.palabraMasLarga(nombFich);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
