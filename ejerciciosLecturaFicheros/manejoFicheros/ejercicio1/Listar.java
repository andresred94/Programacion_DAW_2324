package manejoFicheros.ejercicio1;

import java.io.*;
import java.util.*;

public class Listar {
	File archivo;
	List <String> contenido = new ArrayList<String>();

	public List<String> listarDirectorio(String ruta){
		archivo = new File(ruta);
		if (!archivo.exists()) {
            System.out.println("La ruta especificada no existe.");
        }
		if (archivo.isFile()) {
			obtenerNombresFicheros(archivo);
		} else if (archivo.isDirectory()) {
			obtenerNombresDirectorios(archivo);
		} else {
            System.out.println("La ruta especificada no es un archivo ni un directorio válido.");
        }
		return contenido;		
	}
	
		
	// Método para mostrar el contenido de un archivo
    public void obtenerNombresFicheros(File archivo) {
//    	 Aquí puedes implementar la lógica para leer y mostrar el contenido del archivo
//      Por ejemplo, puedes utilizar un BufferedReader para leer línea por línea y mostrarlo en consola
//      Código de ejemplo:
         try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
             String linea;
             while ((linea = reader.readLine()) != null) {
            	 contenido.add(linea);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
    // En este ejemplo, simplemente mostramos el nombre del archivo
//    	System.out.println(archivo.getName());
    }

    /**
     * Función que devuelve los nombres de los ficheros que contiene la ruta ingresada
     * @param directorio tipo File
     */
    public void obtenerNombresDirectorios(File directorio) {
    	// listFiles()
    	// Devuelve un array de tipo File con los nombres de los archivos que contiene
    	// el directorio ingresado como parámetro
    	// Obtener la lista de archivos y directorios dentro del directorio especificado
        File[] archivos = directorio.listFiles();

        // Mostrar cada archivo o directorio en la consola
        for (File archivo : archivos) {
        	contenido.add(archivo.getName());
        }
    }// fin mostrarContenidoDirectorio
    
    public void mostrarContenido() {
		for (String s : contenido) {
			System.out.println(s);
		}
	}
}// fin-class Listar
