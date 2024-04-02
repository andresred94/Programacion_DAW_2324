package empleadoejercicio;

public class Tecnico extends Operario{

	public Tecnico() {}
	
	public Tecnico (String nombreIngresado) {
		setNombre(nombreIngresado);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}// fin-class Tecnico
