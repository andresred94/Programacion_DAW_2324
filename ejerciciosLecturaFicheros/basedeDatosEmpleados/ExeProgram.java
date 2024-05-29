 package basedeDatosEmpleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import manejoFicheros.ejercicio1.Listar;

public class ExeProgram {
	static Scanner lector = new Scanner(System.in);
	static String ruta = "archivos\\BdD_empleados\\nombArchi";

	TreeMap<Integer, Empleados> csv_empleados = new TreeMap<Integer, Empleados>();
	TreeMap<Integer, Departamentos> csv_departamentos = new TreeMap<Integer, Departamentos>();

	public static void main(String[] args) {
		ExeProgram exe1 = new ExeProgram();
		ArrayList<String> contenido_raw = new ArrayList<String>();

		String empleados = "empleados_txt.csv";
		String ruta_emp_csv = ruta.replaceAll("nombArchi", empleados);
		File fich_csv_empleados = new File(ruta_emp_csv);

		String departamentos = "departamentos_txt.csv";
		String ruta_dep_csv = ruta.replaceAll("nombArchi", departamentos);
		File fich_csv_departamentos = new File(ruta_dep_csv);

		String linea = "";
		String[] lineas = null;

		try (BufferedReader leer_empleados = new BufferedReader(new FileReader(fich_csv_empleados));
				BufferedReader leer_departamentos = new BufferedReader(new FileReader(fich_csv_departamentos))) {

			int c;
			while ((c = leer_empleados.read()) != -1) {
				char car = (char) c;
				linea = linea.concat(String.format("%c", car));
			}

			lineas = linea.split("\\R");

			for (String s : lineas) {
				contenido_raw.add(s);
			}

			// inicio de volcado de datos en TreeMap exe1.csv_empleados
			for (int i = 1; i < contenido_raw.size(); i++) {
				lineas = contenido_raw.get(i).split(",");
				int id_empleado = Integer.parseInt(lineas[0]);
				String nombre_empleado = lineas[1];
				String apellido_empleado = lineas[2];
				String email = lineas[3];
				String tlf = lineas[4];
				String fecha_con = lineas[5];
				String id_trabajo = lineas[6];
				double salario = Double.parseDouble(lineas[7]);
				double comision = Double.parseDouble(lineas[8]);
				String id_director = lineas[9];
				String id_depa = lineas[10];

				exe1.csv_empleados.put(id_empleado, new Empleados(id_empleado, nombre_empleado, apellido_empleado,
						email, tlf, fecha_con, id_trabajo, salario, comision, id_director, id_depa));
			} // final del volcado
//		System.out.printf("%s %d",contenido_raw.get(11),contenido_raw.size());
			// reiniciamos la lista, el String y el Array de tipo String
			contenido_raw.clear();
			linea = new String();
			lineas = null;
			int d;
			while ((d = leer_departamentos.read()) != -1) {
				char letra_depa = (char) d;
				linea = linea.concat(String.format("%c", letra_depa));
			}

			lineas = linea.split("\\R");
			for (String s : lineas) {
				contenido_raw.add(s);
			}

			for (int i = 1; i < contenido_raw.size(); i++) {
				lineas = contenido_raw.get(i).split(",");
				int id_depa = Integer.parseInt(lineas[0]);
				String nom_depa = lineas[1];
				String id_dire = lineas[2];
				String id_local = lineas[3];

				exe1.csv_departamentos.put(id_depa, new Departamentos(id_depa, nom_depa, id_dire, id_local));
			} // final lectura departamentos

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.err.printf("numero de empleados %d %n", exe1.csv_empleados.size());
		System.err.printf("numero de departamentos %d %n", exe1.csv_departamentos.size());
		
		int op = 0;
		do {
			System.out.printf(" Escoge una opción:%n"
					+ " 1) ordenar alfabeticamente por apellido y a igual apellido, ordenar por nombre [Comparator].%n"
					+ " 2) ordenar por id_empleado de menor a mayor( orden natural ) [Comparable].%n"
					+ " 3) ordenar por id_departamento [Comparator]%n"
					+ "  [ para salir ingresa 0] %n"
					+ " ingresa una opción = ");
			op = Integer.parseInt(lector.nextLine());
			
			switch (op) {
			case 1:
			List <Empleados> empleados_ordenados = new ArrayList<>(exe1.csv_empleados.values());
			empleados_ordenados.sort( new CompararApellidoNombreEmpleado());
			
			for (Empleados em : empleados_ordenados) {
				System.out.println(em.toString());
			}
				break;
				
			case 2:
			List <Empleados> empleados_orden_natural = new ArrayList<>(exe1.csv_empleados.values());
			Collections.sort(empleados_orden_natural);
			
			for (Empleados emp : empleados_orden_natural) {
				System.out.println(emp.toString());
			}

				break;
				
			case 3:
			List <Empleados> empleados_orden_depa = new ArrayList(exe1.csv_empleados.values());
			
			empleados_orden_depa.sort(new CompararIDdepartamentoEmpleado());
			
			for (Empleados emp : empleados_orden_depa) {
				System.out.println(emp.getId_trabajo());
			}
				
				break;

			case 0:
				System.out.println("Saliendo...");
				
				break;
			default:
				System.err.println("Error : No has introducido una opción válida.");
				break;
			}
			
		} while (op != 0);

	}

}
