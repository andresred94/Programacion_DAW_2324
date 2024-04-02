package vehiculosConMotor;

import java.time.LocalDate;

enum TipoDeUso{PROFESIONAL,PARTICULAR}

public class Turismos extends Vehiculo{
	// -->[ ATRIBUTOS ]<--
	private int numPlazas;
	private TipoDeUso titular;
		
	// -->[ SETTERS Y GETTERS ]<--
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	public TipoDeUso getTitular() {
		return titular;
	}
	
	// -->[ CONSTRUCTORES ]<--
	public Turismos(String marca,String modelo, String color, boolean esMetalizado, String matricula, LocalDate anio, ModalidadSeguro tipoSeguro,  int numPlazas, TipoDeUso titular) {
		super(marca,modelo,color,esMetalizado,matricula,anio,tipoSeguro);
		this.numPlazas = numPlazas;
		this.titular = titular;
	}
	public Turismos() {}
	
	// <-- [ METODOS DE LA CLASE ]-->
	public void tipodeUso(TipoDeUso titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Turismo [marca= "+ getMarca() +
				" | modelo= "+ getModelo() +
				" | color= " + getColor() + 
				" | esMetalizado= "+ (getEsMetalizado() ? "Si" : "No") + 
				" | matricula= "+ getMatricula() + "]" ;
	}
	
}// fin-class Turismos
