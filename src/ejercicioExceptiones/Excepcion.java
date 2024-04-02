package ejercicioExceptiones;
public class Excepcion {

	public static void main(String[] args) {

		// EJEMPLO 0. bloque try-catch
		/*
		 * System.out.println("Ejemplo 0: bloque try-catch"); try{
		 * System.out.println("Intentamos ejecutar el bloque de instrucciones:");
		 * System.out.println("Instrucción 1."); System.out.println("Instrucción 2.");
		 * System.out.println("Instrucción 3..."); } catch (Exception e) {
		 * System.out.println("Instrucciones a ejecutar cuando se produce un error"); }
		 * 
		 * System.out.println("El programa continua...");
		 * 
		 * 
		 * 
		 * 
		 * // EJEMPLO I. Gestión de excepciones
		 * System.out.println("Ejemplo I: Gestión de excepciones"); try{ int n = 10/0;
		 * System.out.println("Esta línea nunca se ejecuta"); } catch(Exception e){
		 * System.out.println(e); System.out.println(e.toString());
		 * System.out.println(e.getMessage()); e.printStackTrace(); }
		 * 
		 * // Se maneja para un error concreto /*catch(ArithmeticException e){
		 * System.out.println("No se puede dividir por cero."); }
		 */

		/*
		 * finally{ System.out.
		 * println("Fin. Instrucciones a ejecutar finalmente tanto si se producen errores como si no."
		 * ); } System.out.println("El programa continua...");
		 * 
		 */

		// EJEMPLO II. LANZAR EXCEPCIONES
		System.out.println("Ejemplo II: Lanzar excepciones");
		try {
			int n1 = 10;
			int n2 = 0;
			int resultado;

			if (n2 == 0) {
				// lanzamos una excepcion general:
				// throw new Exception("No se puede dividir por cero.");
				// lanzamos una excepcion de tipo ArithmeticException
				throw new ArithmeticException("No se puede dividir por cero.");
			} else {
				resultado = n1 / n2;
			}
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}

		catch (Exception e) {
			// muestra el tipo de excepcion y el mensaje
			System.out.println(e.toString());
			// muestra el mensaje
			System.out.println(e.getMessage());
		} finally {
			System.out.println("fin");
		}
		// */

		// EJEMPLO III. EXCEPCIONES PERSONALIZADAS
		System.out.println("Ejemplo III: EXCEPCIONES PERSONALIZADAS");
		try {
			int n = 10000;

			if (n > 100) {
				throw new NumeroMuyGrandeException("Número muy grande.");
			}

		} catch (NumeroMuyGrandeException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("fin");
		}

	}
}
