package ejercicioInmobiliaria;

public abstract class Construccion extends Inmueble{
	private TP_CNSTRCN tipoCons;
	enum TP_CNSTRCN {NUEVA,SGND_MANO}
	
	public TP_CNSTRCN getTipoCons() {
		return tipoCons;
	}

	public void setTipoCons(TP_CNSTRCN tipoCons) {
		this.tipoCons = tipoCons;
	}
	
//	public double getPrecio() {
//		return precio;
//	}

//	public void setPrecio(double precio) {
//		this.precio = precio;
//	}

	public Construccion(String ubi, double mCuadrados, TP_INMBL inmu, TP_CNSTRCN tipo_cns, double precio) {
		super(ubi, mCuadrados, inmu,precio);
		//this.precio = precio;
		tipoCons = tipo_cns;
	}

	@Override
	public String toString() {
		return tipoCons+"[Ubicacion: " + super.getUbicacion() +" Tamaño: "+super.getTamanio()+ "]";
	}

	
}
