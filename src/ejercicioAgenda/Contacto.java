package ejercicioAgenda;

public class Contacto {
	// -->[ ATRIBUTOS ]<--
	private String nombre;
	private String telefono;
	
    // -->[ SETTERS Y GETTERS ]<--
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
			
		if (telefono.length() == 9) {
			for (int i = 0; i < telefono.length(); i++) {
				char c = telefono.charAt (i);
				if (Character.isDigit(c)) {
					this.telefono = telefono;		
				}
			}
		} else {
			System.out.printf("El usuario %s no tiene un telefono válido.%n",getNombre());
		}
	}// fin setTelefono
	
	// -->[ CONSTRUCTORES ]<--
	public Contacto() {}
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		setTelefono(telefono);
	}
	@Override
	public String toString() {
		return "Contacto [nombre= " + getNombre() + "| telefono= " + getTelefono() + "]";
	}
}// fin-class Contacto
