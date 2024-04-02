package probandoTransacciones;

import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpr.Identifier;

public class ExeMascota {
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		Mascota mascota1 = new Mascota("prueba", "admin00", "alumno");
		char c = 's';
		do {
			System.out.println("1) ingresar una mascota.");
			System.out.print("Escoge una opción = ");
			int op = Integer.parseInt(lector.nextLine());

			switch (op) {
				case 1:
					System.out.print("Ingresa el id = ");
					int id = Integer.parseInt(lector.nextLine());

					System.out.print("Ingresa el nombre = ");
					String nombre = lector.nextLine();

					System.out.print("Ingresa la edad = ");
					int edad = Integer.parseInt(lector.nextLine());

					String sqlQuery = "INSERT INTO mascotas (id_mascota, nombre, edad) VALUES (" + id + ", '" + nombre + "', "
							+ edad + ")";

					mascota1.insertarMascota(sqlQuery);
					mascota1.cerrarTransaccion();
					break;
					
				default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}

			System.out.println("Deseas continuar? s/n = ");
			c = Character.valueOf(lector.next().charAt(0));
			lector.nextLine();
		} while (c == 's');
		

	}
}