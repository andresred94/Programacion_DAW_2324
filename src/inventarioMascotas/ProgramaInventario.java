package inventarioMascotas;

import inventarioMascotas.Aves.*;

public class ProgramaInventario {
	public static void main(String[] args) {
		Inventario i1 = new Inventario();
		Perro p1 = new Perro("Scobby",14,"sano","12/03/2010",true);
		Perro p2 = new Perro("Clifford",12,"sano","2/06/2012",false);
		Gato g1 = new Gato("Garfield",6,"sano","06/06/06","negro",false);
		Gato g2 = new Gato("Wallace",6,"sano","07/07/07","blanco",true);
		Gato g3 = new Gato("Wallace",6,"sano","07/07/07","blanco",true);

		Loro l1 = new Loro("Soyunloro",5,"sano","08/08/18",TP_PICO.LARGO,true);
		Canario c1 = new Canario("Soyuncanario",3,"sano","08/07/21",TP_PICO.GANCHUDO,false);
		
		i1.insertarAnimal(p1);
		i1.insertarAnimal(p2);
		i1.insertarAnimal(g1);
		i1.insertarAnimal(g2);
		i1.insertarAnimal(g3);
		i1.insertarAnimal(l1);
		i1.insertarAnimal(c1);
		String nombMascotaEliminar = "Wallace";
		System.out.printf("Eliminando a %s.%n" , nombMascotaEliminar);
		i1.eliminarAnimal(nombMascotaEliminar);
		System.out.println();
		System.out.println("Mostrando tipo de mascota y nombre:");
		i1.mostrarListaAnimales();
		System.out.println();
		System.out.println("Mostrando todos los animales y sus atributos:");
		i1.mostrarTodosAnimales();
		System.out.println();
		String nomMascota = "Garfield";
		System.out.printf("Mostrando la mascota %s%n", nomMascota );
		i1.mostrarUnAnimal(nomMascota);
		
		System.out.println("Vaciando inventario...");
		i1.vaciarInventario();
		i1.mostrarTodosAnimales();
		

	}
}
