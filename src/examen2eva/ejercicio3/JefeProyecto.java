package examen2eva.ejercicio3;
enum Tareas {REUNION,GESTION,DOCUMENTACION}

public class JefeProyecto extends Consultores {
	private Tareas tareaJefe;
	
	public JefeProyecto(String dni, String nombre, String apellido, int numProyetos, double salario, Tareas tareaJefe) {
		super(dni, nombre, apellido, numProyetos,salario);
		this.tareaJefe = tareaJefe;
	}

	public Tareas getTareaJefe() {
		return tareaJefe;
	}
	

	@Override
	public String toString() {
		return "JefeProyecto " + "[ DNI= " + getDni() + "| Nombre= " + getNombre()
				+ "| Apellido= " + getApellido() + "| Numero proyectos= " + getNumProyetos() + "| Salario= "
				+ getSalario() + " [tareaJefe=" + getTareaJefe() + "]";
	}
	
	
	
}// fin-class JefeProyecto

