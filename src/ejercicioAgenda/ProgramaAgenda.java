package ejercicioAgenda;

import java.util.Scanner;

public class ProgramaAgenda {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		char opEscogida;
		Agenda agendaContactos = new Agenda();
		do {
			System.out.println("Bienvenido a la agenda de contactos.");
			System.out.printf("1.- Añadir contacto.%n");
			System.out.printf("2.- Eliminar contacto.%n");
			System.out.printf("3.- Mostrar todos los contactos.%n");
			System.out.printf("4.- Buscar contacto.%n");
			System.out.print("Escoge una opción = ");
			int op = lector.nextInt();
			lector.nextLine();
			switch (op) {
				case 1:
					System.out.print("Ingresa el nombre del contacto = ");
					String nomCon = lector.nextLine();
					System.out.print("Ingresa el teléfono del contacto = ");
					String tlfCon = lector.nextLine();
					agendaContactos.añadirContactos(new Contacto(nomCon,tlfCon));
				break;
				case 2:
					System.out.print("Ingresa el nombre del contacto = ");
					nomCon = lector.nextLine();
					agendaContactos.eliminarContacto(nomCon);
					break;
				case 3:
					agendaContactos.listarContactos();
					break;
				case 4:
					System.out.print("Ingresa el nombre del contacto = ");
					nomCon = lector.nextLine();
					int pos = agendaContactos.buscarContacto(nomCon);
					if (pos == 0) {
						System.out.println("El usuario no ha sido encontrado.");
					} else {
						System.out.printf("El contacto se encuentra en la posicion %d" , pos);
					}
					break;
				default:
					System.err.println("Opción ingresada no válida");
			}
			
			System.out.printf("¿Deseas continuar?(S/N) = ");
			opEscogida = lector.next().charAt(0);
			opEscogida = Character.toLowerCase(opEscogida);
		} while (opEscogida == 's');
		
	}
}// fin-class ProgramaAgenda
