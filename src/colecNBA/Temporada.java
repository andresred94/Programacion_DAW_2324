package colecNBA;

import java.util.*;

public class Temporada {
	//--[ Atributos ]--//
	//private LinkedList<Jugador> lista;
	private Set<Jugador> lista;
	
	//--[ Constructores ]--//
	public Temporada() {
		//lista = new LinkedList<Jugador>();
		lista = new TreeSet <Jugador>();
	}
	
	//--[ Métodos de la clase ]--//
	public void aniadirJugador(Jugador o) {
		//lista.addLast(o);
		System.out.println(lista.add(o) ? "Se añadió correctamente" : "No se pudo añadir");
	}
	
	public void consultaJugadorNombre(String nombJugador) {
		boolean esCierto = false;
//		for (int i = 0; i < lista.size(); i++) {
//			if (lista.get(i).getNombre().equals(nombJugador)) {
//				System.out.println(lista.get(i));
//				esCierto = true;
//			}
//		}
//		
//		if (!esCierto) {
//			System.out.println("No se encuentra el nombre del jugador en la BdD.");
//		}
		
		for (Jugador jugador : lista) {
            if (jugador.getNombre().equals(nombJugador)) {
                System.out.println(jugador);
                esCierto = true;
                break; // No necesitas continuar el bucle una vez que encuentras el jugador
            }
        }
        if (!esCierto) {
            System.out.println("No se encuentra el nombre del jugador en la BdD.");
        }
		
	}

	public void consultaJugadorCiudad(String ciudad) {
		boolean esCierto = false;
//		for (int i = 0; i < lista.size(); i++) {
//			if (lista.get(i).getCiudad().equals(ciudad)) {
//				System.out.println(lista.get(i));
//				esCierto = true;
//			}
//		}
//		if (!esCierto) {
//			System.out.println("No hay ningun jugador que sea de esa ciudad.");
//		}
		
		for (Jugador jugador : lista) {
            if (jugador.getCiudad().equals(ciudad)) {
                System.out.println(jugador);
                esCierto = true;
                break; // No necesitas continuar el bucle una vez que encuentras el jugador
            }
        }
        if (!esCierto) {
            System.out.println("No se encuentra el nombre del jugador en la BdD.");
        }
	}
	
	public void modificarCanastas(String nomJugador, int canastas) {
//		for (int i = 0; i < lista.size(); i++) {
//			if (lista.get(i).getNombre().equals(nomJugador)) {
//				lista.get(i).setNumCanastasIntro(canastas);
//			}
//		}
		for (Jugador jugador : lista) {
			if (jugador.getNombre().equals(nomJugador)) {
			jugador.setNumCanastasIntro(canastas);
			}
		}
		
	}
	
	public void borrarJugadorRangoCanastas(int canastasMin, int canastasMax) {
//		for (int i = 0; i < lista.size(); i++) {
//			if (lista.get(i).getNumCanastasIntro() >= canastasMin && lista.get(i).getNumCanastasIntro() <= canastasMax) {
//				lista.remove(i);	
//			}
//		}
		
		Iterator<Jugador> iterator = lista.iterator();
	    while (iterator.hasNext()) {
	        Jugador jugador = iterator.next();
	        if (jugador.getNumCanastasIntro() >= canastasMin && jugador.getNumCanastasIntro() <= canastasMax) {
	            iterator.remove();
	        }
	    }
	}
	
	public void mostrarContenido() {
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i).toString());
//		}
		for (Jugador jugador : lista) {
			System.out.println(jugador.toString());
		}
	}
	
	public void borrarColeccion(){
		lista.clear();
	}
		
	public void ordenarPorEquipo() {
		Set <Jugador> nuevaLista = new TreeSet <Jugador> (new CompararJugadorEquipo());
		nuevaLista.addAll(lista);
		Iterator<Jugador> iterator = nuevaLista.iterator();
	    while (iterator.hasNext()) {
	        Jugador jugador = iterator.next();
	        System.out.println(jugador.toString());
	    }
	}	
	
	public void ordenCiudadNombre() {
		LinkedList <Jugador> listaOrdenada = new LinkedList <Jugador> ();
		listaOrdenada.addAll(lista);
		for (int i = 0; i < listaOrdenada.size(); i++) {
			System.out.println(listaOrdenada.get(i).toString());
		}
	}
}// fin-class Temporada
