package inventarioMascotas;

public class Perro extends Mascota{
	//-->[ ATRIBUTOS ]<--//
	private String raza;
	private boolean pulgas;
	
	//-->[ GETTERS Y SETTERS ]<--//
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	//-->[ CONSTRUCTORES ]<--//
	public Perro(String nom, int age, String state, String fnacimiento, boolean tiene_pulgas) {
		super(nom, age, state, fnacimiento);
		pulgas = tiene_pulgas;

	}

	@Override
	public void muestra() {
		if (isPulgas()) {
			System.out.println(String.format("Perro:%s Edad:%d Estado:%s F.Nac:%s Pulgas:No", getNombre(),getEdad(),getEstado(),getFechaNacimiento()));	
		} else {
			System.out.println(String.format("Perro:%s Edad:%d Estado:%s F.Nac:%s Pulgas:Si", getNombre(),getEdad(),getEstado(),getFechaNacimiento()));	;	
		}
	}

	@Override
	public void habla() {
		System.out.println("Soy un perro que habla.");
	}
}
