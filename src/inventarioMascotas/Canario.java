package inventarioMascotas;

public class Canario extends Aves{

	public Canario(String nom, int age, String state, String fnacimiento, TP_PICO tpico, boolean esvolador) {
		super(nom, age, state, fnacimiento,tpico,esvolador);
	}

	@Override
	public void volar() {
		System.out.println("Soy un canario y estoy volando");		
	}

	@Override
	public void muestra() {
		if (isVuela()) {
			System.out.println(String.format("Canario:%s Edad:%d Estado:%s F.Nac:%s tipoPico:%s vuela:Si", getNombre(),getEdad(),getEstado(),getFechaNacimiento(),getTipoPico()));	
		} else {
			System.out.println(String.format("Canario:%s Edad:%d Estado:%s F.Nac:%s tipoPico:%s vuela:No", getNombre(),getEdad(),getEstado(),getFechaNacimiento(),getTipoPico()));		
		}
	}

	@Override
	public void habla() {
		System.out.println("Soy un canario que no habla.");
	}

}
