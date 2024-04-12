package inventarioMascotas;

public class Gato extends Mascota{
	//-->[ ATRIBUTOS ]<--//
	private String color;
	private boolean pelolargo;
	
	//-->[ GETTERS Y SETTERS ]<--//
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPelolargo() {
		return pelolargo;
	}

	public void setPelolargo(boolean pelolargo) {
		this.pelolargo = pelolargo;
	}
	
	//-->[ CONSTRUCTORES ]<--//
	public Gato(String nom, int age, String state, String fnacimiento,String colorGato, boolean tienePelolargo) {
		super(nom, age, state, fnacimiento);
		color = colorGato;
		pelolargo = tienePelolargo;
	}

	@Override
	public void muestra() {
		if (pelolargo) {
			System.out.println(String.format("Gato:%s Edad:%d Estado:%s F.Nac:%s Color:%s PeloLargo:Si", getNombre(),getEdad(),getEstado(),getFechaNacimiento(),getColor()));			
		} else {
			System.out.println(String.format("Gato:%s Edad:%d Estado:%s F.Nac:%s Color:%s PeloLargo:No", getNombre(),getEdad(),getEstado(),getFechaNacimiento(),getColor()));
		}
		
	}

	@Override
	public void habla() {
		System.out.println("Meeeeeaaawwwww");
	}

}
