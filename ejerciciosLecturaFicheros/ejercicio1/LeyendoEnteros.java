package ejercicio1;

import java.io.*;
import java.util.*;

public class LeyendoEnteros {
	String nombreArchi = "\\..\\archivos_txt\\nombArchi";
	File archivoFile;
	FileReader fReader;
	BufferedReader bf;
    private List<String> lineas;
    
	public LeyendoEnteros(String nombreArchivo) throws FileNotFoundException, IOException  {
		archivoFile = new File(establecerNombreArchivo(nombreArchivo));
		fReader = new FileReader( archivoFile);
		bf = new BufferedReader(fReader);
		
		lineas = new ArrayList<>();
        String linea;
        while ((linea = bf.readLine()) != null) {
            lineas.add(linea);
        }
        bf.close();
	}
	
	public void mostrarContenido()  {
		for (String s : lineas) {
			System.out.print(s);
		}
	}// fin mostrarContenido
	public void operarcionEnteros() {
		int suma = 0;
		int media = 0;
		int cantNum = 0;
		
		for (String s : lineas) {
			String [] entero = s.split(" ");
			cantNum = entero.length;

			for (String n : entero) {
				suma += Integer.parseInt(n);
			}
		}
		
		
		if (lineas.size() > 0) {
			media = (int) (suma / cantNum);
			System.out.printf("%nLa media de los números enteros que contiene el fichero es: %d%n" , media);
		} else {
			System.out.printf("No se han encontrado enteros en el fichero.%n");
		} 
	}// fin operarcionEnteros
	
	public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);		
	}//fin establecerNombreArchivo
}// fin-class LeyendoEnteros
