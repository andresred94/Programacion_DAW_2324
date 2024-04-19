package colecAlquilerVivienda;

import java.util.Comparator;

public class CompararPrecioVivienda implements Comparator <Vivienda>{

	@Override
	public int compare(Vivienda o1, Vivienda o2) {
		return (int) (o1.getPrecio() - o2.getPrecio());
	}
	
}
