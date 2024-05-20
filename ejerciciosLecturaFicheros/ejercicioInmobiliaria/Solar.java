package ejercicioInmobiliaria;

import java.io.Serializable;
import java.util.Objects;

public class Solar extends Superficie implements Serializable , Comparable <Inmueble>{
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
		return String.format("tipo_inmueble:%s,inmueble:%s,tipo_solar:%s,ubicacion:%s,tamaño:%.2f,precio_mcuadrado:%.2f,precio_total:%s",getTipo_inmueble(),super.getTipoSup(),getTipoS(),super.getUbicacion(),super.getTamanio(),super.getPreciomCuadrado(),super.getpTotal());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipoS);
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
		Solar other = (Solar) obj;
		return tipoS == other.tipoS;
	}

	@Override
	public int compareTo(Inmueble o) {
		return o.getUbicacion().length();
	}

}
