package ejercicioInmobiliaria;

import java.io.Serializable;

public abstract class Superficie extends Inmueble implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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


	public Superficie(TP_INMBL inmu, TP_SPRFC tipo_sup, String ubi, double mCuadrados , double pmetro) {
		super(inmu,ubi, mCuadrados);
		preciomCuadrado = pmetro;
		pTotal = String.format("%.2f",precio());
		super.setpTotal(pTotal);
		tipoSup = tipo_sup;
	}
	
	public Superficie(TP_INMBL inmu, TP_SPRFC tipo_sup,String ubi, double mCuadrados ) {
		super(inmu,ubi, mCuadrados);
		tipoSup = tipo_sup;
	}
	

	public double precio() {
		return (preciomCuadrado * getTamanio());

   }

}// fin class Superficie
