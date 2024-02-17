package empleadoejercicio;

public class ExeClass {
	public static void main(String[] args) {
		Empleado e1 = new Empleado("Rafa");
		System.out.printf("%s%n" , e1.getNombre());
		System.out.printf("%s%n" , e1.toString());
		
		Directivo d1 = new Directivo("Mario");
		System.out.printf("%s%n" , d1.toString());
		
		Operario op1 = new Operario("Alfonso");
		System.out.printf("%s%n" , op1.toString());
		
		Oficial ofi1 = new Oficial("Luis");
		System.out.printf("%s%n" , ofi1.toString());
		
		Tecnico tec1 = new Tecnico("Pablo");
		System.out.printf("%s%n" , tec1.toString());
		;
	}

}
