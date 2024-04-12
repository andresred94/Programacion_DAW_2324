package ejercicioInmobiliaria;

public class Solar extends Superficie{
	enum TP_SLR {RUSTICO,URBANIZABLE}
	private TP_SLR tipoS;
	
	public TP_SLR getTipoS() {
		return tipoS;
	}
	
	public void setTipoS(TP_SLR tipoS) {
		this.tipoS = tipoS;
	}
	
	public Solar(String ubi, double mCuadrados, TP_INMBL inmu, TP_SPRFC tipo_sup, TP_SLR tipo_sol, double precio) {
		super(ubi, mCuadrados, inmu, tipo_sup,precio);
		tipoS = tipo_sol;
	}
	
	@Override
	public void añadeVentaInmueble(Solar s) {
		ventas.add(s);
	}

	@Override
	public String toString() {
		return "Solar:"+tipoS+ " T_SUP:"+super.getTipoSup()+" [Ubi:"+super.getUbicacion()+", Tmñ:"+super.getTamanio()+" P/mCuadrado:"+super.getPreciomCuadrado() + " P.Total:"+super.getpTotal()+ "]";
	}	
}
