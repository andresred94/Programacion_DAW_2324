package basedeDatosEmpleados;

public class Empleados {
	private int id_empleado;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String fecha_contratacion;
	private String id_trabajo;
	private double salario;
	private double comision;
	private String id_director;
	private String id_departamento;
	
	
	public Empleados() {
		super();
	}
		
	public Empleados(int id_empleado, String nombre, String apellido, String email, String telefono,
			String fecha_contratacion, String id_trabajo, double salario, double comision, String id_director,
			String id_departamento) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fecha_contratacion = fecha_contratacion;
		this.id_trabajo = id_trabajo;
		this.salario = salario;
		this.comision = comision;
		this.id_director = id_director;
		this.id_departamento = id_departamento;
	}



	public int getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFecha_contratacion() {
		return fecha_contratacion;
	}
	public void setFecha_contratacion(String fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}
	public String getId_trabajo() {
		return id_trabajo;
	}
	public void setId_trabajo(String id_trabajo) {
		this.id_trabajo = id_trabajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public String getId_director() {
		return id_director;
	}
	public void setId_director(String id_director) {
		this.id_director = id_director;
	}
	public String getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(String id_departamento) {
		this.id_departamento = id_departamento;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%s,%s,%.2f,%.2f,%s,%s",getId_empleado(),getNombre(),getApellido(),getEmail(),getTelefono(),getFecha_contratacion(),getId_trabajo(),getSalario(),getComision(),getId_director(),getId_departamento());
	}
	
}// fin-class Empleados
