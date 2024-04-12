package probandoListasLinkeadas;

import java.util.*;

public class Pila<T> {

	private LinkedList<T> lista;

	Pila() {
		lista = new LinkedList<T>();
	}

	public void apilar(T o) {
		lista.addLast(o);
	}

	public T cima() {
		return lista.getLast();
	}

	public T desapilar() {
		return lista.removeLast();
	}

	public int tamaño() {
		return lista.size();
	}

}
