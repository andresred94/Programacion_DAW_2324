package colecNBA;

import java.io.Serializable;

public class Jugador implements Comparable <Jugador>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//-->Atributos<--//
	private String nombre;
	private int edad;
	private String nomEquipo;
	private int numCanastasIntro;
	private String ciudad;
	
	//-->Getters/Setters<--//
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNomEquipo() {
		return nomEquipo;
	}
	public void setNomEquipo(String nomEquipo) {
		this.nomEquipo = nomEquipo;
	}
	public int getNumCanastasIntro() {
		return numCanastasIntro;
	}
	public void setNumCanastasIntro(int numCanastasIntro) {
		this.numCanastasIntro = numCanastasIntro;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	//-->Construsctores<--//
	public Jugador(){}
	public Jugador(String nombre, int edad, String nomEquipo, int numCanastasIntro, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nomEquipo = nomEquipo;
		this.numCanastasIntro = numCanastasIntro;
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return String.format("nombre: %s edad: %d equipo: %s canastas_introducidas: %d ciudad: %s",nombre,edad,nomEquipo,numCanastasIntro,ciudad);
		
	}

	@Override
	public int compareTo(Jugador o) {
		int rsp = this.ciudad.compareToIgnoreCase(o.getCiudad());
		if (rsp == 0) {
			rsp = this.nombre.compareToIgnoreCase(o.getNombre());
		}
		return rsp;
	}
	
	
}// fin-class Jugador
