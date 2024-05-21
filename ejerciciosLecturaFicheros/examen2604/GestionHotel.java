package examen2604;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;

import examen2604.Hotel.ZONA;

public class GestionHotel implements Serializable {
	/**
	 * 
	 */
	static Scanner lector = new Scanner(System.in);
	private static final long serialVersionUID = 1L;
	TreeMap<Integer, Hotel> listaHotelesOrden;

	public GestionHotel() {
		listaHotelesOrden = new TreeMap<Integer, Hotel>();
	}

	public void aniadirHotel(Hotel h) {
		if (listaHotelesOrden.put(h.getIdHotel(), h) != null) {
			System.err.println("No se ha podido añadir el hotel.");
		} else {
			System.out.println("Hotel añadido correctamente.");
		}
	}

	public void mostrarContenido() {
		System.out.printf("Hay %d hoteles guardados.%n", listaHotelesOrden.size());

		// Imprimir el TreeMap
		for (Map.Entry<Integer, Hotel> leerLista : listaHotelesOrden.entrySet()) {
			System.out.println(leerLista.getValue().toString());
		}
	}

	public void mostrarPorZona(ZONA zonaH) {
		// Imprimir el TreeMap
		for (Map.Entry<Integer, Hotel> entry : listaHotelesOrden.entrySet()) {
			System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
			if (entry.getValue().getZonaHotel().equals(zonaH)) {
//    			System.out.println( entry.getValue().toString());
				System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
			}
		}
	}

	public void eliminarHotelID(int id_hotel) {
		listaHotelesOrden.remove(id_hotel);
	}

	public void menu() {
		System.out.printf("%nEscoge una opción:%n" + "1) mostrar todos los hoteles.%n" + "2) mostrar hotel por zona.%n"
				+ "3) eliminar hotel por id.%n" + "4) añadir hotel.%n" + "    [para salir ingresa -1] %n"
				+ "ingresa una opción = ");
	}

	public static void main(String[] args) {
		GestionHotel h1 = new GestionHotel();

		// TODO lectura del archivo
		System.out.println("\033[1;35mLeyendo datos...\033[0m");
		String nombreArchivo = "hoteles.dat";
		String ruta = "\\..\\archivos\\nombArchi";
		String ruta_lectura = ruta.replaceAll("nombArchi", nombreArchivo);
		File fich_leer = new File(ruta_lectura);

		if (fich_leer.length() == 0) {
			System.err.println("El archivo está vacio.");
		} else {
			try (ObjectInputStream lecutra = new ObjectInputStream(new FileInputStream(fich_leer))) {
				System.out.println("Leyendo contenido del archivo...");
				h1.listaHotelesOrden = (TreeMap<Integer, Hotel>) lecutra.readObject();

				System.out.println("\033[42mFichero leido correctamente...\033[0m");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.err.println("El sistema no puede encontrar el archivo especificado");
			} catch (IOException | EOFException e) {
				System.err.println("Ha habido un errror relacionado con el archivo.");
			} // fin lectura
		} // fin if
		int estado_ini = h1.listaHotelesOrden.size();
		int opEs = 0;
		// TODO menu
		do {
			h1.menu();
			opEs = Integer.parseInt(lector.nextLine());

			switch (opEs) {
			case 1:// TODO mostrarContenido
				h1.mostrarContenido();
				break;
			case 2:// TODO mostrarPorZona
					// Mostrar los hoteles en zona rural
				System.out.printf("%n Escoge la zona:%n" + "1 = Rural%n" + "2 = Montaña%n" + "3 = Playa%n"
						+ "ingresa una opción = ");
				int opZona = Integer.parseInt(lector.nextLine());
				switch (opZona) {
				case 1:
					h1.mostrarPorZona(ZONA.RURAL);
					break;
				case 2:
					h1.mostrarPorZona(ZONA.MONTANA);
					break;
				case 3:
					h1.mostrarPorZona(ZONA.PLAYA);
					break;
				default:
					System.err.println("Error : Zona escogida no válida.");
					break;
				}// switch opZona
				break; // case 2
			case 3:// TODO eliminar por id_hotel
				System.out.print("ingresa un id de hotel = ");
				int id_hotel = Integer.parseInt(lector.nextLine());
				System.out.printf("%n Eliminando el hotel en zona rural con id %d %n", id_hotel);
				h1.eliminarHotelID(id_hotel);
				break;// case 3
			case 4:
				int ult_id = h1.listaHotelesOrden.size();
				ult_id++;
				System.out.print("ingresa el precio del hotel = ");
				double p_in = Double.parseDouble(lector.nextLine());

				// Mostrar los hoteles en zona rural
				System.out.printf("%n Escoge la zona:%n" + "1 = Rural%n" + "2 = Montaña%n" + "3 = Playa%n"
						+ "ingresa una opción = ");
				int opZona_aniadir = Integer.parseInt(lector.nextLine());

				switch (opZona_aniadir) {
				case 1:
					Hotel nh1 = new Hotel(ult_id, ZONA.RURAL, p_in);
					h1.aniadirHotel(nh1);
					break;
				case 2:
					Hotel nh2 = new Hotel(ult_id, ZONA.MONTANA, p_in);
					h1.aniadirHotel(nh2);
					break;
				case 3:
					Hotel nh3 = new Hotel(ult_id, ZONA.PLAYA, p_in);
					h1.aniadirHotel(nh3);
					break;
				default:
					System.err.println("Error : Zona escogida no válida.");
					break;
				}
				break;// case 4
			case -1:
				System.err.printf("%n\033[0;36mSaliendo...\033[0m%n");
				break;
			default:
				System.err.println("Error: opción escogido no válida.");
				break;
			}

		} while (opEs != -1);

		int estado_fin = h1.listaHotelesOrden.size();
		if (estado_fin == estado_ini) {
			System.out.println("El contenido no ha sido modificado.");

		} else {
			// TODO ecritura del archivo
			String archivo_escr = "hoteles.dat";
			ruta = "\\..\\archivos\\nombArchi";
			String rutaArchivo = ruta.replaceAll("nombArchi", archivo_escr);
			File fich_escr = new File(rutaArchivo);
			try (ObjectOutputStream escArch = new ObjectOutputStream(new FileOutputStream(fich_escr))) {
				escArch.writeObject(h1.listaHotelesOrden);
				System.out.println("Archivo actualizado correctamente...");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
