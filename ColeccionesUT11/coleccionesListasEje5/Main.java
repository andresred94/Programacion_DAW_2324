package coleccionesListasEje5;

public class Main {
	public static void main(String[] args) {
		ListaTareas<Tarea> t1 = new ListaTareas();
		
		System.out.println("Añadiendo tareas");
		t1.apilar(new Tarea("Tarea 1"));
		t1.apilar(new Tarea("Tarea 2"));
		t1.apilar(new Tarea("Tarea 3"));
		
		System.out.println("Tamaño de la lista:");
		System.out.println(t1.tamaño());
				
		System.out.print("Tarea que está en la cima = ");
		System.out.println(t1.cima().toString());
		
		System.out.println("Desapilando la última tarea:");
		t1.desapilar();
		System.out.println("Tamaño de la lista:");
		System.out.println(t1.tamaño());
		
	}
}
