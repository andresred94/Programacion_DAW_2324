package probandoInterfaces;

import java.util.Scanner;

public class Triangulo implements FiguraInterface {
	private double altura;
	private double base;
	private String color;
	private double perimetroT;
	private double areaT;
	static Scanner lector = new Scanner(System.in);

	public Triangulo (String c, double al , double ba){
		color = c;
		altura = al;
		base = ba;
	}
	
	public String dameColor() {
		return color;
	}
	
	public double perimetro() {
		System.out.println("Suponiendo que el triangulo tiene dos lados iguales...");
		System.out.print("Ingresa la medida de los lados = ");
		double lado = Double.parseDouble(lector.nextLine());
		perimetroT = base + 2 * lado;
		return perimetroT;
	}
	
	public double area() {
		areaT = ( base * altura ) / 2;
		return areaT;
		
	}
	
	public void escalar (double escala) {
		base = base * escala;
		altura = altura * escala;
		System.out.printf("La base y la altura a escala %.2f es:%n" , escala);
	}
	
	public void imprimir() {
		System.out.printf("El area del triangulo es: %.2f%n" , areaT);
		System.out.printf("El color del triangulo es: %s%n" , color);
		System.out.printf("El perimetro del triangulo es: %.2f%n" , perimetroT);
	}
	
}
