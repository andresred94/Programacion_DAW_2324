package ejercicio2;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		LeyendoCartas c1;
		
		try {
			c1 = new  LeyendoCartas("carta.txt");
			c1.contarCaracteres();
			c1.mostrarContenido();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
