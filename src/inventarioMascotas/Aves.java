package inventarioMascotas;

public abstract class Aves extends Mascota{
	//-->[ ATRIBUTOS ]<--//
	private TP_PICO tipoPico;
	private boolean vuela;
	enum TP_PICO{CURVO,GANCHUDO,LANZA,LARGO,FINO,GRUESO,CORTO}
	
	//-->[ GETTERS Y SETTERS ]<--//
	public TP_PICO getTipoPico() {
		return tipoPico;
	}
	
	public void setTipoPico(TP_PICO tipoPico) {
		this.tipoPico = tipoPico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	//-->[ CONSTRUCTORES ]<--//
	public Aves(String nom, int age, String state, String fnacimiento, TP_PICO tipoDico, boolean esVolador) {
		super(nom, age, state, fnacimiento);
		tipoPico = tipoDico;
		vuela = esVolador;		
	}
	
	//-->[ MÉTODOS DE LA CLASE]<--//
	public abstract void volar();
}
