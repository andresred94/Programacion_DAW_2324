package ficherosDeTexto.ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContenidoFichero {
	String nombreArchi = "\\..\\archivos_txt\\nombArchi";
	File archivo;
	FileReader fReader;
	BufferedReader bufR;
    private List<String> contenido;
    
    public ContenidoFichero(String nombreFich	) throws FileNotFoundException, IOException{
    	archivo = new File(establecerNombreArchivo(nombreFich));
    	fReader = new FileReader(archivo);
    	bufR = new BufferedReader(fReader);
    	
    	contenido = new ArrayList<String>();
    	String linea;
    	while ((linea = bufR.readLine()) != null) {
            contenido.add(linea);
        }
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
}
