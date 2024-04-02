package ejercicioBombilla;

public class Main {
	public static void main(String[] args) {
		Bombilla b1 = new Bombilla ();
		b1.encender();
		System.out.println(b1.toString());
		Bombilla b2 = new Bombilla(true);
		b2.apagar();
		b2.encender();
		b2.apagar();
		b2.encender();
		System.out.println(b2.toString());
		Bombilla b3 = new Bombilla();
		System.out.println(b3.toString());
		System.out.println("Se han creado " + Bombilla.getContBombilla() + " bombillas." );
	}
}
