package comparandoObjetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import ejercicioInmobiliaria.Inmueble;

public class ExeProgram {
	public static void main(String[] args) {
		String ruta = "\\..\\archivos\\nombArchi";
		
		TreeSet <Socio> socios = new TreeSet <Socio>();
		Socio s1 = new Socio(1,"Socio1");
		String ruta_escritura = ruta.replaceAll("nombArchi", "socios.dat");
		File fich_leer = new File(ruta_escritura);
			
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fich_leer))) {
			Socio so = (Socio) ois.readObject();
			socios.add(so);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		
		String ruta_escrit = ruta.replaceAll("nombArchi","socios.dat");
		try (	ObjectOutputStream escArch = new ObjectOutputStream(new FileOutputStream( ruta_escrit,true))){
			escArch.writeObject(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		for (Socio s : socios) {
			System.out.println(s.toString());
		}
		
		
		
		
//		ArrayList <Socio> socios = new ArrayList <>();
//		Socio s1 = new Socio(6,"Elber Galarga",4);
//		Socio s2 = new Socio(2,"Alex Cremento",55);
//		Socio s3 = new Socio(21,"Tolna Botieso",44);
//		Socio s4 = new Socio(1,"Abc",29);
//		Socio s5 = new Socio(3,"Abbd",30);
//		
//		socios.add(s1);
//		socios.add(s2);
//		socios.add(s3);
//		socios.add(s4);
//		socios.add(s5);
//		
//		System.out.println("Ordenador por id y nombre:");
//		Collections.sort(socios);
//		for (int i = 0; i < socios.size(); i++) {
//			System.out.println(socios.get(i).toString());
//		}
//			
//		System.out.println("Ordenador por edad descendente:");
//		
//		//Collections.sort(socios,new CompararEdadSocio());
//		socios.sort(new CompararEdadSocio().reversed());// Descendente
//		//socios.sort(new CompararEdadSocio());// ascendente
//
//		
//		
//		for (int i = 0; i < socios.size(); i++) {
//			System.out.println(socios.get(i).toString());
//		}
//
//		
//		
//		System.out.println("Ordenador por nombre:");
//		socios.sort(new CompararNombreSocio());
//		
//		for (int i = 0; i < socios.size(); i++) {
//			System.out.println(socios.get(i).toString());
//		}
//
	}
}
