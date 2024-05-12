package coleccionesListasEje9;


public class Main {
	public static void main(String[] args) {
		AdivinaNumero n1 = new AdivinaNumero();
		n1.aniadirNumero();
		n1.imprimirContenido();// Ignorar esta linea es de prueba

		System.out.printf("%nIntenta adivinar un número de 4 cifras...%n"
				+ "tienes 9 intentos...%n"
				);
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("Intento: %d%n", i );
			int nLeido = n1.leerNumero();
			System.out.printf("número ingresado: %d %n", nLeido);
			int cifrasCorrectas = n1.contieneCifra(nLeido);
			
			System.out.printf("%n%n%d  %n" , cifrasCorrectas);
		}
	}
}
