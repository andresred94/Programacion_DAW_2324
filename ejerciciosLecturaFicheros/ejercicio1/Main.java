package ejercicio1;

import java.io.*;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String nombreArch = "NumerosReales.txt";
		FileReader fReader;
		BufferedReader bf;
		LeyendoEnteros e1;
		try {
			e1 = new LeyendoEnteros(nombreArch);
			e1.mostrarContenido(); 
			e1.operarcionEnteros();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
