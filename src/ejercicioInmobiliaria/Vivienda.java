package ejercicioInmobiliaria;

public class Vivienda extends Construccion{
	private int numerohab;
	private int numeropisos;
	private TP_VVND tipoVvnd;
	enum TP_VVND {PISO,CHALET}
	
	public Vivienda(String ubi, double mCuadrados, TP_INMBL inmu, TP_CNSTRCN tipo_cns, TP_VVND tipo_vvnda, double precio, int nHab , int nPisos) {
		super(ubi, mCuadrados, inmu, tipo_cns, precio);
		numerohab = nHab;
		numeropisos = nPisos;
		tipoVvnd = tipo_vvnda;
	}
	
	@Override
	public void añadeVentaInmueble(Vivienda v) {
		ventas.add(v);
	}
	
	@Override
	public String toString() {
		return "Vivienda:"+tipoVvnd+" T_CONS:"+super.getTipoCons()+" [Ubi:" +super.getUbicacion()+ " Tmñ: " +super.getTamanio()+" Num_Hab:"+numerohab+" P.Total:"+super.getPrecioTdecimal()+" nºPisos:"+numeropisos+"]";
	}

	
}
