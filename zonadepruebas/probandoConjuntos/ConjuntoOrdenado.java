package probandoConjuntos;

import java.util.*;

public class ConjuntoOrdenado {
	public static void main(String[] args) {
		Set<Integer> arbolInt = new TreeSet <Integer>();
		
		arbolInt.add(20);
		arbolInt.add(10);
		arbolInt.add(1);
		arbolInt.add(5);
		
		Iterator<Integer> it = arbolInt.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}