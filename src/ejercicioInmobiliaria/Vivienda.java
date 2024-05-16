package ejercicioInmobiliaria;

public class Vivienda extends Construccion{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numerohab;
	private int numeropisos;
	private TP_VVND tipoVvnd;
	enum TP_VVND {PISO,CHALET}
	
	public int getNumerohab() {
		return numerohab;
	}

	public void setNumerohab(int numerohab) {
		this.numerohab = numerohab;
	}

	public int getNumeropisos() {
		return numeropisos;
	}

	public void setNumeropisos(int numeropisos) {
		this.numeropisos = numeropisos;
	}

	public TP_VVND getTipoVvnd() {
		return tipoVvnd;
	}

	public void setTipoVvnd(TP_VVND tipoVvnd) {
		this.tipoVvnd = tipoVvnd;
	}

	public Vivienda(TP_INMBL inmu , TP_CNSTRCN tipo_cn, EST_CNSTRCN est_cons, String ubi, double mCuadrados, TP_VVND tipo_vvnda, int nHab,  double precio, int nPisos) {
		super(inmu, tipo_cn, est_cons,ubi, mCuadrados, precio);
		tipoVvnd = tipo_vvnda;
		numerohab = nHab;
		numeropisos = nPisos; 
	}
	
	@Override
	public void añadeVentaInmueble(Vivienda v) {
		ventas.add(v);
	}

	
	@Override
	public String toString() {
//		return "tipo_inmueble:"+getTipo_inmueble()+",inmueble:"+getTipo_Cons()+",tipo_vivienda:"+tipoVvnd+",estado:"+super.getEstadoCons()+",ubicación:" +super.getUbicacion()+ ",tamaño:" +super.getTamanio()+",n_habitaciones:"+numerohab+",precio_total:"+super.getPrecioTdecimal()+",n_pisos:"+numeropisos;
		return String.format("%ntipo_inmueble:%s,inmueble:%s,tipo_vivienda:%s,estado:%s,ubicación:%s,tamaño:%.2f,n_habitaciones:%d,precio_total:%.2f,n_pisos:%d",getTipo_inmueble(),getTipo_Cons(),tipoVvnd,super.getEstadoCons(),super.getUbicacion(),super.getTamanio(),numerohab,super.getPrecioTdecimal(),numeropisos);
	}
}
