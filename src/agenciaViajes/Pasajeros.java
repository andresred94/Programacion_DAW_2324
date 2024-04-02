package agenciaViajes;
enum genero{MASCULINO,FEMENINO,OTRO}


public class Pasajeros {
    // atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private genero genPasajero;
    private int numVuelo;

    // setter y getters
    public void setEdad(int edad) {
        if (edad > 85)
            this.edad = 85;
        else
            this.edad = edad;
    }
      
    public int getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public int getEdad() {
        return edad;
    }    
    
    public genero getGenPasajero() {
		return genPasajero;
	}

	public void setGenPasajero(genero genPasajero) {
		this.genPasajero = genPasajero;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public String getNombre() {
		return nombre;
	}

	// constructores
    public Pasajeros(String nombreUsr, String apeUsr, int edadUsr, String dniUsr, genero genUsr, int numVuelo){
        setNombre(nombreUsr);
        setApellido(apeUsr);
        setEdad(edadUsr);
        setDni(dniUsr);
        setGenPasajero(genUsr);
        setNumVuelo(numVuelo);
    }

	@Override
	public String toString() {
		return "Pasajero [nombre= " + nombre + " " + apellido + ", edad= " + edad + ", dni= " + dni
				+ ", numero de vuelo = " + numVuelo + "]";
	}
   
    
    
}// fin-class Vuelos
