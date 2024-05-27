package basedeDatosConciertos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class ExeProgram {
	static String ruta = "archivos\\\\BdD_conciertos\\\\nombArchi";
	
	TreeMap <Integer, Compositor> csv_compositor = new TreeMap<Integer, Compositor>();
	
	public static void main(String[] args) {
		ExeProgram e1 = new ExeProgram();
		ArrayList <String> contenido_raw = new ArrayList<String>();
		
		String ruta_compositores = "compositores_txt.csv";
		File fich_conciertos = new File(ruta.replaceAll("nombArchi",ruta_compositores));
		
		String linea = "";
		String [] lineas;
//		System.out.println(ruta.replaceAll("nombArch",ruta_compositores));
		try (BufferedReader leer_csv = new BufferedReader(new FileReader(fich_conciertos))){
			int c ;
			while ((c= leer_csv.read()) != -1) {
				char car = (char) c;
				linea = linea.concat(String.format("%c",car));
			}
			System.out.println(linea);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}// main
	
}// fin-class ExeProgram
