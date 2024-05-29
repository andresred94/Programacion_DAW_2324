package examen3eva;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		TreeMap <Integer , Persona> datosPersona = new TreeMap<Integer , Persona>();
		
		Paciente p1 = new Paciente("12312312Q", "Alex", "Cremento", 1984, 60);
		Paciente p2 = new Paciente("11122233R", "Dolores", "Delano", 1984, 20);

		Dentista d1 = new Dentista("52053342H", "DentistaA", "AAaaaa", 1993, 001, 445789);
		Dentista d2 = new Dentista("11112222R", "DentistaB", "AAaaa", 1994, 002, 445789);

		Auxiliar a1 = new Auxiliar("11122233Q", "AuxiliarAAAB", "Abbc", 1992,003, 'E');
		Auxiliar a2 = new Auxiliar("11122233Q", "AuxiliarAAB", "Abbac", 1952,004, 'H');
		
		// put (<key , value) - para ingresar un valor en un TreeMap tiene que tiener una clave primaria
		datosPersona.put(1, p1);
		datosPersona.put(2, p2);
		datosPersona.put(3, d1);
		datosPersona.put(4, d2);
		datosPersona.put(5, a1);
		datosPersona.put(6, a2);
		
		// entrySet() - obtienes una vista de los valores del objeto [ como una sentencia SELECT ]
		for (Map.Entry<Integer, Persona> entry : datosPersona.entrySet()) {
			if (entry.getValue() instanceof Paciente) {
				System.err.println("Por privacidad no se muestran los datos de los pacientes.");
			} else {
				entry.getValue().mostrarDatos();
			}
		}
		
	}// fin main
}// fin class - Ejercicio1
