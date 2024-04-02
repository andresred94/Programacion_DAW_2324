package leerTxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorDArchivos {
	public void leerArchivo() throws FileNotFoundException, IOException {
		File archivoFile = new File("G:\\archivos_txt\\holamundo.txt");
		FileReader fReader = new FileReader(archivoFile);
		BufferedReader bf = new BufferedReader(fReader);
		String linea;

		while ( (linea = bf.readLine()) != null) {
			System.out.println(linea);
		}

	}

	public void leerArchivo2() {
		try {
			leerArchivo();
		} catch (FileNotFoundException fe) {
			fe.getMessage();
		} catch(IOException io) {
			System.out.println("Archivo_controlado");
		} finally {
			System.out.println("Programa continuará...");
		}

	}// fin leerArchivo

}// fin-class LectorDArchivos
