package ejercicioBombilla;

public class Bombilla {
	// -->[ ATRIBUTOS ]<--
	private boolean estado;
	private int vecesEncendida = 0;
	private static int contBombilla = 0;
	
	// -->[ SETTERS Y GETTERS ]<--
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getVecesEncendida() {
		return vecesEncendida;
	}

	public static int getContBombilla() {
		return contBombilla;
	}

	public static void setContBombilla(int contBombilla) {
		Bombilla.contBombilla = contBombilla;
	}
	
	// -->[ CONSTRUCTORES ]<--
	public Bombilla() {
		estado = false;
		contBombilla++;
	}
	
	public Bombilla (boolean estado) {
		contBombilla++;
		if (estado) {
			System.out.println("La bombilla ya estaba encendida.");
			this.estado = estado;
			vecesEncendida++;
		} else {
			this.estado = false;
		}
	}
	
	// -->[ OVERRIDE ]<--
	@Override
	public String toString() {
		String msg;
		if (estado) {
			msg = "Bombilla encendida "+ contBombilla +". Se ha encendido " + vecesEncendida + " vez/veces";
		} else {
			msg = "Bombilla apagada "+ contBombilla +". Se ha encendido " + vecesEncendida + " vez/veces";
		}
		return msg;
	}
	
	// <-- [ METODOS DE LA CLASE ]-->
	public void encender () {
		estado = true;
		vecesEncendida++;
	}// fin encender
	
	public void apagar () {
		estado = false;
	}// fin apagar
	
}// fin-class Bombilla
