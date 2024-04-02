package atributosDeclase;

public class Bombilla {
	// -->[ ATRIBUTOS ]<--
	public static int contbombilla = 0;
	public static int contEncendida = 0;
	private int vecesEncendida = 0;
	private boolean encendida;
	
	// -->[ GETTERSY SETTERS ]<-- 
	public int getContEncendida() {
		return contEncendida;
	}

	public int getContbombilla() {
		return contbombilla;
	}

	public void setContbombilla(int contbombilla) {
		Bombilla.contbombilla = contbombilla;
	}

	public int getVecesEncendida() {
		return vecesEncendida;
	}

	public void setVecesEncendida(int vecesEncendida) {
		this.vecesEncendida = vecesEncendida;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public static void setContEncendida(int contEncendida) {
		Bombilla.contEncendida = contEncendida;
	}
	
	// -->[ CONSTRUCTORES ]<--
	public Bombilla (boolean estado) {
		this.encendida = estado;
		if (this.encendida) {
			this.vecesEncendida = 1;
		}else this.vecesEncendida = 0;
		
		contbombilla ++;
		if (this.encendida) {
			Bombilla.contbombilla +=1;
		}
	}
	
	public Bombilla() {
		encendida = true;
	}

	
		
}// fin-class Bombillla
