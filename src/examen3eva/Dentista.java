package examen3eva;

public class Dentista extends Trabajador{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3782269773897808975L;
	private int num_colegiado;

	public int getNum_colegiado() {
		return num_colegiado;
	}

	public void setNum_colegiado(int num_colegiado) {
		this.num_colegiado = num_colegiado;
	}

	public Dentista(String dni,String nom,String ape, int f_naci, int num_exp, int num_colegiado) {
		super(dni,nom,ape,f_naci,num_exp);
		this.num_colegiado = num_colegiado;
	}

	public Dentista() {
		super();
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(String.format("%s,%s,%s,%s.%d,%d",getDni(),getNombre(),getApellidos(),getAnio_nacimiento(),getExpendiente(),getNum_colegiado()));
	}
	
	
}
