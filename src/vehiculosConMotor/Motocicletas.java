package vehiculosConMotor;

public class Motocicletas extends Vehiculo {
	// -->[ ATRIBUTOS ]<--
	private int cilindrada;
	private boolean necesarioCarnet;

	// -->[ SETTERS Y GETTERS ]<--
	public boolean isNecesarioCarnet() {
		return necesarioCarnet;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	// <-- [ METODOS DE LA CLASE ]-->
	public boolean necesitaCarnet() {
		if (getCilindrada() < 125) {
			return false;
		}
		return true;
	}
}// fin-class Motocicletas
