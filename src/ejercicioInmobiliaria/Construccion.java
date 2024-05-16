package ejercicioInmobiliaria;

public abstract class Construccion extends Inmueble{
	private EST_CNSTRCN estadoCons;
	private TP_CNSTRCN tipo_Cons;
	enum TP_CNSTRCN {LOCAL,VIVIENDA};
	enum EST_CNSTRCN {NUEVO,SGND_MANO}
	
	public EST_CNSTRCN getEstadoCons() {
		return estadoCons;
	}

	public void setEstadoCons(EST_CNSTRCN estadoCons) {
		this.estadoCons = estadoCons;
	}

	public TP_CNSTRCN getTipo_Cons() {
		return tipo_Cons;
	}

	public void setTipo_Cons(TP_CNSTRCN tipo_Cons) {
		this.tipo_Cons = tipo_Cons;
	}

	public void setTipoCons(EST_CNSTRCN tipoCons) {
		this.estadoCons = tipoCons;
	}
	
	public Construccion(TP_INMBL inmu,TP_CNSTRCN tipoConstruccion, EST_CNSTRCN estado_cons,String ubi, double mCuadrados, double precio ) {
		super(inmu,ubi,mCuadrados,precio);
		tipo_Cons = tipoConstruccion; 
		estadoCons = estado_cons;
	}

	
}
