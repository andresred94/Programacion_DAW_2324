package coleccionesListasEje8;

import java.util.*;

public class Sorteo {
	Set<Integer> numPremiados;

	public Sorteo() {
		numPremiados = new TreeSet <Integer>();
	}
	
	public void aniadirNumeros() {
		 while (numPremiados.size() < 5) {
	            int n = (int) (Math.random() * 100 + 1);
	            numPremiados.add(n);
	        }
	}
	
	public void mostrarNumeros() {
		Iterator it = numPremiados.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");		
		}		
	}
}

