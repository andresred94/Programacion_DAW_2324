package colecAlquilerVivienda;

import java.util.LinkedList;

import colecAlquilerVivienda.Vivienda.TP_VIVIENDA;

public class Inmobiliaria {
	//--[ Atributos ]--//
	private LinkedList<Vivienda> lista;
	
	//--[ Constructores ]--//
	public Inmobiliaria() {
		lista = new LinkedList<Vivienda>();
	}
	
	//--[ Métodos de la clase ]--//
	public void aniadirVivienda(Vivienda o) {
		lista.addLast(o);
	}	
	public void mostrarContenido() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
	}	
	public void consultaViviendaPrecio(double precioMin, double precioMax) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPrecio() > precioMin && lista.get(i).getPrecio() < precioMax) {
				System.out.println(lista.get(i).toString());
			}
		}
	}
	
	public void consultaViviendaCategoria(TP_VIVIENDA categoria) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCategoria().toString().equals(categoria.toString())) {
				System.out.println(lista.get(i).toString());
			}
		}		
	}
	
	
	
}// fin-class Inmobiliaria
