package probandoInterfaces;

public class ExeProgram {
	public static void main(String[] args) {
		Circulo c1 = new Circulo("Rojo" , 5.5);
		c1.perimetro();
		c1.area();
		c1.escalar(2);
		c1.imprimir();
		
		Triangulo t1 = new Triangulo("Verde" , 1.5 , 5.5);
		t1.perimetro();
		t1.area();
		t1.escalar(5);
		t1.imprimir();
	}
}
