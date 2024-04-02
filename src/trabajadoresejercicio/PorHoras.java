package trabajadoresejercicio;

public class PorHoras extends Trabajador {
	// atributos
	private int horas;
	private double sueldoHoras;
	
	// setter y getters
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public double getSueldoHoras() {
		return sueldoHoras;
	}

	public void setSueldoHoras(double sueldoHoras) {
		this.sueldoHoras = sueldoHoras;
	}

	// métodos constructores
	public PorHoras (String nombre, String apellido, int horas){
		super(nombre,apellido);
		setHoras(horas);
		sueldoHoras = CalcularSalario();
	}

	@Override
	public String toString() {
		return "Trabajador por horas: "+ getNombre() + " "+ getApellido()+" sueldo/horas: "+ sueldoHoras;
	}

	@Override
	public double CalcularSalario() {
		return sueldoHoras * horas;
	}

	
	
}// fin-class PorHoras
