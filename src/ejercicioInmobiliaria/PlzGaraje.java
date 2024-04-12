package ejercicioInmobiliaria;

public class PlzGaraje extends Superficie{
	enum TP_PLZ {PRIVADO,PUBLICO}
	private TP_PLZ tipoPlz;
	
	
	public TP_PLZ getTipoPlz() {
		return tipoPlz;
	}


	public void setTipoPlz(TP_PLZ tipoPlz) {
		this.tipoPlz = tipoPlz;
	}


	public PlzGaraje(String ubi, double mCuadrados, TP_INMBL inmu, TP_SPRFC tipo_sup, TP_PLZ tipo_garaje, double precio) {
		super(ubi, mCuadrados, inmu, tipo_sup,precio);
		tipoPlz = tipo_garaje;
	}

	@Override
	public void añadeAlquilerInmueble(PlzGaraje pl){
		alquileres.add(pl);
	}
	
	@Override
	public String toString() {
		return "Garaje:"+tipoPlz+" T_SUP:"+super.getTipoSup()+" [Ubi:" + super.getUbicacion() +" Tmñ:"+super.getTamanio()+" P/mCuadrado:"+super.getPreciomCuadrado()+ " P.Total:"+super.getpTotal()+ " ]";
	}
	
	

}
