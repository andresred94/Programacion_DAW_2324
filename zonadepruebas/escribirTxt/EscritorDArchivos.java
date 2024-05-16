package escribirTxt;

import java.io.*;

public class EscritorDArchivos {
	File archivoFile;
	FileWriter fWriter;
	BufferedWriter bw;
	
	public EscritorDArchivos() throws FileNotFoundException, IOException  {
		archivoFile = new File("\\..\\archivos\\escribiendo.txt");
		fWriter = new FileWriter(archivoFile,true);
		bw = new BufferedWriter(fWriter);
		
		String frase = "EMEEGGHH";
		for (int i = 0; i < frase.length(); i++) {
			int c = frase.charAt(i);
			bw.write(c);
		}
		
		bw.close();
		
	}
}// fin-class EscritorDArchivos
