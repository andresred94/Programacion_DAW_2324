package mundoAnimal;

public abstract class Animal {
	// -->[ ATRIBUTOS ]<--
	private String nombre;
	private String raza;
	private double peso;
	private String color;	
	
	// -->[ GETTERS Y SETTERS ]<--
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	// -->[ METODOS DE LA CLASE ]<--
	public void vacunar() {}
	
	public abstract void comer();
	
	public abstract void dormir();
	
	public abstract void hacerRuido();
	
	public boolean hacerCaso() {return true;}	
	
}// fin-class Mascota
