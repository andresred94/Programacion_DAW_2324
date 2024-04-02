package trabajadoresejercicio;

public class Fijos extends Trabajador{
	private double sueldo;
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Fijos (String nombre, String apellido){
		super(nombre,apellido);
	}

	@Override
	public String toString() {
		return "Trabajador fijo: " + getNombre() + " " + getApellido();
	}

	@Override
	public double CalcularSalario() {
		return getSueldo();
	}
}// fin-class Fijos
