package basedeDatosEmpleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ExeProgram {
	static 	String ruta = "archivos\\BdD_empleados\\nombArchi";

	TreeMap <Integer , Empleado> csv_empleados = new TreeMap<Integer, Empleado>();
	
	public static void main(String[] args) {
		ExeProgram exe1 = new ExeProgram();
		ArrayList <String> contenido_raw = new ArrayList<String>();
		String nombre_archivo = "empleados_txt.csv";
		String ruta_lectura = ruta.replaceAll("nombArchi",nombre_archivo);
		File fich_csv_empleados = new File(ruta_lectura);
		String linea;
		String [] lineas;
		try (BufferedReader leer = new BufferedReader(new FileReader(fich_csv_empleados))
				){
		while ((linea = leer.readLine()) != null) {
			contenido_raw.add(linea);
		}
		
		// inicio volcado de datos en TreeMap
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
			
			exe1.csv_empleados.put(id_empleado,new Empleado(id_empleado,nombre_empleado,
				apellido_empleado,email,tlf,fecha_con,id_trabajo,salario,comision,id_director,id_depa));
		}// final lectura empleados
		
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		// imprimir datos
		for (Map.Entry<Integer, Empleado> entry : exe1.csv_empleados.entrySet()) {
			System.out.println(entry.getValue().toString());			
		}
		
	}

}
