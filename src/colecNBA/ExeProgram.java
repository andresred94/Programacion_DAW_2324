package colecNBA;

public class ExeProgram {
	public static void main(String[] args) {
		Temporada t1 = new Temporada();
		Jugador j1 = new Jugador("James",34,"Los Angeles Clippers",72,"Arizona"); 
		Jugador j2 = new Jugador("Andre",30,"Chicago Bulls",79,"Arizona"); 
		Jugador j3 = new Jugador("LeBron James",39,"Los Angeles Lakers",71,"NewYork");
		
		//Introducir datos
		t1.aniadirJugador(j1);
		t1.aniadirJugador(j2);
		t1.aniadirJugador(j3);
		
		System.out.println("Mostrando todo el contenido:");
		t1.mostrarContenido();

		
		String nombre = "James";
		System.out.printf("-->Mostrando el jugador con el nombre %s<--%n",nombre);
		t1.consultaJugadorNombre(nombre);
		
		String ciudad = "Chicago";
		System.out.printf("-->Buscando jugador que sea de la ciudad %s<--%n",ciudad);
		t1.consultaJugadorCiudad(ciudad);
		
		int canastas = 10;
		System.out.printf("-->Modificar canastas al jugador %s<--%n",nombre);
		t1.modificarCanastas(nombre,canastas);
		t1.mostrarContenido();
		
		System.out.println("Ordenar por Ciudad/Nombre:");
		t1.ordenCiudadNombre();
		
		System.out.println("Ordenar por equipo:");
		t1.ordenarPorEquipo();
		
//		int minCanastas = 10;
//		int maxMacastas = 20;
//		System.out.printf("-->Borrar jugador con un rango de %d - %d canastas <--%n",minCanastas,maxMacastas);
//		t1.borrarJugadorRangoCanastas(minCanastas,maxMacastas);
//		t1.mostrarContenido();
//		// Borrar contenido
//		t1.borrarColeccion();
	
		
	}
}//fin-class ExeProgram
