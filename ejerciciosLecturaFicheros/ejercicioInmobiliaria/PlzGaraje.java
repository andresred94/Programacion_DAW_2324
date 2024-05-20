package ejercicioInmobiliaria;

import java.io.Serializable;
import java.util.Objects;

public class PlzGaraje extends Superficie implements Serializable, Comparable<PlzGaraje>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipoPlz);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlzGaraje other = (PlzGaraje) obj;
		return tipoPlz == other.tipoPlz;
	}


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
		return String.format("%ntipo_inmueble:%s,inmueble:%s,tipo_garaje:%s,ubicacion:%s,tamaño:%s,precio_mcuadrado:%.2f,precio_total:%s%n",getTipo_inmueble(),super.getTipoSup(),getTipoPlz(),super.getUbicacion(),super.getTamanio(),super.getPreciomCuadrado(),super.getpTotal());
	}


	@Override
	public int compareTo(PlzGaraje o) {
		return o.hashCode();
	}
	
	

}
