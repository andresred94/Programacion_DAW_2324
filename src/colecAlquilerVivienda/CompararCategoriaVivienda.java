package colecAlquilerVivienda;

import java.util.Comparator;

public class CompararCategoriaVivienda implements Comparator <Vivienda> {

	@Override
	public int compare(Vivienda o1, Vivienda o2) {
		return o1.getCategoria().toString().compareTo(o2.getCategoria().toString());
	}

}
