package probandoConjuntos;

import java.util.*;

public class ConjuntoPrueba {
	public static void main(String[] args) {
		Set<String> arbolString = new TreeSet<String>();
		for (int i = 0; i < 20; i++) {
			
			if (arbolString.add("Cadena número " + i % 10))
				System.out.println("Añadiendo número " + i % 10);
			else System.out.println("El número " + i % 10 + " no se ha añadido");

		}

		System.out.println("La colección tiene " + arbolString.size()
				+ " elementos.");

	}
}
