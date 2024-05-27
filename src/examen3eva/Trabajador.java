package examen3eva;

public class Trabajador extends Persona  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4615537749049335306L;
	private int expendiente;

	public int getExpendiente() {
		return expendiente;
	}

	public void setExpendiente(int expendiente) {
		this.expendiente = expendiente;
	}

	
	
	public Trabajador(String dni, String nom, String ape, int f_naci) {
		super(dni,nom,ape,f_naci);
	}

	public Trabajador(String dni, String nom, String ape, int f_naci, int expendiente) {
		super(dni,nom,ape,f_naci);
		this.expendiente = expendiente;
	}

	public Trabajador() {
		super();
	}
	
}
