package ejercicio3;

import java.io.*;
import java.util.*;

public class LeyendoMayorMenor  {
	String nombreArchi = "\\..\\archivos_txt\\nombArchi";
	File archivoFile;
	FileReader fReader;
	BufferedReader bf;
    private List<String> lineas;
    private TreeSet <Integer> numeroEnteros;
    
    public LeyendoMayorMenor(String nombreArchivo) throws FileNotFoundException, IOException  {
		archivoFile = new File(establecerNombreArchivo(nombreArchivo));
		fReader = new FileReader( archivoFile);
		bf = new BufferedReader(fReader);
		
		lineas = new ArrayList<>();
        String linea;
        while ((linea = bf.readLine()) != null) {
            lineas.add(linea);
        }
        bf.close();
	}
    
    public void buscandoMayorMenor() {
    	String [] enteros = new String [lineas.size()];
    	for (String s : lineas) {
			enteros = s.split(" ");
    	}    	
    	numeroEnteros = new TreeSet <Integer>();
		for (String n : enteros) {
			int numEnt = Integer.parseInt(n);
			numeroEnteros.add(numEnt);
		}		
		System.out.printf("El número mayor es %d%n", numeroEnteros.first());
		System.out.printf("El número menor es %d%n", numeroEnteros.last());
	}// fin operarcionEnteros
    
	public void mostrarContenido()  {
		Iterator<Integer> it = numeroEnteros.iterator();
		while (it.hasNext()) {
			System.out.printf("%s " , it.next());
		}
	}// fin mostrarContenido
	
	public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);		
	}//fin establecerNombreArchivo
	
}// fin-class LeyendoMayorMenor
