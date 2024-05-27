package examen3eva;

import java.io.Serializable;

public abstract class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dni;
	private String nombre;
	private String apellidos;
	private int anio_nacimiento;
	
	public Persona() {
		super();
	}
	
	public Persona(String dni, String apellidos, String nombre, int anio_nacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anio_nacimiento = anio_nacimiento;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAnio_nacimiento() {
		return anio_nacimiento;
	}
	public void setAnio_nacimiento(int anio_nacimiento) {
		this.anio_nacimiento = anio_nacimiento;
	}
	
	public void mostrarDatos() {}
	
}
