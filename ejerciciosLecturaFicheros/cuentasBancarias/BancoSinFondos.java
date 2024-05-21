package cuentasBancarias;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;

import examen2604.Hotel;

public class BancoSinFondos {

	TreeMap<Integer, CuentasCorrientes> datosClientes = new TreeMap<Integer, CuentasCorrientes>();
	TreeMap<Integer, Gestor> datosGestores = new TreeMap<Integer, Gestor>();
	
	static Scanner lector = new Scanner(System.in);

	public BancoSinFondos() {
	}

	public void menuBienvenida() {
		System.out.printf("\033[40m\033[1;33mBienvenido a la app del banco Sin Fondos.%n\033[1;34m"
				+ "1.- Darte de alta en el banco.%n" + "2.- Ingresar dinero a mi cuenta.%n"
				+ "3.- Retirar dinero de mi cuenta.%n" + "4.- Ingresar dinero a otra cuenta.%n"
				+ "5.- Mostrar mi saldo.%n" + "   [-1 para salir]%n");
		System.out.print("\033[40m\033[1;32mEscoge una opción = \033[1;34m");
	}// fin menuBienvenida

	public void ingresarDineroCuenta(String cod_cuenta , double din_in) {
		for (Map.Entry<Integer , CuentasCorrientes> entry : datosClientes.entrySet()) {
			if (entry.getValue().getCod_Cuenta().equals(cod_cuenta)) {
				double saldo_actual = entry.getValue().getSaldo();
				entry.getValue().setSaldo(saldo_actual+din_in);
				System.out.println("\033[1;32mDinero ingresado correctamente en la cuenta.\033[1;34m");
			}
		}
	}// ingresarDineroCuenta
	
	public void retirarDineroCuenta(String cod_cuenta, double din_in) {
		for (Map.Entry<Integer , CuentasCorrientes> entry : datosClientes.entrySet()) {
			if (entry.getValue().getCod_Cuenta().equals(cod_cuenta)) {
				double saldo_actual = entry.getValue().getSaldo();
				if (saldo_actual > din_in) {
					entry.getValue().setSaldo(saldo_actual-din_in);
					System.out.println("\033[1;32mSaldo actualizado correctamente.\033[1;34m");

				}else {
					System.out.println("\033[1;31mNo puedes retirar esas cantidad no hay suficiente saldo en la cuenta.\033[1;34m");
				}
			}		
		}
	}
	
	public void mostrarMiSaldo(String cod_cuenta) {
		for (Map.Entry<Integer, CuentasCorrientes> entry : datosClientes.entrySet()) {
			if (entry.getValue().getCod_Cuenta().equals(cod_cuenta)) {
				System.out.printf("\033[1;36mEl saldo de tu cuenta es %.2f\033[1;34m%n",entry.getValue().getSaldo());
			}
		}
	}
	
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);

		int modif_cli = 0, modif_gest = 0;
		BancoSinFondos b1 = new BancoSinFondos();

		// TODO Lectura de datos
		System.out.println("\033[1;35mLeyendo datos...\033[0m");
		String nomb_arch_cli = "cuentas_clientes.dat";
		String ruta = "\\..\\archivos\\nombArchi";
		String ruta_lectura_cli = ruta.replaceAll("nombArchi", nomb_arch_cli);
//		System.out.println(ruta_lectura_cli);
		File fich_cli = new File(ruta_lectura_cli);

		String nomb_arch_ges = "gestores.dat";
		ruta = "\\..\\archivos\\nombArchi";
		String ruta_lectura_ges = ruta.replaceAll("nombArchi",nomb_arch_ges);
