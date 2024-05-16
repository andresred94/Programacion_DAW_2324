package ejercicioInmobiliaria;

public class PlzGaraje extends Superficie{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum TP_PLZ {PRIVADO,PUBLICO}
	private TP_PLZ tipoPlz;
	
	
	public TP_PLZ getTipoPlz() {
		return tipoPlz;
	}


	public void setTipoPlz(TP_PLZ tipoPlz) {
		this.tipoPlz = tipoPlz;
	}


	public PlzGaraje(TP_INMBL inmu, TP_SPRFC tipo_sup,String ubi, double mCuadrados, TP_PLZ tipo_garaje, double precio) {
		super(inmu,tipo_sup,ubi, mCuadrados,precio);
		tipoPlz = tipo_garaje;
	}

	@Override
	public void añadeAlquilerInmueble(PlzGaraje pl){
		alquileres.add(pl);
	}
	
	@Override
	public String toString() {
//		return "tipo_inmueble:"+getTipo_inmueble()+",inmueble:"+super.getTipoSup()+",tipo_garaje:"+getTipoPlz()+",ubicacion:" + super.getUbicacion() +",tamaño:"+super.getTamanio()+",p_mcuadrado:"+super.getPreciomCuadrado()+ ",precio_total:"+super.getpTotal();
		return String.format("%ntipo_inmueble:%s,inmueble:%s,tipo_garaje:%s,ubicacion:%s,tamaño:%s,precio_mcuadrado:%.2f,precio_total:%s",getTipo_inmueble(),super.getTipoSup(),getTipoPlz(),super.getUbicacion(),super.getTamanio(),super.getPreciomCuadrado(),super.getpTotal());
	}
	
	

}
