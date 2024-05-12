package inventarioMascotas;

public class Loro extends Aves{

	public Loro(String nom, int age, String state, String fnacimiento, TP_PICO tpico, boolean esvolador) {
		super(nom, age, state, fnacimiento,tpico,esvolador);
	}

	@Override
	public void volar() {
		System.out.println("Soy un loro que y estoy volando.");			
	}

	@Override
	public void muestra() {
		if (isVuela()) {
			System.out.println(String.format("Loro:%s Edad:%d Estado:%s F.Nac:%s tipoPico:%s volador:Si", getNombre(),getEdad(),getEstado(),getFechaNacimiento(),getTipoPico()));
		} else {
			System.out.println(String.format("Loro:%s Edad:%d Estado:%s F.Nac:%s tipoPico:%s volador:No", getNombre(),getEdad(),getEstado(),getFechaNacimiento(),getTipoPico()));
		}
	}

	@Override
	public void habla() {
		System.out.println("Perrrro ijuefruta.");
	}

}
