package empleadoejercicio;

public class Directivo extends Empleado{
	//[ ->Atributos<- ]
	private int id_directivo;
	private String usr_directivo = "DIR-";
	
	//[ ->Getters/Setters<- ]
	public void setId_directivo(int id_directivo) {
		this.id_directivo = id_directivo;
	}
	public String getUsr_Directivo() {
		return usr_directivo;
	}
	public void setUsr_Directivo(String cod_directivo) {
		this.usr_directivo = cod_directivo;
	}
	
	public int getId_directivo() {
		return id_directivo;
	}
	
	//[ ->Constructores<- ]
	public Directivo () {}
		
	public Directivo(int id,  String nombreIngresado) {
		super(id,nombreIngresado);
		id_directivo = id;
		setUserempleado(this.usr_directivo+nombreIngresado);
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s;",getNombre(),getPwd(),getUserempleado());
	}
}// fin-class Directivo
