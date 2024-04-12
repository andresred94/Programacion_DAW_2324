package ejercicioInmobiliaria;

import ejercicioInmobiliaria.Construccion.*;
import ejercicioInmobiliaria.PlzGaraje.*;
import ejercicioInmobiliaria.Solar.*;
import ejercicioInmobiliaria.Superficie.*;
import ejercicioInmobiliaria.Vivienda.*;

public class Inmobiliaria extends Inmueble{
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
		Inmobiliaria ex1 = new Inmobiliaria();

		PlzGaraje p1 = new PlzGaraje("Madrid",50,TP_INMBL.SUPERFICIE,TP_SPRFC.PLZ_GARAJE,TP_PLZ.PRIVADO,2);
		p1.añadeAlquilerInmueble(p1);
		PlzGaraje p2 = new PlzGaraje("Jaen",25.4,TP_INMBL.SUPERFICIE,TP_SPRFC.PLZ_GARAJE,TP_PLZ.PUBLICO,50.45);
		p2.añadeAlquilerInmueble(p2);
		Solar s1 = new Solar("Bilbao",44.4,TP_INMBL.SUPERFICIE,TP_SPRFC.SOLAR,TP_SLR.RUSTICO,10);
		s1.añadeVentaInmueble(s1);
		Solar s2 = new Solar("Murcia",44.4,TP_INMBL.SUPERFICIE,TP_SPRFC.SOLAR,TP_SLR.URBANIZABLE,1.2);
		s2.añadeVentaInmueble(s2);
		Vivienda v1 = new Vivienda("Asturias",110,TP_INMBL.CONSTRUCCION,TP_CNSTRCN.NUEVA,TP_VVND.CHALET,120000.76,6,1);
		v1.añadeVentaInmueble(v1);
		Vivienda v2 = new Vivienda("Santander",110,TP_INMBL.CONSTRUCCION,TP_CNSTRCN.NUEVA,TP_VVND.PISO,220000,4,2);
		v2.añadeVentaInmueble(v2);
		Local l1 = new Local("Madrid",300,TP_INMBL.CONSTRUCCION,TP_CNSTRCN.SGND_MANO,2000);
		l1.añadeAlquilerInmueble(l1);
		Local l2 = new Local("Portugal",30,TP_INMBL.CONSTRUCCION,TP_CNSTRCN.SGND_MANO,2000);
		l2.añadeAlquilerInmueble(l2);
		
	
		double precio = 5000000;
		System.out.printf("(Solares / Viviendas) en venta con precio inferior a %.2f :%n" , precio);
		ex1.inmueblesVenta(precio);
		System.out.println();
		double superficie = 10;
		System.out.printf("(Locales) para alquilar de segunda mano con una superficie superior a %.2f:%n" , superficie);
		ex1.localesSegundaMano(superficie);
		System.out.println();
		System.out.println("(Solares) en zona rústica que están en venta.");
		ex1.solaresRusticos();
		
		
	}
}
