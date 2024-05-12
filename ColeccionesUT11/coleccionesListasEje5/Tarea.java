package coleccionesListasEje5;

public class Tarea {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tarea(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Tarea: " + nombre;
	}
	
	
	
	
}
