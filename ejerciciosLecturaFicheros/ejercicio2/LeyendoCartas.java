package ejercicio2;

import java.io.*;
import java.util.*;

public class LeyendoCartas {
	String nombreArchi = "\\..\\archivos_txt\\nombArchi";
	File archivo;
	FileReader fReader;
	BufferedReader bufR;
    private List<String> contenido;
    String [] palabra;
   
    public LeyendoCartas(String nombreTxt)  throws FileNotFoundException, IOException {
    	archivo = new File(establecerNombreArchivo(nombreTxt));
    	fReader = new FileReader(archivo);
    	bufR = new BufferedReader(fReader);
    	
    	contenido = new ArrayList<String>();
    	String linea;
    	while ((linea = bufR.readLine()) != null) {
            contenido.add(linea);
        }
      	bufR.close(); 
    }
    
    public void contarCaracteres() {
    		int cantidadLineas = 0;
    		int cantidadCaracteres = 0;
    		int cantidadPalabras = 0;
    		
    		List <String> palabras = new ArrayList<String>();
    		cantidadLineas = contenido.size();
    		for (String s : contenido) {
				palabra = s.split(" ");
    			for (String pal : palabra) {
					palabras.add(pal);
				}
    		}  		
    		for (String s : palabras) {
				cantidadCaracteres += s.length(); 
			}
    		cantidadPalabras = palabras.size();
    		
    		System.out.printf(
    				"Cantidad caracteres: %d "
    				+ "Cantidad de lineas: %d "
    				+ "Cantidad de palabras: %d",cantidadCaracteres,cantidadLineas,cantidadPalabras    				
    				);
    }
    
    public void mostrarContenido() {
    	System.out.println();
    	for (String s : contenido) {
			System.out.println(s);
		}
    }// fin mostrarContenido
    
    public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);		
	}// fin establecerNombreArchivo
}// fin-class LeyendoCartas
