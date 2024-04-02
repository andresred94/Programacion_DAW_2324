package examen2eva.ejercicio3;

public class Consultores {
	// atributos
	private String dni;
	private String nombre;
	private String apellido;
	private int numProyetos;
	private double salario;
	
	// getters y setters
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumProyetos() {
		return numProyetos;
	}
	public void setNumProyetos(int numProyetos) {
		this.numProyetos = numProyetos;
		if (numProyetos >=2 ) {
			setSalario(this.salario + 250);
		} else if (numProyetos >= 3) {
			setSalario(this.salario + 300);
		} else if (numProyetos >= 4 ) {
			setSalario(this.salario + 500);
		}
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// constructores
	public Consultores(String dni, String nombre, String apellido, int numProyetos, double salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		setNumProyetos(numProyetos);
	}
	
	
	@Override
	public String toString() {
		return "Consultor [DNI= " + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", numProyetos="
				+ numProyetos + ", salario=" + salario + "]";
	}
	
	
	
	
}// fin-class Consultores
