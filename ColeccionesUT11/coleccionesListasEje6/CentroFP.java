package coleccionesListasEje6;

import java.util.*;

public class CentroFP  {
		private LinkedList <Alumno> listaAlumnos;	
		
		public CentroFP() {
			listaAlumnos  = new LinkedList <Alumno> ();	
		}
		
		public int mostrarCantidadAlumnos()  {
			return listaAlumnos.size();
		}
		
		public void aniadirAlumno(Alumno a) {
			listaAlumnos.addLast(a);
		}
		
		public void  copiarAlumnos(String cursoActual, String cursoSiguiente) {
			Iterator <Alumno> it = listaAlumnos.iterator();
			while (it.hasNext()) {
					Alumno a = it.next();
					if (a.getCursoEscolar() == cursoActual) {
						a.setCursoEscolar(cursoSiguiente);
					}
				
			}
		}
		
		public void eliminarAlumno(String nombre, String apellido) {
			Iterator <Alumno> it = listaAlumnos.iterator();
			boolean encontrado = false;
			while (it.hasNext()) {
					Alumno a = it.next();
					if (a.getNombre() == nombre && a.getApellido() == apellido) {
						listaAlumnos.remove(a);
						encontrado = true;
					}
			}
			
			if (encontrado) {
				System.out.println("Alumno eliminado correctamente.");
			} else {
				System.out.println("No se encuentra al almuno en la BdD.");
			}
		}
		
		public void buscarAlumno(String nombre, String apellido) {
			for (int i = 0; i < listaAlumnos.size(); i++) {
				if (listaAlumnos.get(i).getNombre() == nombre && listaAlumnos.get(i).getApellido() == apellido) {
					System.out.println(listaAlumnos.get(i).toString());
				} else {
					System.out.println("No se encuentra al almuno en la BdD.");
				}
			}
		}
		
		public void mostrarTodosAlumnos() {
			for (int i = 0; i < listaAlumnos.size(); i++) {
				System.out.println(listaAlumnos.get(i).toString());
			}
		}
}
