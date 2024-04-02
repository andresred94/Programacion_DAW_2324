package examen2eva.ejercicio3;

public class Programadores extends Consultores{
	
	
	public Programadores(String dni, String nombre, String apellido, int numProyetos, double salario) {
		super(dni, nombre, apellido, numProyetos,salario);
	}

	@Override
	public String toString() {
		return "Programador [DNI= " + getDni() + "| Nombre= " + getNombre() + "| Apellido= "
				+ getApellido() + "| Numpero de Proyectos=" + getNumProyetos() + "| Salario= " + getSalario()+ "]";
	}
	
	
		
}// fin-class Programadores
