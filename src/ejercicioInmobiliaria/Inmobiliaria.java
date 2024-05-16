package ejercicioInmobiliaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

import coleccionesListasEje7.Jugadores;
import ejercicioInmobiliaria.Construccion.*;
import ejercicioInmobiliaria.PlzGaraje.*;
import ejercicioInmobiliaria.Solar.*;
import ejercicioInmobiliaria.Superficie.*;
import ejercicioInmobiliaria.Vivienda.*;

public class Inmobiliaria extends Inmueble{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Scanner lector = new Scanner(System.in);
	
	public void menu1() {
		System.out.printf(
			   "1) mostrar todos los inmuebles.%n"
			+ "2) añadir inmueble.%n"
			+ "[ -1 para salir ]%n"
			+ "escoge una opción y presiona la tecla [ENTER] = ");
	}		
	public Inmobiliaria() {}
	
	public void inmueblesVenta(double precio) {
		for (int i = 0; i < getVentas().size(); i++) {
			
			if (getVentas().get(i).getPrecioTdecimal() < precio) {
				System.out.println(getVentas().get(i).toString());
			}
		}
	}
	
	public void localesSegundaMano(double mCuadrados) {
		for (int i = 0; i < getAlquileres().size(); i++) {
			
			if (getAlquileres().get(i).getTamanio() > mCuadrados) {
				System.out.println(getAlquileres().get(i).toString());
			}
		}
	}
	
	public void solaresRusticos() {
		Solar s;
		for (int i = 0; i < getVentas().size(); i++) {
			if (getVentas().get(i) instanceof Solar ) {
				s = (Solar) getVentas().get(i);
				if ( s.getTipoS() == TP_SLR.RUSTICO ) {
					System.out.println(s.toString());		
				}				
			}
		}
	}

