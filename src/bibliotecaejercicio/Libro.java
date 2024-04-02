package bibliotecaejercicio;

public class Libro extends Ficha {
	// atributos
	private String autor;
	private String editorial;
	
	// setters y getters
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	// constructores
	public Libro (){}
	public Libro (int id_libro, String titulo, String autorLibro, String editorialLibro){
		super(id_libro,titulo);
		autor = autorLibro;
		editorial = editorialLibro;				
	}
	
}// fin-class Libro
