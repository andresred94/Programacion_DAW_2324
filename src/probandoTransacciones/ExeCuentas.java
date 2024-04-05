package probandoTransacciones;

import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class ExeCuentas {
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {

		char c = 's';
		do {
			Cuentas c1 = new Cuentas("test", "admin00", "alumno");

			System.out.println("1) Dar de alta e ingresar dinero.");
			System.out.println("2) Mostrar el saldo de todas las cuentas.");
			System.out.println("3) Mostrar saldo de una cuenta.");
			System.out.println("4) Realizar una transacción.");

			System.out.print("Escoge una opción = ");
			int op = Integer.parseInt(lector.nextLine());

			switch (op) {
			case 1:
				System.out.print("Ingresa el id de la cuenta = ");
				int id = Integer.parseInt(lector.nextLine());
				String tabla1 = "cuentas";

				System.out.print("Ingresa el saldo = ");
				double saldo = Double.parseDouble(lector.nextLine());

				String sqlQuery = " VALUES (" + id + "," + Double.toString(saldo) + ")";
				ArrayList<String> nombreColumnas1 = new ArrayList<>();
				nombreColumnas1.add("id");
				nombreColumnas1.add("saldo");
				c1.setIdCuenta_saldo(id, saldo);
				c1.insertarCuenta(nombreColumnas1, sqlQuery, tabla1);

				break;
			case 2:
				ArrayList<String> nombresColumnas2 = new ArrayList<>();
				String tabla2 = "cuentas";
				//nombresColumnas2.add("*");
				nombresColumnas2.add("id");
				nombresColumnas2.add("saldo");
				c1.mostrarSaldos(nombresColumnas2, tabla2);

				break;
			case 3:
				ArrayList<String> nombresColumnas3 = new ArrayList<>();
				String tabla3 = "cuentas";
				nombresColumnas3.add("id");
				nombresColumnas3.add("saldo");
				System.out.print("Ingresa el id de la cuenta = ");
				int id_cuenta = Integer.parseInt(lector.nextLine());
				String condWhere = "WHERE id = " + id_cuenta;

				c1.mostrarSaldoCuenta(nombresColumnas3, condWhere, tabla3);

				break;
			case 4:
				SQLException sqlStateCode = null;
				String saldoRetira = "saldo = saldo - ";
				String saldoIngresa = "saldo = saldo + ";
				double cantIngresada = 0;
				int a = 0;
				int b = 0;
				System.out.printf("¿Deseas ingresar o retirar dinero? %n[Escribe ingresar/retirar en el teclado y presiona ENTER] = ");
				String opIR = lector.nextLine().toLowerCase();
				System.out.printf("Ingresa una cantidad de dinero = ");
				cantIngresada = Integer.parseInt(lector.nextLine());
				saldoRetira = saldoRetira + cantIngresada;
				saldoIngresa = saldoIngresa + cantIngresada;

				try {
					if (opIR.equals("ingresar")) {
						System.out.print("Introduce el id de la cuenta de donde se va a retirar el dinero = ");
						a = Integer.parseInt(lector.nextLine());
						String cuenta1 = "id = " + a;
						sqlStateCode = c1.actualizarCuenta(saldoRetira,cuenta1,"cuentas");
						
						if (sqlStateCode != null && sqlStateCode.getErrorCode() == 3819) {
				            // Manejar caso de saldo negativo
				            System.err.printf("Code SQLState: %d - El saldo de la cuenta no puede ser negativo.%n", sqlStateCode.getErrorCode());
				        } else {
				            // Si no hay excepciones, realizar operación de ingreso
				            System.out.print("Introduce el id de la cuenta de donde se va a ingresar el dinero = ");
				            b = Integer.parseInt(lector.nextLine());
				            String cuenta2 = "id = " + b;
				            sqlStateCode = c1.actualizarCuenta(saldoIngresa, cuenta2, "cuentas");
				        }						
						

					} else if (opIR.equals("retirar")) {
						System.out.print("Introduce el id de la cuenta de donde se va a retirar el dinero = ");
				        a = Integer.parseInt(lector.nextLine());
				        String cuenta1 = "id = " + a;
				        sqlStateCode = c1.actualizarCuenta(saldoRetira, cuenta1, "cuentas");
				        
				        if (sqlStateCode != null && sqlStateCode.getErrorCode() == 3819) {
				            // Manejar caso de saldo negativo
				            System.err.printf("Code SQLState: %d - El saldo de la cuenta no puede ser negativo.%n", sqlStateCode.getErrorCode());
				        } else {
				            // Si no hay excepciones, realizar operación de retiro
				            System.out.print("Introduce el id de la cuenta de donde se va a ingresar el dinero = ");
				            b = Integer.parseInt(lector.nextLine());
				            String cuenta2 = "id = " + b;
				            sqlStateCode = c1.actualizarCuenta(saldoIngresa, cuenta2, "cuentas");
				        }
						
					}		

					if (sqlStateCode.getErrorCode() > 0) {
						throw new SQLException();
					}
					
				} catch (SQLException e) {
					e = sqlStateCode;
					if (e.getErrorCode() == 3819) {
						System.err.printf("Code SQLState: %d - El saldo de la cuenta no puede ser negativo." , sqlStateCode.getErrorCode());
					}
				} catch (NullPointerException e) {
					System.out.printf("Actualización confirmada."); 
				}
				
				
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}

			System.out.printf("%n¿Deseas continuar? s/n = ");
			c = Character.toLowerCase((lector.next().charAt(0)));
			lector.nextLine();
		} while (c == 's');

	}
}
