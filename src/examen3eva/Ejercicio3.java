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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
	static String ruta = "nombArchi";

	public static void main(String[] args) {

		TreeMap<Integer, Persona> datos_leidos = new TreeMap<Integer, Persona>();

		// Leer datos pacientes
		ArrayList<Paciente> datos_pacientes = new ArrayList<Paciente>();
		String linea = "";
		String[] lineas;
		try (BufferedReader leer = new BufferedReader(new FileReader("pacientes.txt"));
				BufferedWriter escribir = new BufferedWriter(new FileWriter("pacientesMayoresEdad.txt"))) {

			int c;
			while ((c = leer.read()) != -1) {
				char cara = (char) c;
				linea = linea.concat(String.format("%c", cara));
			}

			lineas = linea.split("\\R");
			int cont = 0;

			for (String fila : lineas) {
				String[] campos = fila.split(",");
				datos_pacientes.add(new Paciente(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]),
						Integer.parseInt(campos[4])));

				datos_leidos.put(cont++, new Paciente(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]),
						Integer.parseInt(campos[4])));
			}

			System.out.println("Mostrando pacientes por orden:");

			datos_pacientes.sort(new CompararNombreApellidoPaciente());

			for (Paciente p : datos_pacientes) {
				p.mostrarDatos();
			}
			System.out.printf("%nGuardando los pacientes mayores de edad.");

			for (Paciente p : datos_pacientes) {
				LocalDateTime fecha_actual = LocalDateTime.now();
				
				int anio_actual = fecha_actual.getYear();
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


	}
}// fin-class Ejercicio3
