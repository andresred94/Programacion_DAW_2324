package probandoListasLinkeadas;

public class Main {
	public static void main(String[] args){
		Pila<String> mipila = new Pila<String>();
		
		System.out.printf("Esto es una pila usando LinkedList.%n");
		
		//agregamos elementos a la pila
		for(int i=1; i<6; i++){
			 mipila.apilar("Elemento Numero "+i);
			 }
		
		System.out.println("El tamaño de la pila es :"+mipila.tamaño());	 
		System.out.println("la cima es: "+mipila.cima());
		System.out.println("borrando : " +mipila.desapilar());
		System.out.println("borrando : " +mipila.desapilar());
		System.out.println("borrando : " +mipila.desapilar());
		System.out.println("ahora la cima es :"+mipila.cima());
		System.out.println("El tamaño de la pila es "+mipila.tamaño());
		
		System.out.println();
		System.out.printf("Esto es una cola usando LinkedList.%n");
		Cola<String> micola = new Cola<String>();
		
		//agregamos elementos a la pila
		for(int i=1; i<6; i++){
			micola.encolar("Elemento Numero "+i);
			 }
		
		System.out.println("El tamaño de la cola es :"+micola.tamaño());	 
		System.out.println("el frente es: "+micola.frente());
		System.out.println("borrando : " +micola.desencolar());
		System.out.println("borrando : " +micola.desencolar());
		System.out.println("borrando : " +micola.desencolar());
		System.out.println("ahora el frente es :"+micola.frente());
		System.out.println("El tamaño de la pila es :"+micola.tamaño());
		
	}
}
