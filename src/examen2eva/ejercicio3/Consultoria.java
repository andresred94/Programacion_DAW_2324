package examen2eva.ejercicio3;

import java.util.ArrayList;

public class Consultoria {
	// atributos
	private static ArrayList<Consultores> listaConsultores = new ArrayList<Consultores>();

	public static void main(String[] args) {
		Programadores prograApoyo = new Programadores("123123123C", "Martin", "Bravo", 3, 1500);

		// dar de alta programadores
		listaConsultores.add(prograApoyo);

		// dar de alta testers
		listaConsultores.add(new Testers("123123123B", "Andres", "Bravo", 3, 2000, prograApoyo));

		// dar de alta
		listaConsultores.add(new JefeProyecto("123123123D", "Jefe", "DelProyecto", 1, 5000, Tareas.DOCUMENTACION));

		// mostrar el consultor que su nombre empiece por M
		System.out.println("Consultor que empieza por M: ");
		for (int i = 0; i < listaConsultores.size(); i++) {
			if (listaConsultores.get(i).getNombre().startsWith("M")) {
				System.out.println(listaConsultores.get(i).toString());

			}
		}

		System.out.println("Modificar el numero de proyectos de un consultor");
		for (int i = 0; i < listaConsultores.size(); i++) {
			if (listaConsultores.get(i).getDni().contains("123123123D")) {
				listaConsultores.get(i).setNumProyetos(4);
				System.out.println(listaConsultores.get(i).toString());

			}
		}
		// mostrar el contenido del ArrayList
		System.out.println("Mostrar el contenido de la lista");
		for (int i = 0; i < listaConsultores.size(); i++) {
			System.out.println(listaConsultores.get(i).toString());
		}
		
		int sumaProyectos = 0;
		int contConsultores = 0;
		for (int i = 0; i < listaConsultores.size(); i++) {
			contConsultores = i + 1;
			sumaProyectos = sumaProyectos + listaConsultores.get(i).getNumProyetos();
		}
		System.out.printf("En este momento hay %d consultores con más de %d proyectos realizados.%n", contConsultores,
				sumaProyectos);

	}// fin main
}// fin-class Consultoria
