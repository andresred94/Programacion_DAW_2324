package ejercicioAgenda;

import java.util.ArrayList;

public class Agenda {
	// -->[ ATRIBUTOS ]<--
	private ArrayList<Contacto> ListaContactos;

	// -->[ SETTERS Y GETTERS ]<--
	public ArrayList<Contacto> getListaContactos() {
		return ListaContactos;
	}

	public void setListaContactos(ArrayList<Contacto> listaContactos) {
		ListaContactos = listaContactos;
	}

	// -->[ CONSTRUCTORES ]<--
	public Agenda() {
		ListaContactos = new ArrayList<>();
	}

	// <-- [ METODOS DE LA CLASE ]-->
	public boolean añadirContactos(Contacto c) {
		if (existeContacto(c.getNombre())) {
	        System.out.println("El contacto ya existe.");
	        return true;
		} else {
	        ListaContactos.add(c);
	        System.out.println("El contacto se ha añadido correctamente.");
			return false;
		}				
	}// fin añadirContactos

	public boolean eliminarContacto(String nombre) {
		for (int i = 0; i < ListaContactos.size(); i++) {
			if (ListaContactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				ListaContactos.remove(i);
				System.out.println("El contacto se ha eliminado correctamente.");
				return true;
			}
		}
		System.out.println("El contacto no existe en la agenda.");
		return false;
	}// fin eliminarContacto

	public boolean existeContacto(String nombre) {
		for (int i = 0; i < ListaContactos.size(); i++) {
			if (ListaContactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}// fin existeContacto

	public void listarContactos() {
		for (int i = 0; i < ListaContactos.size(); i++) {
			System.out.println(ListaContactos.get(i));
		}
	}// fin listarContactos

	public int buscarContacto(String nombre) {
		int posEncontrada = 0;
		for (int i = 0; i < ListaContactos.size(); i++) {
			if (ListaContactos.get(i).getNombre().equals(nombre)) {
				posEncontrada = i + 1;
			}
		}
		return posEncontrada;
	}// fin buscarContacto

}// fin-class Agenda