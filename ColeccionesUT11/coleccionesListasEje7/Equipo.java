package coleccionesListasEje7;

import java.util.*;

public class Equipo {
	private LinkedList<Jugadores> listaJugadores;
	
	public Equipo() {
		listaJugadores  = new LinkedList <Jugadores>();
	}

	public void imprimirJugadores() {
		Iterator <Jugadores> it = listaJugadores.iterator();
		while (it.hasNext()) {
			Jugadores j =it.next();
			System.out.println(j.toString());
		}
	}
	
	 public void aniadirJugador(Jugadores j) {
		 listaJugadores.addLast(j);
	 }
	 
	 public void eliminarJugadorDorsal(int dorsalJugador) {
		 Iterator <Jugadores> it = listaJugadores.iterator();
		 while (it.hasNext() ) {
			Jugadores t = (Jugadores) it.next();
			if (t.getDorsal() == dorsalJugador) {
				if (listaJugadores.remove(t) == true) {
					System.out.println("Eliminado correctamente");
				}
				break;
			}			
		}
	 }
	 
	 public void buscarJugadorNombre(String nombreJugador) {
		 Iterator<Jugadores> it = listaJugadores.iterator();
		 while (it.hasNext()) {
			Jugadores t = (Jugadores) it.next();
			if (t.getNombre().equalsIgnoreCase(nombreJugador)) {
				System.out.println(t.toString());
				break;
			}			
		}
	 }
}
