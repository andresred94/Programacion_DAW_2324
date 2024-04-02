package vehiculosConMotor;

public class Camiones extends Vehiculo{
	// -->[ ATRIBUTOS ]<--
	private double pesoMaxAutorzd;
	private boolean mercanciaPeligrosa;
	
	// -->[ SETTERS Y GETTERS ]<--
	public double getPesoMaxAutorzd() {
		return pesoMaxAutorzd;
	}
	public void setPesoMaxAutorzd(double pesoMaxAutorzd) {
		this.pesoMaxAutorzd = pesoMaxAutorzd;
	}
	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}
	
	// <-- [ METODOS DE LA CLASE ]-->
	public void esMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

}// fin-class Camiones
