package ejercicioInmobiliaria;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Inmueble implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList <Inmueble> ventas = new ArrayList <Inmueble>();
	public static ArrayList <Inmueble> alquileres = new ArrayList <Inmueble>();
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
		
	public TP_INMBL getTipo_inmueble() {
		return tipo;
	}
	
	public Inmueble() {}

	public Inmueble(TP_INMBL inmu, String ubi, double mCuadrados  ) {
		tipo = inmu;
		ubicacion = ubi;
		tamanio = mCuadrados;
		
	}
	
	public Inmueble(TP_INMBL inmu, String ubi, double mCuadrados,  double precioTotal ) {
		tipo = inmu;
		ubicacion = ubi;
		tamanio = mCuadrados;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inmueble inmueble = (Inmueble) obj;
        return Double.compare(inmueble.tamanio, tamanio) == 0 &&
                ubicacion.equals(inmueble.ubicacion);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
