package coleccionesListasEje7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {	
	
	
	public static void main(String[] args) {
		Equipo equipo = new Equipo();
		ArrayList <Jugadores> lista_jugadores = new ArrayList <Jugadores>();
		
		// añadir jugadores a la lista
//		e.aniadirJugador(new Jugadores("Messi",10));
//		e.aniadirJugador(new Jugadores("ElBicho",12));
//		e.aniadirJugador(new Jugadores("Ronaldinho",11));
		String nombreArchivo =  "Jugadores.txt";
		Jugadores j1 = new Jugadores("Messi",10);
		Jugadores j2 = new Jugadores("ElBicho",12);
		Jugadores j3 = new Jugadores("Ronaldinho",11);
		
		lista_jugadores.add(j1);
		lista_jugadores.add(j2);
		lista_jugadores.add(j3);
				
		String nombreArchi = "\\..\\archivos\\nombArchi";
		nombreArchi.replaceAll("nombArchi", nombreArchivo);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchi.replaceAll("nombArchi", nombreArchivo)));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchi.replaceAll("nombArchi", nombreArchivo))))	{
		
			out.writeObject(lista_jugadores);

			ArrayList <Jugadores> copia_jugadores = new ArrayList<Jugadores>();

			copia_jugadores = (ArrayList <Jugadores>) in.readObject();
			
			for (Jugadores jugadores : copia_jugadores) {
				System.out.println(jugadores.toString());
			}
			
			
		
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
		
		
		
		
		
		
		
		
		
//		//Imprimir jugadores
//		e.imprimirJugadores();
//		
//		//Eliminar jugaor por dorsal
//		int dorsal = 10;
//		System.out.printf("Eliminando al jugador con dorsal %d%n",dorsal);
//		e.eliminarJugadorDorsal(dorsal);
//		
//		e.imprimirJugadores();
//		
//		//Buscando un jugador por nombre
//		String nombre = "ElBicho";
//		System.out.printf("Buscando al jugador %s%n",nombre);
//		e.buscarJugadorNombre(nombre);
	}
}
