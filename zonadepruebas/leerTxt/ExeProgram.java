package leerTxt;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExeProgram {
	public static void main(String[] args) {
		LectorDArchivos prueba = new LectorDArchivos();
			
		try {
			prueba.leerArchivo();
		} catch (FileNotFoundException e1) {
			System.out.println("No se ha encontrado el archivo en la ubicación indicada.");
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		}
			
	}
}
