package mundoAnimal;

public class Perro extends Animal{
	@Override
	public void vacunar() {
		System.out.println("Soy un perro vacunado.");
	}
	
	@Override
	public void comer() {
		System.out.println("Soy un  perro comiendo");
	}
	
	@Override
	public void dormir() {
		System.out.println("Soy un perro durmiendo");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Meeeaw");
	}
	
	@Override
	public boolean hacerCaso() {
		double probabilidad = 0.9;
		double numRandom = Math.random();
		return numRandom < probabilidad;
	}
	
	public void sacarPaseo() {
		System.out.println("Nos vamoooh de passeeooo!! SIIIUUUU");
	}
	
}// fin-class Perro