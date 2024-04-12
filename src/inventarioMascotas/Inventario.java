package inventarioMascotas;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
	private ArrayList <Mascota> animales = new ArrayList();
	
	private String getTipoMascota(Mascota m) {
//		String tipoMascota = "";
//		if (m instanceof Gato) {
//			tipoMascota = "Gato";
//		} else if (m instanceof Perro) {
//			tipoMascota = "Perro";
//		} else if (m instanceof Loro) {
//			tipoMascota = "Loro";
//		} else if (m instanceof Canario) {
//			tipoMascota = "Canario";
//		}
		
		return m.getClass().getSimpleName();
	}
	
	public void mostrarListaAnimales() {
		Mascota m;
		for (int i = 0; i < animales.size(); i++) {
			m = animales.get(i);
			String tipoAnimal = getTipoMascota(m);
			String nombreAnimal = animales.get(i).getNombre();
			System.out.printf("TipoAnimal:%s Nombre:%s%n", tipoAnimal, nombreAnimal);
		}
	}
	
	public void mostrarUnAnimal (String nombre) {
		Mascota m;
		for (int i = 0; i < animales.size(); i++) {
			m = animales.get(i);
			String nombreAnimal = animales.get(i).getNombre();
			if (nombre.equals(nombreAnimal)) {
				m.muestra();
			}
		}		
	}
	
	public void mostrarTodosAnimales() {
		Mascota m;
		for (int i = 0; i < animales.size(); i++) {
			m = animales.get(i);
			m.muestra();
		}
		
		if (animales.size() == 0) {
			System.out.println("La lista está vacia.");
		}
	}
	
	public void insertarAnimal (Mascota a){
		animales.add(a);
	}
	
	public boolean eliminarAnimal (String nombre) {
		Iterator <Mascota> it1 = animales.iterator();
		boolean eliminado = false;
		while (it1.hasNext()) {
			if (it1.next().getNombre().equals(nombre)) {
				it1.remove();
				eliminado = true;
			}
		}
		if (eliminado) {
			System.out.printf("%s se ha eliminado correctamente.%n",nombre);
		} else {
			System.out.println("No se ha podido eliminar.");	
		}

		return eliminado;
	}
	
	public void vaciarInventario() {
		animales.clear();
	}
	
}// fin - class Inventario
