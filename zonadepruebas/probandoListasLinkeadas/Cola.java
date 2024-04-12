package probandoListasLinkeadas;

import java.util.*;

public class Cola<T> {

	private LinkedList<T> lista;

	Cola () {
		lista = new LinkedList<T>();
	}

	public void encolar(T o) {
		lista.addLast(o); // añade al final
	}

	public T frente(){
		return lista.get(0);
	}

	public T desencolar() {
		return lista.removeFirst(); // quito el primero
	}
	
	public int tamaño() {
		return lista.size();
	}
}