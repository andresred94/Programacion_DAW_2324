package examen3eva;

import java.util.Comparator;

public class Paciente extends Persona implements Comparator<Paciente> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int peso;

	public Paciente() {
		super();
	}

	public Paciente(String dni, String nombre, String apellidos, int anio_nacimiento, int peso) {
		super(dni, nombre, apellidos, anio_nacimiento);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void mostrarDatos() {
		System.out.println(String.format("%s,%s,%s,%d,%d", getDni(), getApellidos(), getNombre(), getAnio_nacimiento(),
				getPeso()));
	}

	@Override
	public int compare(Paciente o1, Paciente o2) {
		int rsp = o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
		if (rsp == 0) {
			rsp = o1.getNombre().compareToIgnoreCase(o2.getNombre());
		}
		return rsp;
	}

}// fin-class Paciente
