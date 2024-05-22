package empleadoejercicio;

public class Operario extends Empleado{
	//[ ->Atributos<- ]
	private int id_operario;
	private String cod_operario = "OPE-00";
	
	//[ ->Getters/Setters<- ]
	public int getId_operario() {
		return id_operario;
	}

	public void setId_operario(int id_operario) {
		this.id_operario = id_operario;
	}

	public String getCod_operario() {
		return cod_operario;
	}

	public void setCod_operario(String cod_operario) {
		this.cod_operario = cod_operario;
	}
	
	
	//[ ->Constructores<- ] 
	public Operario (int id,String nombreIngresado) {
		super(id,nombreIngresado);
		id_operario = id;
		setUserempleado(this.cod_operario+id);
	}
	
	public Operario() {}

	@Override
	public String toString() {
		return String.format("%s,%s,%s;",getNombre(),getPwd(),getUserempleado());
	}	
}// fin-class Operario
