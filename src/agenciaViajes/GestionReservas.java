package agenciaViajes;

public class GestionReservas {
    public static void main(String[] args) {  	
    	Vuelos v1= new Vuelos(1004, "Madrid", "Paris",5);
    	
    	v1.añadirPasajero(new Pasajeros("Andres", "Bravo", 29, "12312312T", genero.MASCULINO, 1004));
    	v1.añadirPasajero(new Pasajeros("Elber", "Galarga", 2, "12312312T", genero.MASCULINO, 1004));
    	v1.añadirPasajero(new Pasajeros("Tolna", "Botieso", 91, "12312312T", genero.MASCULINO, 1004));
    	v1.añadirPasajero(new Pasajeros("Dolores", "Delano", 17, "12312312T", genero.FEMENINO, 1004));
    	v1.añadirPasajero(new Pasajeros("Armando", "Paredes", 59, "12312312T", genero.OTRO, 1004));
    	
    	v1.mostrarListaPasajeros(1004);
    	v1.mostrarListaMenores(1004);
    	System.out.println(v1.toString());
    	//System.out.println(v2.toString());
    	
    }
}// fin-class GestionReservas
