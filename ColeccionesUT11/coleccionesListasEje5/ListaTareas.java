package coleccionesListasEje5;

import java.util.*;

public class ListaTareas <Tarea> {
	private LinkedList<Tarea> listaTareas;

	public ListaTareas () {
		listaTareas = new LinkedList<Tarea> ();
	}
	
	public void apilar (Tarea t) {
		listaTareas.addLast(t);
	}
	
	public Tarea desapilar() {
		return listaTareas.removeLast();
	}

	public Tarea cima() {
		return listaTareas.getLast();
	}
	
	public int tamaño() {
		return listaTareas.size();
	}
	
	
}
