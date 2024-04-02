package cuentasBancarias;

public class Persona {
	// [ --> ATRIBUTOS <-- ]
	private final String DNI;
	private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private final String telefono;
	
	// [ --> CONSTRUCTORES <-- ]
    public Persona( String DNI,String nombre, String apellido1, String apellido2,  String telefono) {
    	this.DNI = DNI;
    	this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
    }

    // [ --> OVERRIDE <-- ]
	@Override
	public String toString() {
		return "'" + DNI + "','" + nombre + "','" + apellido1 + "','" + apellido2+ "','" + telefono + "'";
	}
    
    
    
}// fin-class Persona
