package basedeDatosConciertos;

public class Compositor {
	private int id_com;
	private String nomb_com;
	private String nomb_ape;
	private String nacionalidad;
	
	public int getId_com() {
		return id_com;
	}
	public String getNomb_com() {
		return nomb_com;
	}
	public String getNomb_ape() {
		return nomb_ape;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
			
	public Compositor(int id_com, String nomb_com, String nomb_ape, String nacionalidad) {
		super();
		this.id_com = id_com;
		this.nomb_com = nomb_com;
		this.nomb_ape = nomb_ape;
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return String.format("%d,%s,%s%s",getId_com(),getNomb_com(),getNomb_ape(),getNacionalidad());
	}
	
	
	
}// fin-class Compositor
