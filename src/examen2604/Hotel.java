package examen2604;

public class Hotel implements Comparable<Hotel> {
	private int idHotel = 0;
	private ZONA zonaHotel;
	private double precio;
	
	public Hotel(int id_Hotel, ZONA zonaH, double precio) {
		idHotel = id_Hotel;
		zonaHotel = zonaH;
		setPrecio(precio);
	}
		
	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public ZONA getZonaHotel() {
		return zonaHotel;
	}

	public void setZonaHotel(ZONA zonaHotel) {
		this.zonaHotel = zonaHotel;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precioIn) {		
		if (precioIn < 40 ) {
			this.precio = 40;
		}else if (precioIn > 150) {
			this.precio = 150;
		} else {
			precio = precioIn;
		}
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", zonaHotel=" + zonaHotel + ", precio=" + precio + "]";
	}

	enum ZONA {MONTANA,RURAL,PLAYA}

	@Override
	public int compareTo(Hotel o) {
		int rsp;
		rsp = (int)(this.precio - o.precio);
		if (rsp == 0) {
			rsp = this.idHotel - o.idHotel;
		}
		return rsp;
	};
}
