package inventarioMascotas;

public abstract class Mascota extends Inventario{
	//-->[ ATRIBUTOS ]<--//
	private String nombre;
	private int edad;
	private String estado;
	private String fechaNacimiento;
		
	//-->[ SETTERS Y GETTERS ]<--//
	
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//-->[ CONSTRUCTORES ]<--//
	public Mascota (String nom, int age, String state, String fnacimiento) {
		nombre = nom;
		edad = age;
		estado = state;
		fechaNacimiento = fnacimiento;
	}
	
	//-->[ MÉTODOS SIN IMPLEMENTAR ]<--//
	public abstract void muestra();
	public abstract void habla();
	public void cumpleanios(){}
	public void morir(){}
		
	
}
