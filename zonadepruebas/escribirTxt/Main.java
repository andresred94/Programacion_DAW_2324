package escribirTxt;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			EscritorDArchivos es1 = new EscritorDArchivos();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}
