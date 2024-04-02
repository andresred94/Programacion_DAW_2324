package vehiculosConMotor;

import java.time.LocalDate;
import java.util.Objects;
enum ModalidadSeguro {TERCEROS,TODO_RIESO}
public class Vehiculo {
	// -->[ ATRIBUTOS ]<--
    private String modelo;
    private String marca;
    private String color;
    private boolean esMetalizado;
    private String matricula;
    private LocalDate anioFabricacion;
    private ModalidadSeguro tipoSeguro;

    // -->[ SETTERS Y GETTERS ]<--
    public ModalidadSeguro getTipoSeguro() {
		return tipoSeguro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTipoSeguro(ModalidadSeguro tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
    public String getModelo () {
        return modelo;
    }
    public void setModelo ( String modelo ) {
        this.modelo = modelo;
    }
    public String getColor () {
        return color;
    }
    public void setColor ( String color ) {
        this.color = color;
    }
    public boolean getEsMetalizado () {
        return esMetalizado;
    }
    public void setEsMetalizado ( boolean esMetalizado ) {
        this.esMetalizado = esMetalizado;
    }
    public String getMatricula () {
        return matricula;
    }
    public void setMatricula ( String matricula ) {
        this.matricula = matricula;
    }
    public LocalDate getAnioFabricacion () {
        return anioFabricacion;
    }
    public void setAnioFabricacion ( LocalDate anioFabricacion ) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo coche = (Vehiculo) o;
        return esMetalizado == coche.esMetalizado && Objects.equals(modelo, coche.modelo) && Objects.equals(color, coche.color) && Objects.equals(matricula, coche.matricula) && Objects.equals(anioFabricacion, coche.anioFabricacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, color, esMetalizado, matricula, anioFabricacion);
    }

    @Override
	public String toString() {
		return "Vehiculo [mod =" + modelo + ", col =" + color + ", esMetalizado=" + esMetalizado + ", matricula="
				+ matricula + ", anioFabricacion=" + anioFabricacion + ", tipoSeguro=" + tipoSeguro + "]";
	}    
    
	// -->[ CONSTRUCTORES ]<--
    public Vehiculo () {}
	public Vehiculo(String marca, String modelo, String color, boolean esMetalizado, String matricula, LocalDate anioFabricacion, ModalidadSeguro tipoSeguro) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.esMetalizado = esMetalizado;
		this.matricula = matricula;
		this.anioFabricacion = anioFabricacion;
		this.tipoSeguro = tipoSeguro;
	}
	
	// <-- [ METODOS DE LA CLASE ]-->

}// fin-class Vehiculo
