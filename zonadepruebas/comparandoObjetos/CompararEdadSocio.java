package comparandoObjetos;

import java.util.Comparator;

public class CompararEdadSocio implements Comparator <Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
