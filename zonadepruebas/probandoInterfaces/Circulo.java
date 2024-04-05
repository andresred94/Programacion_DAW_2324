package probandoInterfaces;


public class Circulo implements FiguraInterface{
	private double radio;
	private String color;
	private double perimetroC;
	private double areaC;
	
	public Circulo(String c, double r){
		color = c;
		radio = r;
	}
	public double area() {
		areaC = Math.PI * radio * radio;
		return areaC;
	}
	
	public String dameColor() {
		return color;
	}
	
	public void imprimir () {
		System.out.printf("El área del circulo es: %.2f%n" , radio);
		System.out.printf("El color es: %s%n" , color);
		System.out.printf("El perimetro es: %.2f%n" , perimetroC);
	}
	
	public double perimetro() {
		perimetroC = 2 * Math.PI * radio; 
		return perimetroC; 
	}
	
	public void escalar(double escala) {
		radio = radio * escala;
		System.out.printf("El radio del circulo a escala %.1f es: %.2f %n" , escala , radio);
	}
	
	
	
	
	
}
