package leerTxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorDArchivos {
	public void leerArchivo() throws FileNotFoundException, IOException {
		File archivoFile = new File("\\..\\archivos_txt\\holamundo.txt");
		FileReader fReader = new FileReader(archivoFile);
		BufferedReader bf = new BufferedReader(fReader);
		String linea;

		while ( (linea = bf.readLine()) != null) {
			System.out.println(linea);
		}
		bf.close();
	}

}// fin-class LectorDArchivos
