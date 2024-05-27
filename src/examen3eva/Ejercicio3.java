package examen3eva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
	static String ruta = "nombArchi";

	public static void main(String[] args) {

		TreeMap<String, Persona> datos_leidos = new TreeMap<String, Persona>();

		// Leer datos pacientes
		ArrayList<Paciente> datos_pacientes = new ArrayList<Paciente>();
		String linea = "";
		String[] lineas;
		try (BufferedReader leer = new BufferedReader(new FileReader(ruta.replaceAll("nombArchi", "pacientes.txt")));
				BufferedWriter escribir = new BufferedWriter(new FileWriter("pacientesMayoresEdad.txt"))) {

			int c;
			while ((c = leer.read()) != -1) {
				char cara = (char) c;
				linea = linea.concat(String.format("%s", cara));
			}
			lineas = linea.split("\\R");
			for (String fila : lineas) {
				String[] campos = fila.split(",");
				datos_pacientes.add(new Paciente(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]),
						Integer.parseInt(campos[4])));

				datos_leidos.put(campos[0], new Paciente(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]),
						Integer.parseInt(campos[4])));
			}
			System.out.println("Mostrando pacientes por orden:");
			datos_pacientes.sort(new CompararNombreApellidoPaciente());
			for (Paciente p : datos_pacientes) {
				p.mostrarDatos();
			}

			System.out.println("Guardando los pacientes mayores de edad.");
			for (Paciente p : datos_pacientes) {
				int anio_actual = 2024;
				int edad = anio_actual - p.getAnio_nacimiento();
				if (edad >= 18) {
					String dni = p.getDni();
					String nombre = p.getNombre();
					String ape = p.getApellidos();
					int anio_naci = p.getAnio_nacimiento();
					int peso = p.getPeso();
					String escr_linea = "";
					escr_linea = escr_linea.concat(String.format("%s,%s,%s,%d,%d", dni, nombre, ape, anio_naci, peso));
					for (int i = 0; i < escr_linea.length(); i++) {
						char d = escr_linea.charAt(i);
						escribir.write(d);
					}
					escribir.write("\n");

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Escritura de objetos
		String trabajadores = "trabajadores.dat";
		String ruta_trabajadores = ruta.replaceAll("nombArchi", trabajadores);
		File trabajadores_dat = new File(ruta_trabajadores);

		try (ObjectOutputStream lector = new ObjectOutputStream(new FileOutputStream(trabajadores_dat))) {
			lector.writeObject(datos_leidos);
			System.out.println("Datos guardados correctamente...");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Demostrando que se han guardado correctamente
		File archivo_leido = new File(ruta.replaceAll("nombArchi", "trabajadores.dat"));

		try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo_leido))) {
			datos_leidos = (TreeMap<String, Persona>) leer.readObject();
			System.out.println("Archivo leido correctamente...");
		} catch (EOFException e) {
			System.err.println("Error : el archivo no existe.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Mostrando datos del contenido leido:");
		for (Map.Entry<String, Persona> entry : datos_leidos.entrySet()) {
			entry.getValue().mostrarDatos();
		}

	}
}
