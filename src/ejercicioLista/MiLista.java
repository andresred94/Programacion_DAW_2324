package ejercicioLista;

import java.util.*;

public class MiLista<I> {
	private LinkedList<I> lista;
	
	public MiLista() {
		lista = new LinkedList <I>();
	}
	
	public I obtenerPrimEle(I o) {
		return lista.get(0);
	}
	
	public I obtenerUltiEle(I o) {
		return lista.getLast();
	}
	
	public void insertPorPrinc(I o) {
		lista.add(0,o);
	}
	
	public void insertPorFinal(I o) {
		lista.addLast(o);
	}
	
	public void insertPosicion (I o, int pos) {
		lista.add(pos,o);
	}
	
	public void buscarElem(I o) {
		
	}
	
	
		
	
	
	
}