//		System.out.println(ruta_lectura_ges);
		File fich_gest = new File(ruta_lectura_ges);
		if (fich_cli.length() == 0 || fich_gest.length() == 0) {
			System.err.println("El archivo está vacio.");
		} 
		try (ObjectInputStream lectura_cuenta= new ObjectInputStream(new FileInputStream(fich_cli));
				ObjectInputStream lectura_gestor= new ObjectInputStream(new FileInputStream(fich_gest))) {
			System.out.println("Leyendo contenido del archivo...");
			b1.datosClientes = (TreeMap<Integer, CuentasCorrientes>) lectura_cuenta.readObject();
			modif_cli = b1.datosClientes.size();
			b1.datosGestores = (TreeMap<Integer,Gestor>) lectura_gestor.readObject();
			modif_gest = b1.datosGestores.size();
			System.out.println("\033[42mFichero leido correctamente...\033[0m");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.err.println("El sistema no puede encontrar el archivo especificado");
		} catch (IOException | EOFException e) {
//			e.printStackTrace();
			System.err.println("Ha habido un error relacionado con el archivo.");
		} // fin lectura

		int opEsc = 0;

		do {
			b1.menuBienvenida();
			opEsc = Integer.parseInt(lector.nextLine());

			switch (opEsc) {
			case 1:// TODO opcion 1
				int ult_id = b1.datosClientes.size();
				ult_id++;
				double saldo = 0;
				System.out.print("¿Deseas ingresar saldo en la cuenta? [s/n] = ");
				char c = Character.toLowerCase(lector.nextLine().charAt(0));
				if (c == 's') {
					System.out.print("ingresa la cantidad = ");
					saldo = Double.parseDouble(lector.nextLine());
				}
				System.out.print("ingresa tu DNI = ");
				String dni_in = lector.nextLine();
				System.out.print("ingresa tu nombre = ");
				String nomb_in = lector.nextLine();
				System.out.print("ingresa tu primer apellido = ");
				String ape1_in = lector.nextLine();
				System.out.print("¿tienes segundo apellido? [s/n] = ");
				String ape2_in = null;
				char cApe = Character.toLowerCase(lector.nextLine().charAt(0));
				if (cApe == 's') {
					System.out.println("ingresa tu segundo apellido = ");
					ape2_in = lector.nextLine();
				}
				System.out.print("ingresa tu teléfono de contacto = ");
				String tlf_in = lector.nextLine();
				Persona persona_creada = new Persona(dni_in,nomb_in,ape1_in,ape2_in,tlf_in);
				CuentasCorrientes c1 = new CuentasCorrientes(ult_id,saldo,"BancoSinFondos",persona_creada);
				b1.datosClientes.put(ult_id,c1);
				b1.datosGestores.put(ult_id,new Gestor(ult_id,10000));
				break;
			case 2:// TODO opcion 2
				System.out.print("ingresa tu identificador de cuenta = ");
				String cuenta_in = lector.nextLine();
				System.out.print("ingresa la cantidad de dinero a ingresar = ");
				double cant_ingresar = Double.parseDouble(lector.nextLine());
				b1.ingresarDineroCuenta(cuenta_in,cant_ingresar);
				break;
			case 3:// TODO opcion 3
				System.out.print("ingresa tu identificador de cuenta = ");
				String cuenta_ret = lector.nextLine();
				System.out.print("ingresa la cantidad de dinero a retirar = ");
				double cant_ret = Double.parseDouble(lector.nextLine());
				b1.retirarDineroCuenta(cuenta_ret,cant_ret);
				break;
			case 5:
				System.err.print("ingresa tu identificador de cuenta = ");
				String cuenta_mostrar = lector.nextLine();
				b1.mostrarMiSaldo(cuenta_mostrar);
				break;
			case 6:
				System.out.printf("Hay %d clientes guardados.%n", b1.datosClientes.size());

				// Imprimir el TreeMap
				for (Map.Entry<Integer, CuentasCorrientes> leerLista : b1.datosClientes.entrySet()) {
					System.out.println(leerLista.getValue().toString());
				}
				break;
			default:// TODO default
				break;
			}// fin switch

		} while (opEsc != -1);
		
		modif_cli = b1.datosClientes.size();
		modif_gest = b1.datosGestores.size();
		if (modif_cli != 0 || modif_gest != 0) {
			// TODO ecritura de archivos
			String nomb_arch_cli_escr = "cuentas_clientes.dat";
			ruta = "\\..\\archivos\\nombArchi";
			String ruta_escr_cli = ruta.replaceAll("nombArchi", nomb_arch_cli_escr);
			File fich_escr_cli = new File(ruta_escr_cli);
			
			String nom_arch_gest_escr = "gestores.dat";
			ruta = "\\..\\archivos\\nombArchi";
			String ruta_escr_gest = ruta.replaceAll("nombArchi",nom_arch_gest_escr);
			File fich_escr_gest = new File(ruta_escr_gest);
			
			String nom_arch_csv_clientes = "clientes_txt.csv";
			ruta = "\\..\\archivos\\nombArchi";
			String ruta_arch_csv = ruta.replaceAll("nombArchi",nom_arch_csv_clientes);
			File fich_csv = new File(ruta_arch_csv);
			
			try (ObjectOutputStream escrCuentas = new ObjectOutputStream(new FileOutputStream(fich_escr_cli));
					ObjectOutputStream escrGestores = new ObjectOutputStream(new FileOutputStream(fich_escr_gest));
					ObjectOutputStream escrCSV = new ObjectOutputStream(new FileOutputStream(fich_csv))) {
				escrCuentas.writeObject(b1.datosClientes);
				escrGestores.writeObject(b1.datosGestores);
				
				for (Map.Entry<Integer , CuentasCorrientes> entry : b1.datosClientes.entrySet()) {
					escrCSV.writeObject(entry.getValue().toString()+"\n");
				}
				
				System.out.println("Archivo actualizado correctamente...");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}// fin escritura cleintes
		} else {
			System.out.println("Los archivos no han sido modificados.");
		}
		
	}// fin main
}// fin class BancoSinFondos
