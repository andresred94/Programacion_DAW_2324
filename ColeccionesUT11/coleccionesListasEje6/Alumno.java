package coleccionesListasEje6;

public class Alumno {
	//--> Atributos <--//
	private String nombre;
	private String apellido;
	private String f_nacimiento;
	private String e_mail;
	private String cursoEscolar;
	
	//--> Constructores <--//
	public Alumno(String nombre, String apellido, String f_nacimiento, String e_mail, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.f_nacimiento = f_nacimiento;
		this.e_mail = e_mail;
		cursoEscolar = curso;
	}	
	
	//--> GettersSetters <--//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCursoEscolar() {
		return cursoEscolar;
	}
	public void setCursoEscolar(String cursoEscolar) {
		this.cursoEscolar = cursoEscolar;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getF_nacimiento() {
		return f_nacimiento;
	}
	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellido=" + apellido + ", f_nacimiento=" + f_nacimiento + ", e_mail="
				+ e_mail + ", cursoEscolar=" + cursoEscolar + "]";
	}
	
	
}