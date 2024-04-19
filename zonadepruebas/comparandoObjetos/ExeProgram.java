package comparandoObjetos;

import java.util.ArrayList;
import java.util.Collections;

public class ExeProgram {
	public static void main(String[] args) {
		ArrayList <Socio> socios = new ArrayList <>();
		Socio s1 = new Socio(6,"Elber Galarga",4);
		Socio s2 = new Socio(2,"Alex Cremento",55);
		Socio s3 = new Socio(21,"Tolna Botieso",44);
		Socio s4 = new Socio(1,"Abc",29);
		Socio s5 = new Socio(3,"Abbd",30);
		
		socios.add(s1);
		socios.add(s2);
		socios.add(s3);
		socios.add(s4);
		socios.add(s5);
		
		System.out.println("Ordenador por id y nombre:");
		Collections.sort(socios);
		for (int i = 0; i < socios.size(); i++) {
			System.out.println(socios.get(i).toString());
		}
			
		System.out.println("Ordenador por edad descendente:");
		
		//Collections.sort(socios,new CompararEdadSocio());
		socios.sort(new CompararEdadSocio().reversed());// Descendente
		//socios.sort(new CompararEdadSocio());// ascendente

		
		
		for (int i = 0; i < socios.size(); i++) {
			System.out.println(socios.get(i).toString());
		}

		
		
		System.out.println("Ordenador por nombre:");
		socios.sort(new CompararNombreSocio());
		
		for (int i = 0; i < socios.size(); i++) {
			System.out.println(socios.get(i).toString());
		}

	}
}
