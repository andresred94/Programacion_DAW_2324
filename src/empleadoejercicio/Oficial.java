package empleadoejercicio;

public class Oficial extends Operario{
	public Oficial() {}
	
	public Oficial(String nombreIngresado){
		setNombre(nombreIngresado);
	}

	@Override
	public String toString() {
		return "Empleado " + getNombre() + " -> Operario -> Oficial";
	}
	
}
