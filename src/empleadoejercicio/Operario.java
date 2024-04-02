package empleadoejercicio;

public class Operario extends Empleado{
	// atributos

	// constructores 
	public Operario (String nombreIngresado) {
		super(nombreIngresado);
	}
	
	public Operario() {}

	@Override
	public String toString() {
		return super.toString()+ " -> Operario";
	}	
}
