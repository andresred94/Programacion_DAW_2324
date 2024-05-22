package empleadoejercicio;

public class Tecnico extends Operario{
	//[ ->Atributos<- ]
	private int id_tecnico;
	private String cod_tecnico = "TEK-00";
	
	//[ ->Getters/Setters<- ]
	public int getId_tecnico() {
		return id_tecnico;
	}

	public void setId_tecnico(int id_tecnico) {
		this.id_tecnico = id_tecnico;
	}

	public String getCod_tecnico() {
		return cod_tecnico;
	}

	public void setCod_tecnico(String cod_tecnico) {
		this.cod_tecnico = cod_tecnico;
	}
	//[ ->Constructores<- ]
	public Tecnico() {}

	public Tecnico (int id ,String nombreIngresado) {
		super(id,nombreIngresado);
		id_tecnico = id;
		setUserempleado(this.cod_tecnico+id);
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s;",getNombre(),getPwd(),getUserempleado());
	}
}// fin-class Tecnico
