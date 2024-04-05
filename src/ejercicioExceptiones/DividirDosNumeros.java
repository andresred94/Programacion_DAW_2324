package ejercicioExceptiones;

import java.util.Scanner;

import misExcepciones.DesbordamientoException;

public  class DividirDosNumeros {
	static Scanner lector = new Scanner(System.in);
	static boolean realizado = false;
	static int a,b;
	public static void main(String[] args) {
		DividirDosNumeros  d1 = new DividirDosNumeros();
		
		do {
			try {
				d1.dividir();
				realizado = true;
			} catch (DesbordamientoException e) {
				System.err.println(e.getMessage());
                lector.nextLine(); // Limpiar el buffer de entrada
                realizado = false;
			} catch (NumberFormatException e) {
				System.out.println("Error: No se ha introducido un valor correcto.");
                lector.nextLine(); // Limpiar el buffer de entrada
                realizado = false;					
			} catch (ArithmeticException e1) {
				System.out.println("El divisor no puede ser 0.");
				realizado = false;
			} 
			
		} while (!realizado);
		
	}// fin main
	
	public void dividir () throws DesbordamientoException {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		System.out.println("Ingresa dos números enteros.");
		System.out.print("Ingresa el dividendo = ");
        //String inputA = lector.next();
        Long a = lector.nextLong();
        System.out.print("Ingresa el divisor = ");
        //String inputB = lector.next();
        Long b = lector.nextLong();
        
//        long a = 0 , b = 0;
//        a = Long.parseLong(inputA);
//        b = Long.parseLong(inputB);
                              
        if ( ((b > Integer.MAX_VALUE) || ( a > Integer.MAX_VALUE) ) || ( (b < Integer.MIN_VALUE) || (a < Integer.MIN_VALUE) )){ 
            throw new DesbordamientoException("Error: Existe desbordamiento de entero.");
		}				
		System.out.printf("%d / %d = %d " , a, b, a/b);
				
	}
}// fin - DividirDosNumeros
