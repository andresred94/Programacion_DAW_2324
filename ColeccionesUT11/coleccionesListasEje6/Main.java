package coleccionesListasEje6;

public class Main {
	public static void main(String[] args) {
		CentroFP c1 = new CentroFP();
		c1.aniadirAlumno( new Alumno("Elton","Tito","01/01/2000","eltontito@email.com","primero") );
		c1.aniadirAlumno( new Alumno("Tomas","Turbado","01/01/2000","tomas@email.com","primero") );
		c1.aniadirAlumno( new Alumno("Kevin","Wllis","01/01/2000","kevin@email.com","primero") );
		c1.aniadirAlumno( new Alumno("Alex","Cremento","01/01/2000","alex@email.com","segundo") );
		c1.aniadirAlumno( new Alumno("Tolna","Botieso","01/01/2000","tolna@email.com","tercero") );
		c1.aniadirAlumno( new Alumno("Maria","Unpajote","01/01/2000","maria@email.com","segundo") );

		System.out.printf("Cantidad de alumnos en la escuela = %d%n",c1.mostrarCantidadAlumnos());
		Alumno a1 = new Alumno("Elber","Galarga","01/01/2000","elber@email.com","segundo");
		c1.aniadirAlumno(a1);
		System.out.printf("Añadiendo al alumno/a %s%n" , a1.toString() );
		System.out.println("Mostrando lista actualizada:");
		c1.mostrarTodosAlumnos();
		System.out.println("Copiando los alumnos de primero por los de segundo...");
		c1.copiarAlumnos("primero","segundo");
		c1.mostrarTodosAlumnos();
		System.out.printf("Eliminando a %s%n", a1.getNombre());
		c1.eliminarAlumno(a1.getNombre(),a1.getApellido());
		c1.mostrarTodosAlumnos();
		
	}
}
