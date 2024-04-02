package bibliotecaejercicio;

public class Dvd extends Ficha {
	// atributos 
	private String director;
	private int anio;
	private String genero;
	
	// getters y setters 
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// constructores
	public Dvd() {}
	
	public Dvd(int id_Dvd, String titulo, String  director, int anio, String genero  ) {
		super(id_Dvd,titulo);
		this.director = director;
		this.anio = anio;
		this.genero = genero;
	}
	
	
}
