package empleadoejercicio;

public class Empleado {
	//[ ->Atributos<- ]
	private int id_empleado;
	private String user_empleado = null;
	private String pwd = "@";
	private String nombre = null;

	//[ ->Getters/Setters<- ]
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserempleado() {
		return user_empleado;
	}

	public void setUserempleado(String cod_empleado) {
		this.user_empleado = cod_empleado;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	//[ ->Constructores<- ]
	public Empleado () {}
	
	public Empleado (int id ,String nombreIngresado) {
		id_empleado = id;
		nombre = nombreIngresado;
		setPwd(this.pwd+nombreIngresado.toLowerCase());
	}
	
}// fin-class Empleado
