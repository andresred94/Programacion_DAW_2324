package empleadoejercicio;

public class Directivo extends Empleado{
	// atributos
	
	// constructores
	public Directivo () {}
	public Directivo(String nombreIngresado) {
		setNombre(nombreIngresado);
	}

	@Override
	public String toString() {
		return "Empleado " + getNombre() + " -> Directivo";
	}

	

	
	
	
	
}// fin-class Directivo
