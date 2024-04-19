package probandoHashMap;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<Character, Integer> diccionario1 = new HashMap<Character, Integer>();

		diccionario1.put('a', 10); // crea una nueva entrada para 'a' y le asigna 10
		diccionario1.put('a', 7); // cambia el valor de la entrada 'a' por 7
		int valor = diccionario1.get('a');// devuelve el valor de la entrada de 'a'
		System.out.println(valor);

		// Creamos un TreeMap de String-String para representar un diccionario
		Map<String, String> diccionario = new TreeMap<>();

		// Añadimos palabras al diccionario
		diccionario.put("manzana", "Fruta comestible con piel roja o amarilla y carne blanca");
		diccionario.put("pera", "Fruta comestible con piel suave y carne jugosa");
		diccionario.put("banana", "Fruta comestible alargada con piel amarilla y carne dulce");

		// Mostramos el diccionario ordenado alfabéticamente por clave
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
