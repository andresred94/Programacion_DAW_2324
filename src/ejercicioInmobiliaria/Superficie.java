package ejercicioInmobiliaria;

public abstract class Superficie extends Inmueble {
	private double preciomCuadrado;
	private String pTotal;
	private TP_SPRFC tipoSup;
	enum TP_SPRFC {SOLAR,PLZ_GARAJE}
		
	public String getpTotal() {
		return pTotal;
	}

	public TP_SPRFC getTipoSup() {
		return tipoSup;
	}

	public void setTipoSup(TP_SPRFC tipoSup) {
		this.tipoSup = tipoSup;
	}

	public double getPreciomCuadrado() {
		return preciomCuadrado;
	}

	public void setPreciomCuadrado(double preciomCuadrado) {
		this.preciomCuadrado = preciomCuadrado;
	}


	public Superficie(String ubi, double mCuadrados, TP_INMBL inmu , TP_SPRFC tipo_sup, double pmetro) {
		super(ubi, mCuadrados, inmu);
		preciomCuadrado = pmetro;
		pTotal = String.format("%.2f",precio());
		super.setpTotal(pTotal);
		tipoSup = tipo_sup;
	}
	
	public Superficie(String ubi, double mCuadrados, TP_INMBL inmu , TP_SPRFC tipo_sup) {
		super(ubi, mCuadrados, inmu);
		tipoSup = tipo_sup;
	}
	

	public double precio() {
		return (preciomCuadrado * getTamanio());

   }

	@Override
	public String toString() {
		return tipoSup+"[Ubicacion: "+super.getUbicacion()+" Tamaño: "+super.getTamanio()+"preciomCuadrado: "+ preciomCuadrado +"]";
	}

	
}
