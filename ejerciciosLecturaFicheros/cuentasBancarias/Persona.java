package cuentasBancarias;

import java.io.Serializable;

public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// [ --> ATRIBUTOS <-- ]
	private String DNI;
	private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
	
	// [ --> CONSTRUCTORES <-- ]
    public Persona() {}
    public Persona( String DNI,String nombre, String apellido1, String apellido2,  String telefono) {
    	this.DNI = DNI;
    	this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
    }


    // [ --> GETTERS/SETTERS <-- ]
    public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getnombPersona() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getape1Per() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getape2Per() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    
}// fin-class Persona
