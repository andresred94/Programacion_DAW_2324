package mundoAnimal;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList <Animales> misMascotas = new ArrayList();
		Gato g1 = new  Gato();
		g1.setNombre("Misifú");
		g1.setRaza("Persa");
		g1.setColor("Negro");
		Gato g2 = new Gato();
		g2.setNombre("Garfield");
		g2.setRaza("Persa");
		g2.setColor("Gris");
		Perro p1 = new Perro();
		p1.setNombre("Snoopy");
		p1.setRaza("Golden");
		p1.setColor("Blanco");
		misMascotas.add(p1);
		misMascotas.add(g1);
		misMascotas.add(g2);
		
		for (int i = 0; i < misMascotas.size(); i++) {
			System.out.println(misMascotas.get(i));
		}
		
		
		for (int i = 0; i < misMascotas.size(); i++) {
			if (misMascotas.get(i) instanceof Gato) {
				System.out.println(misMascotas.get(i));				
			}
		}		
	}
}
