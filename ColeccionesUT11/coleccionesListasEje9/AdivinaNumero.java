package coleccionesListasEje9;

import java.util.*;

public class AdivinaNumero {
	Set<Integer> cifras;
	private static Scanner lector = new Scanner(System.in);
	
	public AdivinaNumero() {
		cifras = new TreeSet <Integer>();
	}
	
	public void aniadirNumero() {
		 cifras.clear(); // Limpiamos el conjunto antes de generar un nuevo número
	        for (int i = 0; i < 4; i++) {
	            int cifra;
	            do {
	                cifra = (int) (Math.random() * 9 + 1); // Genera una cifra aleatoria entre 0 y 9
	            } while (cifras.contains(cifra)); // Verifica si la cifra ya ha sido utilizada
	            cifras.add(cifra); // Agrega la cifra al conjunto
	        }
	}// fin aniadirNumero
	
	public void imprimirContenido() {
//		Iterator <Integer> it = cifras.iterator();
//		while (it.hasNext()) {
//			Integer in = (Integer) it.next();
//			System.out.printf("%d",in);
//		}
		for (Integer cifra : cifras) {
            System.out.print(cifra);
        }
	}// fin imprimirContenido
	
	public int leerNumero() {
		System.out.print("Ingresa un número de 4 cifras = ");
		return Integer.parseInt(lector.next());
		
	}// fin leerNumero
	
	public int contieneCifra (int numIngresado) {
		int contCifrasCorrectas = 0;
		String cifraNale = cifras.toString();
		String numConv = Integer.toString(numIngresado);
		System.out.printf("%s %s %n" , cifraNale, numConv);
		
		System.out.printf("tamaño cifraNale: %d%n",cifraNale.length());
		for (int j = 0; j < numConv.length(); ) {
			System.out.printf(" %c",numConv.charAt(j));
			
			for (Integer i : cifras) {
				int num = Character.getNumericValue(numConv.charAt(j));
				System.out.printf( " %d " , num);
					
				if ( num == i) {
					contCifrasCorrectas++;
				}
			}
			
			j++;
		}		
		return contCifrasCorrectas;
	}// fin contieneCifra
}// fin-class AdivinaNumero
