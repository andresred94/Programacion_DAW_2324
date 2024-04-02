package empleadoejercicio;

public class Directivo extends Empleado{
	
	public Directivo () {}
	public Directivo(String nombreIngresado) {
		super(nombreIngresado);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}// fin-class Directivo
