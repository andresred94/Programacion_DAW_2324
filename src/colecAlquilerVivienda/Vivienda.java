package colecAlquilerVivienda;

public class Vivienda {
	//--[ Atributos ]--//
	private String codVivienda;
	private TP_VIVIENDA categoria;
	private String direccion;
	private double precio;
	enum TP_VIVIENDA {UNAHAB,DOSHAB,TRESHAB,CUATROHAB}
	
	//--[ Getters/Setters ]--//
	public String getCodVivienda() {
		return codVivienda;
	}
	public void setCodVivienda(String codVivienda) {
		this.codVivienda = codVivienda;
	}
	public TP_VIVIENDA getCategoria() {
		return categoria;
	}
	public void setCategoria(TP_VIVIENDA categoria) {
		this.categoria = categoria;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//--[ Constructores ]--//
	public Vivienda(){}
	public Vivienda(String codVivienda, TP_VIVIENDA categoria, String direccion, double precio) {
		this.codVivienda = codVivienda;
		this.categoria = categoria;
		this.direccion = direccion;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return String.format("cod_vivienda: %s categoria: %s direccion: %s precio: %.2f",codVivienda,categoria,direccion,precio);
	}

}// fin-class Vivienda