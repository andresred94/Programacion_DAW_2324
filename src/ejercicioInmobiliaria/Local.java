package ejercicioInmobiliaria;

public class Local extends Construccion {

	public Local(String ubi, double mCuadrados, TP_INMBL inmu, TP_CNSTRCN tipo_cns, double precio) {
		super(ubi, mCuadrados, inmu, tipo_cns, precio);
	}
	@Override
	public void añadeAlquilerInmueble(Local l){
		alquileres.add(l);
	}

	@Override
	public String toString() {
		return "Local:Comercial T_CONS:" + getTipoCons() + " [Ubi: " + getUbicacion() + " Tmñ:"
				+ getTamanio() + " Precio:" + getPrecioTdecimal() + "]";
	}

	
}
