package lecturaQuijote;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.text.Normalizer;

public class LecturaQuijote {
	String nombreArchi = "\\..\\archivos\\nombArchi";

	public LecturaQuijote() {
	}

	public int contarLetrasMinusculas(String fichero) throws FileNotFoundException, IOException {
		int contMinus = 0;

		try (BufferedReader bufR = new BufferedReader(new FileReader(establecerNombreArchivo(fichero)))) {

//        	String linea;
//            
//            while ((linea = bufR.readLine()) != null) {
//                for (int i = 0; i < linea.length(); i++) {
//                    char letra = linea.charAt(i);
//                    if (Character.isLowerCase(letra) || (letra == 'ñ') ){
//                        contMinus++;
//                    }
//                }
//            }

			int letra;
			while ((letra = bufR.read()) != -1) {
				// https://www.charset.org/utf-8
				// a = 97 dec
				// z = 122 dec
				// ñ = 241
				if ((letra >= 97 && letra <= 122) || (letra == 241)) {
					contMinus++;
				}
			}
		}
		return contMinus;
	}// fin contarLetrasMinusculas

	public int contarLetrasPuras(String fichero) throws IOException {
		int contador = 0;
		try (BufferedReader bufR = new BufferedReader(new FileReader(establecerNombreArchivo(fichero)))) {
			String linea;
			while ((linea = bufR.readLine()) != null) {
				for (int i = 0; i < linea.length(); i++) {
					char letra = linea.charAt(i);
					// 1620036 letras
					if (Character.isLowerCase(letra) || (letra == 'ñ') || Character.isUpperCase(letra)	 || (letra == 'Ñ')) {
						contador++;
					}
				}
			}
		} // fin try
		return contador;
	}// fin contarLetrasPuras

	public int contarLineas(String fichero) throws FileNotFoundException, IOException {
		List<String> contenido = new ArrayList<String>();
		String linea;
		try (BufferedReader bufR = new BufferedReader(new FileReader(establecerNombreArchivo(fichero)))) {
			while ((linea = bufR.readLine()) != null) {
				contenido.add(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contenido.size();
	}// fin contarLineas

	public int contarPalabras(String fichero) throws FileNotFoundException, IOException {
		List<String> palabras = new ArrayList<String>();
		List<String> contenido = new ArrayList<String>();
		String[] frases;
		String linea;

		try (BufferedReader bufR = new BufferedReader(new FileReader(establecerNombreArchivo(fichero)));
				BufferedWriter bufW = new BufferedWriter(new FileWriter(establecerNombreArchivo("testQuijotePalabrasSeparadas.txt"), true))) {

			while ((linea = bufR.readLine()) != null) {
				contenido.add(linea);
			}

			for (String s : contenido) {
				String textoSinPuntuacion = s.replaceAll("[^a-zA-ZáéíóúüñÁÉÍÓÚÜÑ\\s]", "");// reemplaza todos excepto...
				frases = textoSinPuntuacion.split("\\s+");// 383158
//    			frases = s.split("\\s+");// 383166
				for (String palabra : frases) {
//					for (int i = 0; i < palabra.length(); i++) {
//						 bufW.write(palabra.charAt(i));
//					}
					palabras.add(palabra);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return palabras.size();
	}// fin contarPalabras

	public TreeSet<String> palabrasTerminadas(String fichero, String texto) {
		List<String> palabras = new ArrayList<String>();
		List<String> contenido = new ArrayList<String>();
		TreeSet<String> rsp = new TreeSet<String>();

		String[] frases;
		String linea;

		try (BufferedReader bufR = new BufferedReader(new FileReader(establecerNombreArchivo(fichero)));
				BufferedWriter bufW = new BufferedWriter(new FileWriter(establecerNombreArchivo("test.txt"), true))) {

			while ((linea = bufR.readLine()) != null) {
				contenido.add(linea);
			}

			for (String s : contenido) {
				String textoSinPuntuacion = s.replaceAll("[^a-zA-ZáéíóúüñÁÉÍÓÚÜÑçÇ\\s]", "");// reemplaza todos excepto...
				frases = textoSinPuntuacion.split("\\s+");
				for (String palabra : frases) {
					palabras.add(palabra);
				}
			}

			for (String palBuscada : palabras) {
				// convertimos cada caracter a minúscula y quitamos tildes
				// https://www.unicode.org/reports/tr15/tr15-23.html#Introduction
				// https://docs.oracle.com/javase/8/docs/api/java/lang/Character.UnicodeBlock.html#COMBINING_DIACRITICAL_MARKS
				// https://www.unicode.org/versions/Unicode15.0.0/ch02.pdf
				// https://www.unicode.org/Public/12.1.0/ucd/Blocks.txt
				String palabraNormalizada = Normalizer.normalize(palBuscada, Normalizer.Form.NFD)
						.replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
				texto = Normalizer.normalize(texto, Normalizer.Form.NFD)
						.replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
				if (palabraNormalizada.endsWith(texto.toLowerCase())) {
					rsp.add(palBuscada);
					bufW.write(palBuscada);
					bufW.newLine();
				}
			} // for-each
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rsp;
	}// fin palabrasTerminadas

	public void palabraMasLarga(String fichero) {
		List<String> contenido = new ArrayList<String>();
		TreeSet<String> palabrasLargas = new TreeSet<String>();
		String[] frases;
		String linea;
		try (BufferedReader bufR = new BufferedReader(new FileReader(establecerNombreArchivo(fichero)));
				BufferedWriter bufW = new BufferedWriter(new FileWriter(establecerNombreArchivo("test.txt"), true))) {
			String stringMasLargo = ""; // Variable para almacenar el string más largo
			int longitudMasLarga = 0;

			while ((linea = bufR.readLine()) != null) {
				String textoSinPuntuacion = linea.replaceAll("[^a-zA-ZáéíóúüñÁÉÍÓÚÜÑ\\s]", "");// reemplaza todos excepto...
				frases = textoSinPuntuacion.split("\\s+");
								
				for (String palabra : frases) {
					if (palabra.length() > stringMasLargo.length()) {
						stringMasLargo = palabra; // Actualizar el string más largo encontrado
						longitudMasLarga = stringMasLargo.length();
					}// if
					contenido.add(palabra.toLowerCase());
				}// for-each
			}//while

			for (String str : contenido) {
				if (str.length() >= longitudMasLarga) {
					palabrasLargas.add(str);
				}// if
			}// for-each

			for (String s : palabrasLargas) {
				System.out.printf("  * %s %n", s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}// palabraMasLarga

	public String establecerNombreArchivo(String nombreArhivo) {
		return nombreArchi.replaceAll("nombArchi", nombreArhivo);
	}// fin establecerNombreArchivo
}// fin-class LecturaQuijote
