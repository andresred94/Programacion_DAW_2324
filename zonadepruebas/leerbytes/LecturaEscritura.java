package leerbytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LecturaEscritura {
	String nombreArchi = "\\..\\archivos\\nombArchi";
	static String nombArchivo = "Setas.jpeg";
	
	public static void main(String[] args) {
		LecturaEscritura l1 = new LecturaEscritura();
		int contador = 0;

		
		try (FileInputStream  archivo_lectura = new FileInputStream(l1.establecerNombreArchivo(nombArchivo))) {			
			boolean final_ar = false;
			int datos [] = new int [221422];
			while (!final_ar) {
				int byte_entrada = archivo_lectura.read();
				
				if (byte_entrada !=-1) {
					contador++;
//					datos[contador] = byte_entrada;
				} else {
					final_ar = true;
				}
		
				contador++;
			}// while
			final_ar = false;
			
			while (!final_ar) {
				int byte_entrada = archivo_lectura.read();
	
				if (byte_entrada !=-1) {
					datos[contador] = byte_entrada;
				} else {
					final_ar = true;
				}
				contador++;
			}// fin while
			
			System.out.println(contador);
			
			crear_fichero(datos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main
	
	static void crear_fichero(int copiaDatos []) {
		LecturaEscritura l1 = new LecturaEscritura();

		try ( FileOutputStream copia = new FileOutputStream(l1.establecerNombreArchivo("copia_"+nombArchivo))){
			
			for (int i = 0; i < copiaDatos.length; i++) {
				copia.write(copiaDatos[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);
	}// fin establecerNombreArchivo
}
