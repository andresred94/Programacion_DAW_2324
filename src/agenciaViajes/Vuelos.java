package agenciaViajes;

import java.util.*;

public class Vuelos {
	// -->[ ATRIBUTOS ]<--
	private final int numVuelo;
	private String origenVuelo;
	private String destinoVuelo;
	private int aforoMaximo = 100;
	private int contPasajeros = 0;
	private ArrayList<Pasajeros> listaPasajeros = new ArrayList<Pasajeros>();
	private ArrayList<Pasajeros> listaMenoresDos = new ArrayList<Pasajeros>();

	// -->[ SETTERS Y GETTERS ]<--
	public String getOrigenVuelo() {
		return origenVuelo;
	}

	public void setOrigenVuelo(String origenVuelo) {
		this.origenVuelo = origenVuelo;
	}

	public String getDestinoVuelo() {
		return destinoVuelo;
	}

	public void setDestinoVuelo(String destinoVuelo) {
		this.destinoVuelo = destinoVuelo;
	}

	public int getNumVuelo() {
		return numVuelo;
	}

	public int getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(int cantPasajeros) {
		this.aforoMaximo = aforoMaximo - cantPasajeros;
	}

	// contructores
	public Vuelos(int numVueloUsr, String origenVueloUsr, String destVueloUsr, int capacidadMaxima) {
		this.numVuelo = numVueloUsr;
		setOrigenVuelo(origenVueloUsr);
		setDestinoVuelo(destVueloUsr);
		aforoMaximo = capacidadMaxima;
	}

	public void añadirPasajero(Pasajeros pasajeroVuelo) {
		if (pasajeroVuelo.getNumVuelo() == getNumVuelo() && contPasajeros < aforoMaximo) {
			if (pasajeroVuelo.getEdad() > 2) {
				listaPasajeros.add(pasajeroVuelo);
				contPasajeros++;
				aforoMaximo--;
			} else {
				listaMenoresDos.add(pasajeroVuelo);
			}
		} else {
			System.out.println("No hay espacio disponible para el vuelo " + getNumVuelo());
		}
	}

	public void mostrarListaPasajeros(int numVuelo) {
		System.out.printf("Lista de pasajeros del vuelo %d: %n", numVuelo);
		for (int i = 0; i < listaPasajeros.size(); i++) {
			if (listaPasajeros.get(i).getNumVuelo() == numVuelo) {
				System.out.println(listaPasajeros.get(i).toString());
			} else {
				System.out.println("No existe reserva para ese número de vuelo.");
			}
		} // fin for
	}// fin mostrarListaPasajeros

	public void mostrarListaMenores(int numVuelo) {
		System.out.printf("Lista de menores de edad del vuelo %d: %n", numVuelo);
		for (int i = 0; i < listaPasajeros.size(); i++) {
			if (listaPasajeros.get(i).getNumVuelo() == numVuelo && (listaPasajeros.get(i).getEdad() < 18)) {
				System.out.println(listaPasajeros.get(i).toString());
			}
		}
		for (int i = 0; i < listaMenoresDos.size(); i++) {
			System.out.println(listaMenoresDos.get(i).toString());
		}
		
	}// fin mostrarListaMenores

	@Override
	public String toString() {
		return "El vuelo " + numVuelo + " lleva " + contPasajeros + " pasajeros. Quedan " + getAforoMaximo()
				+ " asientos";
	}
}// fin-class Vuelos
