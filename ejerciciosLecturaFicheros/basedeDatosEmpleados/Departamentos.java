package basedeDatosEmpleados;

public class Departamentos {
	private int id_departamento;
	private String nombre_departamento;
	private String id_director;
	private String id_localizacion;
	
	public Departamentos(int id_departamento, String nombre_departamento, String id_director, String id_localizacion) {
		super();
		this.id_departamento = id_departamento;
		this.nombre_departamento = nombre_departamento;
		this.id_director = id_director;
		this.id_localizacion = id_localizacion;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}

	public String getId_director() {
		return id_director;
	}

	public void setId_director(String id_director) {
		this.id_director = id_director;
	}

	public String getId_localizacion() {
		return id_localizacion;
	}

	public void setId_localizacion(String id_localizacion) {
		this.id_localizacion = id_localizacion;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s",id_departamento,nombre_departamento,id_director,id_localizacion);
	}
	
	
	
}// fin-class Departamentos
