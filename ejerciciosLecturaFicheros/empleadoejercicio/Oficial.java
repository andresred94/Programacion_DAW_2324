package empleadoejercicio;

public class Oficial extends Operario{
	//[ ->Atributos<- ]
	private int id_oficial;
	private String cod_oficial = "OFI-00";
	
	//[ ->Getters/Setters<- ]
	public int getId_oficial() {
		return id_oficial;
	}

	public void setId_oficial(int id_oficial) {
		this.id_oficial = id_oficial;
	}

	public String getCod_oficial() {
		return cod_oficial;
	}

	public void setCod_oficial(String cod_oficial) {
		this.cod_oficial = cod_oficial;
	}
	
	//[ ->Constructores<- ]
	public Oficial() {}
	
	public Oficial(int id,String nombreIngresado){
		super(id,nombreIngresado);
		id_oficial = id;
		setUserempleado(this.cod_oficial+id);
	}
		
	@Override
	public String toString() {
		return String.format("%s,%s,%s;",getNombre(),getPwd(),getUserempleado());
	}
}// fin-class Oficial
