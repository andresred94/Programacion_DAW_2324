package bibliotecaejercicio;

public class Revistas extends Ficha{
	// atributos
	private int anio_Publicacion;
	
	// getters y setters 
	public int getAnio_Publicacion() {
		return anio_Publicacion;
	}

	public void setAnio_Publicacion(int anio_Publicacion) {
		this.anio_Publicacion = anio_Publicacion;
	}
	
	// constructores
	public Revistas() {}

	public Revistas(int id_Revista , String titulo, int anio_Publicacion) {
		super(id_Revista,titulo);
		this.anio_Publicacion = anio_Publicacion;
	}
	
	
	
}// fin-class Revistas
