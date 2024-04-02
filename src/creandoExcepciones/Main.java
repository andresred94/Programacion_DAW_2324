package creandoExcepciones;

public class Main {
	public static void main(String[] args) {
		try {
			int n = 11000;
			if (n > 1000) {
				throw new NumeroMuyGrandeException("Número mu grande");
			}
		} catch (NumeroMuyGrandeException e) {
			System.out.println(e);
		}
	}

}
