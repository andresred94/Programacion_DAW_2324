package empleadoejercicio;

public class Empleado {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	public Empleado () {}
	
	public Empleado (String nombreIngresado) {
		nombre = nombreIngresado;
	}
	
}// fin-class Empleado
