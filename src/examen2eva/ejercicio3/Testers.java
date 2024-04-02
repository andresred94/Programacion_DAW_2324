package examen2eva.ejercicio3;

public class Testers extends Consultores{
	// atributos
	private Programadores prograApoyo;
	
	//getters y setters
	public Programadores getPrograApoyo() {
		return prograApoyo;
	}
	
	public Testers(String dni, String nombre, String apellido, int numProyetos,double salario, Programadores programadorApoyo) {
		super(dni, nombre, apellido, numProyetos,salario);
		this.prograApoyo = programadorApoyo;

	}

	@Override
	public String toString() {
		return "Tester" + " [ DNI= " + getDni() + "| Nombre= " + getNombre()
				+ "| Apellidos= " + getApellido() + "| Numeros Proyectos= " + getNumProyetos() + "| Salario= "
				+ getSalario()+ "] [prograApoyo= " + prograApoyo +  "";
	}

	
	
	

	
}// fin-class Testers
