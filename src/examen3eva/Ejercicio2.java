package examen3eva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio2 {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		TreeMap <Integer , Persona> datosPersona = new TreeMap<Integer , Persona>();
		
		Paciente p1 = new Paciente("12312312Q", "Alex", "Cremento", 1984, 60);
		Paciente p2 = new Paciente("11122233R", "Dolores", "Delano", 1984, 20);

		Dentista d1 = new Dentista("52053342H", "Isabel", "Garcia", 1993, 1, 445789);
		Dentista d2 = new Dentista("11112222B", "Zacarías", "Álvarez", 1994, 2, 445789);
		Dentista d3= new Dentista("11112222C", "Sofía", "Quintana", 1994, 3, 445789);
		Dentista d4 = new Dentista("11112222D", "Alejandro", "Torres", 1994, 4, 445789);

		Auxiliar a1 = new Auxiliar("11122233Q", "Diana", "Urrutia", 1992, 5, 'E');
		Auxiliar a2 = new Auxiliar("11122233Q", "Andrés", "Bravo", 1992, 6, 'H');
		Auxiliar a3 = new Auxiliar("11122233Q", "Manuel", "Bravo", 1992, 7, 'J');
		Auxiliar a4 = new Auxiliar("11122233Q", "Oscar", "Bustamante", 1992, 8, 'H');

		datosPersona.put(1, p1);
		datosPersona.put(2, p2);
		datosPersona.put(3, d1);
		datosPersona.put(4, d2);
		datosPersona.put(5, d3);
		datosPersona.put(6, d4);
		datosPersona.put(7, a1);
		datosPersona.put(8, a2);
		datosPersona.put(9, a3);
		datosPersona.put(10, a4);
		
		int op;
		do {

			System.out.printf("Introduce una opción:%n" + " 1) mostrar todos los datos de los trabajadores de la clinica.%n"
					+ " 2) dar de baja un trabajador que ha nacido en un año determinado.%n"
					+ " 3) ordenar y mostrar los trabajadores por apellidos.%n"
					+ " 4) modificar el expediente de los dentistas.%n" + "  	[ ingresa 0 para salir ]%n"
					+ "  ingresa una opción = ");
			
			op = Integer.parseInt(lector.nextLine());

			switch (op) {
			case 1:
				System.out.println("Mostrando datos SOLO de trabajadores.");
				for (Map.Entry<Integer, Persona> entry : datosPersona.entrySet()) {
					entry.getValue().mostrarDatos();
				}
				break;
			case 2:
				System.out.print("Ingresa el año = ");
				int anio_in = Integer.parseInt(lector.nextLine());
				try {
					if (anio_in < 0) {
						throw new DatoNegativoException(" El año ingresado no puede ser negativo.");
					}
					System.out.printf("  Eliminando trabajadores que nacieron el año %s.%n", anio_in);
					boolean eliminado = false;
					
					Iterator <Map.Entry <Integer , Persona >> it  = datosPersona.entrySet().iterator();
					
					while (it.hasNext()) {
						Map.Entry<Integer, Persona> entry = it.next();
						if (entry.getValue().getAnio_nacimiento() == anio_in) {
							it.remove();
							eliminado = true;
						}
					}		
					
					if (!eliminado) {
						System.err.println("Error : No existe un trabajador que haya nacido en ese año.");
					}
				} catch (DatoNegativoException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Mostrando datos de trabajadores ordenador por apellido y nombre.");
				List<Persona> datosOrdenados = new ArrayList<>(datosPersona.values());
				datosOrdenados.sort( new CompararApellidoTrabajador());
				
				for (Persona p : datosOrdenados) {
					if (p instanceof Trabajador) {
						p.mostrarDatos();
					}
				}					
				break;
			case 4:
				String dni_in = "52053342H";
				System.out.printf("Modificando el Dentista con dni %s.%n", dni_in);
			
				for (Map.Entry<Integer, Persona> entry : datosPersona.entrySet()) {
					if (entry.getValue() instanceof Dentista) {
						if (entry.getValue().getDni().equals(dni_in)) {
							int num_dni = Integer.parseInt(dni_in.substring(0, 8));
							Dentista d = (Dentista) entry.getValue();
							d.setExpendiente(num_dni);
						}
					}
				}
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.err.println("Error : No has introducido un opción válida.");
				break;
			}

		} while (op != 0);
	}
}