	public static void main(String[] args) {
		Vivienda v1 = null;
		Local l1 = null;
		Solar s1 = null;
		PlzGaraje p1 = null;
        Locale.setDefault(Locale.US);
		TreeSet <String> datos_inmu = new TreeSet <String>();
		Inmobiliaria ex1 = new Inmobiliaria();
		
		String nombreArchivo =  "BdD_inmuebles.txt";
		String ruta = "\\..\\archivos\\nombArchi";
		String rutaArchivo = ruta.replaceAll("nombArchi", nombreArchivo);
		
		
		try (BufferedReader bufR = new BufferedReader(new FileReader(rutaArchivo));
				BufferedWriter bufW = new BufferedWriter(new FileWriter(ruta.replaceAll("nombArchi","BdD_inmuebles_escribir.txt"),true))){
			String linea;
			System.out.println("Volcando el contenido de los ficheros en un TreeSet");
			//TODO lectura del archivo
			while ((linea = bufR.readLine()) != null) {
				datos_inmu.add(linea);
			}
			
			int op = 0;
			do {
				ex1.menu1();
				op = Integer.parseInt(lector.nextLine());
				
				
				switch (op) {
				case 1://mostrar todos los inmuebles
					
					System.out.print("Mostrando todos los inmuebles guardados...");
					for (String s : datos_inmu) {
						System.out.println(s);
					}
					break;
				case 2://añadir un inmueble
					System.out.printf("¿Qué tipo de inmueble es? [Superficie / Construccion] = ");
					String tp_inmu_in = lector.nextLine().toUpperCase();
					
					if (tp_inmu_in.toUpperCase().equals("CONSTRUCCION")) {
						System.out.printf("¿Qué tipo de construcción es? [Vivienda/Local] = ");
						String tp_cons_in = lector.nextLine().toUpperCase();
						
						if (tp_cons_in.equals("VIVIENDA")) {
							System.out.print("¿Qué tipo de vivienda es? [Piso/Chalet] = ");
							String tp_vivienda_in = lector.nextLine().toUpperCase();
							
							if (tp_vivienda_in.equals("CHALET")) {
								System.out.print("¿Es nuevo o de segunda mano? = ");
								String estado_vivienda = lector.nextLine().toUpperCase();
								
								if (estado_vivienda.equals("NUEVO")) {
									System.out.print("ingresa la dirección (calle,número,codpostal) = ");
									String ubi_in = lector.nextLine();
									System.out.print("ingresa el tamaño en metros cuadrados = ");
									Double tamanio_in = Double.parseDouble(lector.nextLine());
									System.out.print("¿Cuantas habitaciones tiene? = ");
									Integer n_hab_in = Integer.parseInt(lector.nextLine());
									System.out.printf("ingresa el precio total = ");
									Double p_total_in = Double.parseDouble(lector.nextLine());
									System.out.printf("¿Cuantas plantas tiene? = ");
									Integer n_plantas_in = Integer.parseInt(lector.nextLine());
									// TODO vivienda nueva
									v1 = new Vivienda(TP_INMBL.CONSTRUCCION,TP_CNSTRCN.VIVIENDA,EST_CNSTRCN.NUEVO,ubi_in,tamanio_in,TP_VVND.CHALET,n_hab_in,p_total_in,n_plantas_in);
									if (datos_inmu.add(v1.toString())) {
										System.out.println("Vivienda añadida correctamente.");
									} else {
										System.err.println("No se ha podido añadir la vivienda.");
									}
									
								} else if (estado_vivienda.equals("SEGUNDA MANO")) {
									System.out.print("ingresa la dirección (calle,número,codpostal) = ");
									String ubi_in = lector.nextLine();
									System.out.print("ingresa el tamaño en metros cuadrados = ");
									Double tamanio_in = Double.parseDouble(lector.nextLine());
									System.out.print("¿Cuantas habitaciones tiene? = ");
									Integer n_hab_in = Integer.parseInt(lector.nextLine());
									System.out.printf("ingresa el precio total = ");
									Double p_total_in = Double.parseDouble(lector.nextLine());
									System.out.printf("¿Cuantas plantas tiene? = ");
									Integer n_plantas_in = Integer.parseInt(lector.nextLine());
									// TODO vivienda segunda mano
									v1 = new Vivienda(TP_INMBL.CONSTRUCCION,TP_CNSTRCN.VIVIENDA,EST_CNSTRCN.SGND_MANO,ubi_in,tamanio_in,TP_VVND.CHALET,n_hab_in,p_total_in,n_plantas_in);
									if (datos_inmu.add(v1.toString())) {
										System.out.println("Vivienda añadida correctamente.");
									} else {
										System.err.println("No se ha podido añadir la vivienda.");
									}
									
								}//fin chalet 2da mano
							} else if (tp_vivienda_in.equals("PISO")) {
								System.out.print("¿Es nuevo o de segunda mano? = ");
								String estado_vivienda = lector.nextLine().toUpperCase();
								if (estado_vivienda.equals("NUEVO")) {
									System.out.print("ingresa la dirección (calle,número,codpostal) = ");
									String ubi_in = lector.nextLine();
									System.out.print("ingresa el tamaño en metros cuadrados = ");
									Double tamanio_in = Double.parseDouble(lector.nextLine());
									System.out.print("¿Cuantas habitaciones tiene? = ");
									Integer n_hab_in = Integer.parseInt(lector.nextLine());
									System.out.printf("ingresa el precio total = ");
									Double p_total_in = Double.parseDouble(lector.nextLine());
									System.out.printf("¿Cuantas plantas tiene? = ");
									Integer n_plantas_in = Integer.parseInt(lector.nextLine());
									// TODO piso nuevo
									v1 = new Vivienda(TP_INMBL.CONSTRUCCION,TP_CNSTRCN.VIVIENDA,EST_CNSTRCN.NUEVO,ubi_in,tamanio_in,TP_VVND.PISO,n_hab_in,p_total_in,n_plantas_in);
									if (datos_inmu.add(v1.toString())) {
										System.out.println("Piso añadido correctamente.");
									} else {
										System.err.println("No se ha podido añadir la vivienda.");
									}
									
								}else if (estado_vivienda.equals("SEGUNDA MANO")) {
									System.out.print("ingresa la dirección (calle,número,codpostal) = ");
									String ubi_in = lector.nextLine();
									System.out.print("ingresa el tamaño en metros cuadrados = ");
									Double tamanio_in = Double.parseDouble(lector.nextLine());
									System.out.print("¿Cuantas habitaciones tiene? = ");
									Integer n_hab_in = Integer.parseInt(lector.nextLine());
									System.out.printf("ingresa el precio total = ");
									Double p_total_in = Double.parseDouble(lector.nextLine());
									System.out.printf("¿Cuantas plantas tiene? = ");
									Integer n_plantas_in = Integer.parseInt(lector.nextLine());
									// TODO piso segunda mano
									v1 =  new Vivienda(TP_INMBL.CONSTRUCCION,TP_CNSTRCN.VIVIENDA,EST_CNSTRCN.SGND_MANO,ubi_in,tamanio_in,TP_VVND.PISO,n_hab_in,p_total_in,n_plantas_in);
									if (datos_inmu.add(v1.toString())) {
										System.out.println("Vivienda añadida correctamente.");
									} else {
										System.err.println("No se ha podido añadir la vivienda.");
									}
									
								}//fin piso segunda mano
							}// if vivienda  - > piso 					
						}else if (tp_cons_in.equals("LOCAL")) {
							System.out.print("¿Es nuevo o de segunda mano? = ");
							String estado_vivienda = lector.nextLine().toUpperCase();
							if (estado_vivienda.equals("NUEVO")) {
								System.out.print("ingresa la dirección (calle,número,codpostal) = ");
								String ubi_in = lector.nextLine();
								System.out.print("ingresa el tamaño en metros cuadrados = ");
								Double tamanio_in = Double.parseDouble(lector.nextLine());
								System.out.printf("ingresa el precio total = ");
								Double p_total_in = Double.parseDouble(lector.nextLine());
								// TODO local nuevo
								l1 = new Local(TP_INMBL.CONSTRUCCION,EST_CNSTRCN.NUEVO,ubi_in,tamanio_in,TP_CNSTRCN.LOCAL,p_total_in);
								if (datos_inmu.add(l1.toString())) {
									System.out.println("Local añadido correctamente.");
								} else {
									System.err.println("No se ha podido añadir el local.");
								}
								
							}else if (estado_vivienda.equals("SEGUNDA MANO")) {
								System.out.print("ingresa la dirección (calle,número,codpostal) = ");
								String ubi_in = lector.nextLine();
								System.out.print("ingresa el tamaño en metros cuadrados = ");
								Double tamanio_in = Double.parseDouble(lector.nextLine());
								System.out.printf("ingresa el precio total = ");
								Double p_total_in = Double.parseDouble(lector.nextLine());
								// TODO local segunda mano
								l1 = new Local(TP_INMBL.CONSTRUCCION,EST_CNSTRCN.SGND_MANO,ubi_in,tamanio_in,TP_CNSTRCN.LOCAL,p_total_in);
								if (datos_inmu.add(l1.toString())) {
									System.out.println("Local añadido correctamente.");
								} else {
									System.err.println("No se ha podido añadir el local.");
								}
								
							}// fin local -> segunda mano
						}// fin inmueble -> local
					}else if (tp_inmu_in.toUpperCase().equals("SUPERFICIE")) {
						System.out.print("¿Qué tipo de superficie es? [Solar/Plaza de garaje] = ");
						String tp_sup_in = lector.nextLine().toUpperCase();
						if (tp_sup_in.equals("SOLAR")) {
							System.out.print("¿Qué tipo de solar es? [Rústico/Urbanizable] =");
							String tp_solar_in = lector.nextLine().toUpperCase();
							if (tp_solar_in.equals("RÚSTICO")) {
								System.out.print("ingresa la dirección (calle,número,codpostal) = ");
								String ubi_in = lector.nextLine();
								System.out.print("ingresa el tamaño en metros cuadrados = ");
								Double tamanio_in = Double.parseDouble(lector.nextLine());
								System.out.printf("ingresa el precio por metro cuadrado = ");
								Double p_mcuadrado_in = Double.parseDouble(lector.nextLine());
								// TODO solar rustico
								s1 = new Solar(TP_INMBL.SUPERFICIE,TP_SPRFC.SOLAR,TP_SLR.RUSTICO,ubi_in,tamanio_in,p_mcuadrado_in);
								if (datos_inmu.add(s1.toString())) {
									System.out.println("Solar añadido corretamente");
								} else {
									System.err.println("No se ha podido añadir.");
								}
							}if (tp_solar_in.equals("URBANIZABLE")) {
								System.out.print("ingresa la dirección (calle,número,codpostal) = ");
								String ubi_in = lector.nextLine();
								System.out.print("ingresa el tamaño en metros cuadrados = ");
								Double tamanio_in = Double.parseDouble(lector.nextLine());
								System.out.printf("ingresa el precio por metro cuadrado = ");
								Double p_mcuadrado_in = Double.parseDouble(lector.nextLine());
								// TODO solar urbanizable
								s1 = new Solar(TP_INMBL.SUPERFICIE,TP_SPRFC.SOLAR,TP_SLR.URBANIZABLE,ubi_in,tamanio_in,p_mcuadrado_in);
								if (datos_inmu.add(s1.toString())) {
									System.out.println("Solar añadido correctamente");
								} else {
									System.err.println("No se ha podido añadir el solar.");
								}
							}//fin solar -> Rustico o Urbanizable
						}else if (tp_sup_in.equals("PLAZA DE GARAJE")) {
							System.out.print("¿Qué tipo de garaje es? [Público/Privado] = ");
							String tp_garaje = lector.nextLine().toUpperCase();
							if (tp_garaje.equals("PÚBLICO")) {
								System.out.print("ingresa la dirección (calle,número,codpostal) = ");
								String ubi_in = lector.nextLine();
								System.out.print("ingresa el tamaño en metros cuadrados = ");
								Double tamanio_in = Double.parseDouble(lector.nextLine());
								System.out.printf("ingresa el precio total = ");
								Double p_total_in = Double.parseDouble(lector.nextLine());
								p1 = new PlzGaraje(TP_INMBL.SUPERFICIE,TP_SPRFC.PLZ_GARAJE,ubi_in,tamanio_in,TP_PLZ.PUBLICO,p_total_in);
								// TODO plaza de garaje publico
								if (datos_inmu.add(p1.toString())) {
									System.out.println("Plaza de garaje añadida correctamente.");
								} else {
									System.out.println("No se ha podido añadir la plaza de garaje.");
								}
								
							}else if (tp_garaje.equals("PRIVADO")) {
								System.out.print("ingresa la dirección (calle,número,codpostal) = ");
								String ubi_in = lector.nextLine();
								System.out.print("ingresa el tamaño en metros cuadrados = ");
								Double tamanio_in = Double.parseDouble(lector.nextLine());
								System.out.printf("ingresa el precio por metro cuadrado = ");
								Double p_mcuadrado_in = Double.parseDouble(lector.nextLine());
								p1 = new PlzGaraje(TP_INMBL.SUPERFICIE,TP_SPRFC.PLZ_GARAJE,ubi_in,tamanio_in,TP_PLZ.PRIVADO,p_mcuadrado_in);
								// TODO plaza de garaje publico
								if (datos_inmu.add(p1.toString())) {
									System.out.println("Plaza de garaje añadida correctamente.");
								} else {
									System.err.println("No se ha podido añadir la plaza de garaje.");
								}
							}// garage = privado
						}// inmueble -> Solar o Plaza de Garaje
					}// inmueble -> Superficie
				
															
				default:
					break;
				}
				
			} while (op!= -1);
			for (String datos_inmu_out : datos_inmu) {
				for (int i = 0; i < datos_inmu_out.length(); i++) {
					int c = datos_inmu_out.charAt(i);
					bufW.write(c);
				}
			}
			System.out.println("Datos actualizados correctamente...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Guardar objetos en un fichero
//		try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
//				ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo)))	{
//			
//			escribir.writeObject(Inmueble.ventas);
//			
//			ArrayList <Inmueble> copia_ventas = new ArrayList<Inmueble>();
//
//			copia_ventas = (ArrayList <Inmueble>) leer.readObject();
//			
//			for (Inmueble Inmu : copia_ventas) {
//				System.out.println(Inmu.toString());
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		double precio = 5000000;
//		System.out.printf("(Solares / Viviendas) en venta con precio inferior a %.2f :%n" , precio);
//		ex1.inmueblesVenta(precio);
//		System.out.println();
//		double superficie = 10;
//		System.out.printf("(Locales) para alquilar de segunda mano con una superficie superior a %.2f:%n" , superficie);
//		ex1.localesSegundaMano(superficie);
//		System.out.println();
//		System.out.println("(Solares) en zona rústica que están en venta.");
//		ex1.solaresRusticos();
		
		
	}
}
