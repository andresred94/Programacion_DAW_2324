package empleadoejercicio;

public class Operario extends Empleado{
	// atributos
	
	// constructores 
	public Operario (String nombreIngresado) {
		setNombre(nombreIngresado);
	}
	
	public Operario() {}

	

	@Override
	public String toString() {
		return "Empleado " + getNombre() + " -> Operario";
	}
	
	
	
}
