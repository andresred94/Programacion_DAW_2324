package colecAlquilerVivienda;

import colecAlquilerVivienda.Vivienda.*;

public class ExeProgram {
	public static void main(String[] args) {
		Inmobiliaria i1 = new Inmobiliaria();
		Vivienda v1 = new Vivienda("INMU-1",TP_VIVIENDA.UNAHAB,"Calle La Calle 10 Madrid",120000);
		Vivienda v2 = new Vivienda("INMU-2",TP_VIVIENDA.UNAHAB,"Calle La Calle 10 Madrid",220000);
		Vivienda v3 = new Vivienda("INMU-3",TP_VIVIENDA.DOSHAB,"Calle La Calle 10 Madrid",320000);
		Vivienda v4 = new Vivienda("INMU-4",TP_VIVIENDA.DOSHAB,"Calle La Calle 10 Madrid",20000);
		Vivienda v5 = new Vivienda("INMU-5",TP_VIVIENDA.TRESHAB,"Calle La Calle 10 Madrid",230000);
		Vivienda v6 = new Vivienda("INMU-6",TP_VIVIENDA.TRESHAB,"Calle La Calle 10 Madrid",620000);
		
		
		i1.aniadirVivienda(v1);
		i1.aniadirVivienda(v2);
		i1.aniadirVivienda(v3);
		i1.aniadirVivienda(v4);
		i1.aniadirVivienda(v5);
		i1.aniadirVivienda(v6);
		
		i1.mostrarContenido();
		double pmin = 300000;
		double pmax = 1000000;
		
		System.out.printf("Viviendas con precio entre %.2f y %.2f%n",pmin,pmax);
		
		i1.consultaViviendaPrecio(pmin,pmax);
		
		System.out.println("Mostrando vivienda de la categoria UNAHAB");
		i1.consultaViviendaCategoria(TP_VIVIENDA.UNAHAB);
	}
}
