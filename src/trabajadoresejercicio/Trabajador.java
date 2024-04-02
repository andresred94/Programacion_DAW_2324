package trabajadoresejercicio;

public abstract class Trabajador {
	// Atributos
	private String nombre;
	private String apellido;
	
	// setters y getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	// constructores
	public Trabajador(){}
	
	public Trabajador(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Trabajador: " + nombre + " " + apellido;
	}
	
	public abstract double CalcularSalario();
	
	
	
}// fin-class Trabajador
