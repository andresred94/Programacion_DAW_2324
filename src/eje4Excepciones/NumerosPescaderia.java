package eje4Excepciones;

public class NumerosPescaderia {
	private int numAtendido;
	private static int contNumeros = 1;
		
	public int getNumAtendido() {
		if (contNumeros > 10) {
			//throw new NoMoreNumbersException("Eres el último");
		}
		return contNumeros;
	}

	public static int getContNumeros() {
		return contNumeros;
	}

	public NumerosPescaderia () {
		System.out.println("Número máximo a distribuir es 10.");
		
	}
	
	public void cogerNumero() {
		contNumeros++;
	}
}
