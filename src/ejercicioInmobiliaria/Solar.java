package ejercicioInmobiliaria;

public class Solar extends Superficie{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum TP_SLR {RUSTICO,URBANIZABLE}
	private TP_SLR tipoS;
	
	public TP_SLR getTipoS() {
		return tipoS;
	}
	
	public void setTipoS(TP_SLR tipoS) {
		this.tipoS = tipoS;
	}
	
	public Solar(TP_INMBL inmu,TP_SPRFC tipo_sup,TP_SLR tipo_sol,String ubi, double mCuadrados, double precio) {
		super(inmu,tipo_sup,ubi, mCuadrados,precio);
		tipoS = tipo_sol;
	}
	
	@Override
	public void añadeVentaInmueble(Solar s) {
		ventas.add(s);
	}

	@Override
	public String toString() {
//		return "tipo_inmueble:"+getTipoSup()+ ",inmueble:"+super.getTipoSup()+",tipo_solar:"+getTipoS()+",ubicacion:"+super.getUbicacion()+",tamaño:"+super.getTamanio()+",precio_mCuadrado:"+super.getPreciomCuadrado() + ",precio_total:"+super.getpTotal();
		return String.format("%ntipo_inmueble:%s,inmueble:%s,tipo_solar:%s,ubicacion:%s,tamaño:%.2f,precio_mcuadrado:%.2f,precio_total:%s ",getTipoSup(),super.getTipoSup(),getTipoS(),super.getUbicacion(),super.getTamanio(),super.getPreciomCuadrado(),super.getpTotal());
	}	
}
