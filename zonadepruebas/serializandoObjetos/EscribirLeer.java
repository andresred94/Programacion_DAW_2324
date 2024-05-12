package serializandoObjetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class EscribirLeer {
	String nombreArchi = "\\..\\archivos\\nombArchi";

	public static void main(String[] args) {
//		int [] t = {1,2,3,4,5,6,7,8,9};
//		String [] cancion = {"He left no time to regret",
//				"Kept his dick wet",
//				"With his same old safe bet",
//				"Me and my head high",
//				"And my tears dry",
//				"Get on without my guy"};
		
		String cancion = "Andrés";
		EscribirLeer l1 = new EscribirLeer();
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(l1.establecerNombreArchivo("backtoblack.dat")));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(l1.establecerNombreArchivo("backtoblack.dat")))){
			
			out.writeObject(cancion);
//			int [] copia_t = (int [])  in.readObject();
			String copia_pirata = (String) in.readObject();
//			System.out.println(Arrays.toString(copia_t));
			System.out.println(copia_pirata);
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}
	
	public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);
	}// fin establecerNombreArchivo
}// fin-class EscribirLeer
