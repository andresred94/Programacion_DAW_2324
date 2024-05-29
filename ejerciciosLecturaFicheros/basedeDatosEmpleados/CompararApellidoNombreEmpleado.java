package basedeDatosEmpleados;

import java.util.Comparator;

public class CompararApellidoNombreEmpleado implements Comparator <Empleados>{

	@Override
	public int compare(Empleados o1, Empleados o2) {
		int rsp = o1.getApellido().compareTo(o2.getApellido());
		if (rsp == 0) {
			rsp = o1.getNombre().compareTo(o2.getNombre());
		}
		return rsp;
	}

}
