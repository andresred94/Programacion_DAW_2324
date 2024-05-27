package examen3eva;

import java.util.Comparator;

public class CompararNombreApellidoPaciente implements Comparator <Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		int rsp = o1.getNombre().compareToIgnoreCase(o2.getNombre());
		if (rsp == 0) {
			rsp = o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
		}
		return rsp;
	}
	
}
