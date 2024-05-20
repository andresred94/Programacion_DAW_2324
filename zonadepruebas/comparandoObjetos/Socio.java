package comparandoObjetos;

import java.io.Serializable;

public class Socio implements Serializable, Comparable <Socio>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//-->[ atributos ]<--//
	private int id;
	private String nombre;
	private int edad;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Socio(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre +", edad="+edad+ "]";
	}
	
	// ordenar por ID
	@Override
	public int compareTo(Socio o) {
		//Socio s = (Socio) o;
		int rsp = this.id - o.id;
		if (this.id == o.id) {
			return this.nombre.compareTo(o.nombre);
		}
		return rsp;
	}	
	
	
	// Ordenar por nombre
//	@Override
//	public int compareTo(Object o) {
//		Socio s = (Socio) o;
//		return this.nombre.compareTo(s.nombre);
//	}	
	
	
}// fin-class Socio
