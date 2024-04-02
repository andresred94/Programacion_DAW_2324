package examen2eva.ejercicio1;
public class Ejercicio1 {
	
	public static void main(String[] args) {
		String pal1 = "amar";
		String pal2 = "Mora";
		
		if (sonAnagramas(pal1, pal2)) {
			System.out.println("Las palabras son anagramas");
		} else {
			System.out.println("No son anagramas");
		}
			
		
	}// fin main
	
	public static boolean sonAnagramas(String palabra1, String palabra2) {
		int longitudPal1 = palabra1.length();
		int longitudPal2 = palabra2.length();
		palabra1.toLowerCase();
		palabra2.toLowerCase();
		if (longitudPal1 == longitudPal2) {
			for (int i = 0; i < palabra1.length(); i++) {
				char c = palabra1.charAt(i);
				for (int j = 0; j < palabra2.length(); j++) {
					char d = palabra2.charAt(j);
					if (c == d ) {
						return true;
					}
				}
			}
		}
		return false;

		
	}// fin sonAnagramas
	
}//fin-class Ejercicio1
