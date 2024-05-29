package basedeDatosEmpleados;

import java.util.Comparator;



public class CompararIDdepartamentoEmpleado implements Comparator <Empleados>{

	@Override
	public int compare(Empleados o1, Empleados o2) {
//		int rsp = o1.getId_trabajo().compareTo(o2.getId_trabajo());
//		if (rsp != 0) {
//			rsp = o1.getId_trabajo().compareTo(o2.getId_trabajo());
//		}
		return o1.getId_trabajo().compareTo(o2.getId_trabajo());

	}

}
