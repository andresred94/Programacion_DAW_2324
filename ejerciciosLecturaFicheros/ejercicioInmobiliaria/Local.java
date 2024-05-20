package ejercicioInmobiliaria;

import java.io.Serializable;
import java.util.Comparator;

public class Local extends Construccion implements Serializable , Comparable <Inmueble>{

	private static final long serialVersionUID = 1L;

	public Local(TP_INMBL inmu, EST_CNSTRCN estado , String ubi, double mCuadrados, TP_CNSTRCN tipo_cns, double precio) {
		super(inmu,tipo_cns,estado,ubi, mCuadrados, precio);
	}
	@Override
	public void añadeAlquilerInmueble(Local l){
		alquileres.add(l);
	}

	@Override
	public String toString() {
//		return "tipo_inmueble:"+getTipo_inmueble()+",inmueble:"+ getTipo_Cons()+",estado:" + getEstadoCons() + ",ubicacion: " + getUbicacion() + ",tamaño:"+ getTamanio() + ",precio:" + getPrecioTdecimal();
		return String.format("tipo_inmueble:%s,inmueble:%s,estado:%s,ubicacion:%s,tamaño:%.2f,precio:%.2f",getTipo_inmueble(),getTipo_Cons(),getEstadoCons(),getUbicacion(),getTamanio(),getPrecioTdecimal());
	}
	
	
	@Override
	public int compareTo(Inmueble o) {
		return o.getUbicacion().length();
	}


}
