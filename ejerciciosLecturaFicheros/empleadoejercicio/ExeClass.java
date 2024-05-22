package empleadoejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExeClass implements Serializable{
	static Scanner lector = new Scanner(System.in);
	static String ruta = "\\..\\archivos\\nombArchi";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//[ ->Atributos<- ]
	TreeMap <Integer , Directivo> datosDirectivos;
	TreeMap <Integer , Oficial> datosOficiales;
	TreeMap <Integer , Tecnico> datosTecnicos;
	TreeMap <Integer , Operario> datosOperarios;
	TreeMap <Integer , String> datosCsv;
	//[ ->Constructores<- ]
	public ExeClass() {
		datosDirectivos = new TreeMap<Integer , Directivo>();
		datosOficiales = new TreeMap<Integer , Oficial>();
		datosTecnicos = new TreeMap<Integer , Tecnico>();
		datosOperarios = new TreeMap<Integer , Operario>();
		datosCsv = new TreeMap<Integer , String>();
	}
	public void menuLogOn() {
		System.out.printf("\033[1;32mIngresa tu usuario y contraseña%n"
				+ "para logearte en el sistema%n\033[0m");
	}// fin  menu
	
	// ---> clase main <--- //
	public static void main(String[] args) {
		List<String> contenido_txt = new ArrayList<String>(); 
		ExeClass exe1 = new ExeClass();
		long tamanio_arch = 0;
		System.out.println("\033[1;36mLeyendo datos...\033[0m");

		String arch_dir = "tm_directivos.dat";
		String arch_ofi = "tm_oficiales.dat";
		String arch_ope = "tm_operarios.dat";
		String arch_tec = "tm_tecnicos.dat";
		String arch_csv = "datos_en_txt.csv";
		// fichero tm_directivos.dat
        String leer_arch_dir = ruta.replaceAll("nombArchi", arch_dir);
        File fich_dir = new File(leer_arch_dir);
        
        // fichero datos_en_txt.csv
        String leer_arch_csv = ruta.replaceAll("nombArchi",arch_csv);
        File fich_csv = new File(leer_arch_csv); 
        
		tamanio_arch = fich_dir.length();
        // TODO leer csv - inicio transacción
		String linea;
		String [] objetos = null;
		try(BufferedReader lectura = new BufferedReader(new FileReader(fich_csv))) {
			while ((linea = lectura.readLine()) != null) {
				contenido_txt.add(linea);
			}
			
			for (String s : contenido_txt) {
				objetos = s.split(";");
			}
			int cont = 0;
			for (String string : objetos) {
				exe1.datosCsv.put(cont++,string);
			}
			// TODO imprimir el contenido leido
			for (Map.Entry<Integer , String> entry :exe1.datosCsv.entrySet()) {
				String [] campos = entry.getValue().split(",");
				String campo_nombre = campos[0];
				String campo_pwd = campos[1];
				String campo_cod = campos[2];
				if (campo_cod.startsWith("DIR")) {
					int id_dir = Integer.parseInt(campo_cod.substring(6));
					Directivo nuevo_dire = new Directivo(id_dir,campo_nombre);
					exe1.datosDirectivos.put(id_dir,nuevo_dire);
				} else if (campo_cod.startsWith("OFI")) {
					int id_ofi = Integer.parseInt(campo_cod.substring(6));
					Oficial nuevo_ofi = new Oficial(id_ofi,campo_nombre);
					exe1.datosOficiales.put(id_ofi,nuevo_ofi);
				} else if (campo_cod.startsWith("TEC")) {
					int id_tec = Integer.parseInt(campo_cod.substring(6));
					Tecnico nuevo_tec = new Tecnico(id_tec,campo_nombre);
					exe1.datosTecnicos.put(id_tec,nuevo_tec);
				} else if (campo_cod.startsWith("OPE")) {
					int id_ope = Integer.parseInt(campo_cod.substring(6));
					Operario nuevo_operario = new Operario(id_ope,campo_nombre);
					exe1.datosOperarios.put(id_ope,nuevo_operario);
				} 
			}
			System.out.printf("Contenido del archivo %s leido correctamente.%n",arch_csv);
		} catch (IOException e) {
			e.printStackTrace();
		}// TODO: final lectura - csv
		
//		// TODO imprimir el contenido leido
//		System.out.printf("%nContenido del TreeMap del CSV...%n");
//		for (Map.Entry<Integer , String> entry :exe1.datosCsv.entrySet()) {
//				System.out.println(entry.getValue());
//		}
		
		System.out.printf("%nContenido TreeMap de Objetos Directivo...%n");
		for (Map.Entry<Integer , Directivo> entry : exe1.datosDirectivos.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
		
		System.out.printf("%nContenido TreeMap de Objetos Oficial...%n");
		for (Map.Entry<Integer , Oficial> entry : exe1.datosOficiales.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
		
		System.out.printf("%nContenido TreeMap de Objetos Tecnico...%n");
		for (Map.Entry<Integer , Tecnico> entry : exe1.datosTecnicos.entrySet()) {
			System.out.println(entry.getValue().toString());
		}

		System.out.printf("%nContenido TreeMap de Objetos Operario...%n");
		exe1.datosOperarios.remove(1);
		for (Map.Entry<Integer , Operario> entry : exe1.datosOperarios.entrySet()) {
			System.out.println(exe1.datosOperarios.size());
			System.out.println(exe1.datosOperarios.containsKey(entry.getValue().getId_operario()));
			System.out.println(entry.getValue().toString());
		}
		
		//TODO menu LOG ON
		exe1.menuLogOn();
		System.out.printf("  usuario = ");
		String usr_in = lector.nextLine();
		System.out.printf( "  contraseña = " );
		String pwd_in = lector.nextLine();
		boolean logOn = false;
		for (Map.Entry<Integer , String> entry :exe1.datosCsv.entrySet()) {
			if (entry.getValue().contains(usr_in) && entry.getValue().contains(pwd_in)) {
				logOn = true;
			}
		}
		if (logOn) {
			System.out.println("usuario y contraseña correctos");	
		} else {
			System.err.println("usuario y contraseña incorrectos");
		}
		
		
		
	}// fin main
}// fin-clas ExeClass
