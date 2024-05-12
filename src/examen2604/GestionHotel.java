package examen2604;

import java.util.*;
import examen2604.Hotel.ZONA;

public class GestionHotel {
	Set<Hotel> listaHotelesOrden;
	
	public GestionHotel() {
		listaHotelesOrden = new TreeSet <Hotel>();
		
	}
	
	public void aniadirHotel (Hotel h){
		listaHotelesOrden.add(h);
	}
	
	public void mostrarContenido() {
		Iterator it = listaHotelesOrden.iterator();
		while (it.hasNext()) {
			Hotel hs = (Hotel) it.next();
			System.out.println(hs.toString());
		}
	}
	
	public void mostrarPorZona(ZONA zonaH) {
		Iterator it = listaHotelesOrden.iterator();
		while (it.hasNext()) {
			Hotel hs = (Hotel) it.next();
			if (hs.getZonaHotel().equals(zonaH)) {
				System.out.println(hs.toString());
			}
			
		}
	}
	
	public void eliminarHotelID(int id_hotel)  {
		Iterator it = listaHotelesOrden.iterator();
		while (it.hasNext()) {
			Hotel hs = (Hotel) it.next();
			
			if (hs.getIdHotel() == id_hotel) {
				listaHotelesOrden.remove(hs);
				break;
			}			
		}
	}
	
	public static void main(String[] args) {
		GestionHotel h1 = new GestionHotel();
		
		h1.aniadirHotel(new Hotel(7, ZONA.RURAL, 79));
		h1.aniadirHotel(new Hotel(6, ZONA.MONTANA, 150));
		h1.aniadirHotel(new Hotel(1, ZONA.MONTANA, 36));
		h1.aniadirHotel(new Hotel(12, ZONA.MONTANA, 150));
		h1.aniadirHotel(new Hotel(3, ZONA.MONTANA, 180));
		h1.aniadirHotel(new Hotel(5, ZONA.PLAYA, 106));
		h1.aniadirHotel(new Hotel(11, ZONA.MONTANA, 102));
		h1.aniadirHotel(new Hotel(2, ZONA.PLAYA, 150));
		h1.aniadirHotel(new Hotel(8, ZONA.RURAL, 114));
		h1.aniadirHotel(new Hotel(9, ZONA.RURAL, 143));
		h1.aniadirHotel(new Hotel(4, ZONA.MONTANA, 150));
		h1.aniadirHotel(new Hotel(10, ZONA.RURAL, 143));
		
		h1.mostrarContenido();
		
		// Mostrar los hoteles en zona rural
		System.out.printf("%n Mostrando hoteles en zona rural %n");
		h1.mostrarPorZona(ZONA.RURAL);

		// Eliminar el hotel con id 9
		int id_hotel = 7;
		System.out.printf("%n Eliminando el hotel en zona rural con id %d %n" , id_hotel);
		h1.eliminarHotelID(id_hotel);

		h1.mostrarContenido();
	}
}
