package leerTxt;

import java.io.*;

public class LectorDArchivos {
		File archivoFile;
		FileReader fReader;
		BufferedReader bf;
		
		
	public void leerArchivo() throws FileNotFoundException, IOException {
		archivoFile = new File("\\..\\archivos_txt\\holamundo.txt");
		fReader = new FileReader(archivoFile);
		bf = new BufferedReader(fReader);
		String linea;

		//Leer todo el contenido
		while ( (linea = bf.readLine()) != null) {
			System.out.println(linea);
		}
		
		//Leer solo una linea
//		linea = bf.readLine();
//		System.out.println(linea);
		
		//leer el primer caracter
		//System.out.println((char)fReader.read());
		
		//otra manera de leer un fichero
//		int a = fReader.read();
//		while (a != -1) {
//			System.out.print((char) a);
//			a = fReader .read();
//		}
		
//		bf.close();
	}
	
	public void leerArchivoDos() throws FileNotFoundException, IOException {
		try (BufferedReader buffer = new BufferedReader(new FileReader("\\..\\archivos_txt\\escribiendo.txt"))){
	        String linea;
	        while ((linea = buffer.readLine()) != null) {
	            System.out.println(linea);
	        }
	    } catch (IOException e) {
	  }
	}

}// fin-class LectorDArchivos
