package trabajadoresejercicio;

public class Comision extends Trabajador {
	// atributos
	private int numVentas;
	private double porcentajeComision;
	// setters y getters
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public double getPorcentajeVentas() {
		return porcentajeComision;
	}
	public void setporcentajeComision(double comision) {
		this.porcentajeComision = comision;
	}
	// constructores
	public Comision(String nombre,String apellido,int cantVentas, double comision) {
		super(nombre,apellido);
		setNumVentas(cantVentas);
		setporcentajeComision(comision);
	}
	@Override
	public String toString() {
		return "Trabajador: " + getNombre() + " " + getApellido() + " comision: "+ getPorcentajeVentas();
	}
	@Override
	public double CalcularSalario() {
		return porcentajeComision * numVentas;
	}
	
	
	
}
