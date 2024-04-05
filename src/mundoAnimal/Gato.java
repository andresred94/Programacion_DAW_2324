package mundoAnimal;

public class Gato extends Animales{
	
	@Override
	public void vacunar() {
		System.out.println("Soy un gato vacunado.");
	}
	
	@Override
	public void comer() {
		System.out.println("Soy un gato comiendo");
	}
	
	@Override
	public void dormir() {
		System.out.println("Soy un gato durmiendo");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Woff!");
	}
	
	@Override
	public boolean hacerCaso() {
		double probabilidad = 0.05;
		double numRandom = Math.random();
		return numRandom < probabilidad;
	}
	
	public void toserBolaPelo() {
		System.out.println("COF! ¡BUAAGH! (El gato vomita una bola de pelo...)");
	}
	
}// fin-class Gato