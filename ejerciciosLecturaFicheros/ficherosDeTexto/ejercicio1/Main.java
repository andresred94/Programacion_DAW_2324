package ficherosDeTexto.ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			ContenidoFichero c1 = new ContenidoFichero("README.txt");
			c1.mostrarContenido();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
