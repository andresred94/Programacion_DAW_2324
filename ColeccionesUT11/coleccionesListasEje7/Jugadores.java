package coleccionesListasEje7;

import java.io.Serializable;

public class Jugadores implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int dorsal;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", dorsal=" + dorsal + "]";
	}
			
	public Jugadores(String nombre, int dorsal) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
	}
}
