package ejercicioInmobiliaria;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Inmueble implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList <Inmueble> ventas = new ArrayList();
	public static ArrayList <Inmueble> alquileres = new ArrayList();
	private String ubicacion;
	private String pTotal;
	private double precioTdecimal;
	private double tamanio;
	private TP_INMBL tipo;
	enum TP_INMBL {SUPERFICIE,CONSTRUCCION}	
		
	public static void setVentas(ArrayList<Inmueble> ventas) {
		Inmueble.ventas = ventas;
	}

	public static void setAlquileres(ArrayList<Inmueble> alquileres) {
		Inmueble.alquileres = alquileres;
	}

	public double getPrecioTdecimal() {
		return precioTdecimal;
	}

	public void setPrecioTdecimal(double precioTdecimal) {
		this.precioTdecimal = precioTdecimal;
	}

	public String getpTotal() {
		return pTotal;
	}

	public void setpTotal(String pTotal) {
		this.pTotal = pTotal;
	}

	public ArrayList<Inmueble> getVentas() {
		return ventas;
	}

	public ArrayList<Inmueble> getAlquileres() {
		return alquileres;
	}


	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public double getTamanio() {
		return tamanio;
	}
	
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
		
	public TP_INMBL getTipo() {
		return tipo;
	}
	
	public Inmueble() {}

	public Inmueble(String ubi, double mCuadrados, TP_INMBL inmu ) {
		ubicacion = ubi;
		tamanio = mCuadrados;
		tipo = inmu;
	}
	
	public Inmueble(String ubi, double mCuadrados, TP_INMBL inmu, double precioTotal ) {
		ubicacion = ubi;
		tamanio = mCuadrados;
		tipo = inmu;
		precioTdecimal = precioTotal;
	}
	
	@Override
	public String toString() {
		return tipo + "[ubicacion= "+ ubicacion +", tamaño= "+ tamanio +"]";
	}
	
	public void añadeVentaInmueble(Solar ob) {};
	public void añadeVentaInmueble(Vivienda ob) {};
	public void añadeAlquilerInmueble(PlzGaraje ob) {};
	public void añadeAlquilerInmueble(Local ob) {};
	public void inmueblesVenta(double pVenta) {}
	public void localesSegundaMano(double mcuadrados) {}
	public void solaresRusticos() {}

}
