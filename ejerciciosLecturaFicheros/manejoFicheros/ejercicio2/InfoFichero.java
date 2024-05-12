package manejoFicheros.ejercicio2;

import java.io.*;

public class InfoFichero {
	String nombreArchi = "\\..\\archivos_txt\\nombArchi";
	File archivo;
	String nombfich;
	String ruta;
	String rutaabsoluta;
	boolean esEscrito;
	boolean esLeido;
	long tamanioFich;
	boolean esDirectorio;
	boolean esFichero;
	
	public InfoFichero()  {}// InfoFichero
	
    public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);		
	}// fin establecerNombreArchivo

    public void infoFicheroIO(String  nomArchivo) {
    	archivo = new File(establecerNombreArchivo(nomArchivo));
    	nombfich =  archivo.getName();
    	ruta = archivo.getPath();
    	rutaabsoluta = archivo.getAbsolutePath();
    	esEscrito = archivo.canWrite();
    	esLeido = archivo.canRead();
    	tamanioFich = archivo.length();
    	esDirectorio = archivo.isDirectory();
    	esFichero = archivo.isFile();
    	System.out.printf(
    			"INFORMACIÓN SOBRE EL FICHERO:%nnombre del fichero: %s%nruta: %s%nruta absoluta: %s%nse puede escribir: %b%nse puede leer: %b%ntamaño: %d(bytes)%nes un directorio: %b%nes un fichero: %b%n" , nomArchivo , ruta , rutaabsoluta, esEscrito,esLeido,tamanioFich,esDirectorio,esFichero);
    }
}// fin-class InfoFichero

