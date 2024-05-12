package escribirTxt;

import java.io.*;

public class EscritorDArchivos {
	File archivoFile;
	FileWriter fWriter;
	BufferedWriter bw;
	
	public EscritorDArchivos() throws FileNotFoundException, IOException  {
		archivoFile = new File("\\..\\archivos_txt\\escribiendo.txt");
		fWriter = new FileWriter(archivoFile,true);
		bw = new BufferedWriter(fWriter);
		
		String frase = "En un lugar de la Mancha, \n de cuyo nombre no quiero acordarme";
		for (int i = 0; i < frase.length(); i++) {
			int c = frase.charAt(i);
			bw.write(c);
		}
		
		bw.close();
		
	}
}// fin-class EscritorDArchivos
