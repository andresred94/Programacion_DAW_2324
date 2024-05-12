package ejercicio3;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		LeyendoMayorMenor n;
	
		try {
			n = new LeyendoMayorMenor("numeros.txt");
			n.buscandoMayorMenor();
			n.mostrarContenido();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// fin main
}// fin-class Main
