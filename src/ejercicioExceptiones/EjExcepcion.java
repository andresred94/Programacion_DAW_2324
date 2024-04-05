package ejercicioExceptiones;

public class EjExcepcion {
	public static void main(String args[]) {
		int i = 0;
		//tring cadenas[] = { "Cadena 1", "Cadena 2", "Cadena 3", "Cadena 4","Cadena 5" };
		
		try {
			for (i = 0; i <= args.length ; i++)
				System.out.println(args[i]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
