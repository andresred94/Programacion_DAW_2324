package ejercicioExceptiones;

public class EjExcepcion {
	public static void main(String args[]) {
		int i = 0;
		String cadenas[] = { "Cadena 1", "Cadena 2", "Cadena 3", "Cadena 4" };
		try {
			for (i = 0; i <= 4; i++)
				System.out.println(cadenas[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());;
		}
	}
}
