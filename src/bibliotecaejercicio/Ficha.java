package bibliotecaejercicio;

public class Ficha {
	// atributos
	private int id_ficha;
	private String titulo;
	
	// getters y setters
	public int getId_ficha() {
		return id_ficha;
	}
	public void setId_ficha(int id_ficha) {
		this.id_ficha = id_ficha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// constructores
	public Ficha(){}
	public Ficha(int identificador , String tituloFicha) {
		id_ficha = identificador;
		titulo = tituloFicha;
	}
	
}// fin-class Ficha