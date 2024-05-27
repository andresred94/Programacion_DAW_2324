package examen3eva;

public class Auxiliar extends Trabajador {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9078425140080031640L;
	private char id_expecialidad;

	public char getId_expecialidad() {
		return id_expecialidad;
	}

	public void setId_expecialidad(char id_expecialidad) {
		this.id_expecialidad = id_expecialidad;
	}

	public Auxiliar(String dni,String nom, String ape, int f_naci,int n_exp, char id_expecialidad) {
		super(dni,nom,ape,f_naci,n_exp);
		this.id_expecialidad = id_expecialidad;
	}

	public void mostrarDatos() {
		System.out.println(String.format("%s,%s,%s,%s,%d,%c",getDni(),getNombre(),getApellidos(),getAnio_nacimiento(),getExpendiente(),getId_expecialidad()));
	}
	
	public Auxiliar() {	}
	
	
	
}
