package colecNBA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

import ejercicioInmobiliaria.Inmueble;

public class ExeProgram {
	public static void main(String[] args) {
		Temporada t1 = new Temporada();
		Jugador j1 = new Jugador("James",34,"Los Angeles Clippers",72,"Arizona"); 
		Jugador j2 = new Jugador("Andre",30,"Chicago Bulls",79,"Arizona"); 
		Jugador j3 = new Jugador("LeBron James",39,"Los Angeles Lakers",71,"NewYork");
		
		//Introducir datos
		t1.aniadirJugador(j1);
		t1.aniadirJugador(j2);
		t1.aniadirJugador(j3);
		
		
		
		String nombreArchivo =  "jugadores.dat";
		String ruta = "\\..\\archivos\\nombArchi";
		String ruta_escritura = ruta.replaceAll("nombArchi", nombreArchivo);
		
		
		try (ObjectInputStream lecutra = new ObjectInputStream(new FileInputStream(ruta_escritura))) {
			System.out.println("Leyendo datos...");
			t1.setLista((TreeSet <Jugador>) lecutra.readObject());
			
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        	System.err.println("El contenido del fichero está vacio.");
		}
		
		
		
		
		System.out.println("Mostrando todo el contenido:");
		t1.mostrarContenido();

		
		String nombre = "James";
		System.out.printf("-->Mostrando el jugador con el nombre %s<--%n",nombre);
		t1.consultaJugadorNombre(nombre);
		
		String ciudad = "Chicago";
		System.out.printf("-->Buscando jugador que sea de la ciudad %s<--%n",ciudad);
		t1.consultaJugadorCiudad(ciudad);
		
		int canastas = 10;
		System.out.printf("-->Modificar canastas al jugador %s<--%n",nombre);
		t1.modificarCanastas(nombre,canastas);
		t1.mostrarContenido();
		
		System.out.println("Ordenar por Ciudad/Nombre:");
		t1.ordenCiudadNombre();
		
		System.out.println("Ordenar por equipo:");
		t1.ordenarPorEquipo();
		
		String archivo_escr = "jugadores.dat";
		ruta = "\\..\\archivos\\nombArchi";
		String ruta_escri = ruta.replaceAll("nombArchi", archivo_escr);

		
		try (	ObjectOutputStream escArch = new ObjectOutputStream(new FileOutputStream( ruta_escri))){
			escArch.writeObject(t1.getLista());

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}//fin-class ExeProgram
