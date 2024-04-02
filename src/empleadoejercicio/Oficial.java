package empleadoejercicio;

public class Oficial extends Operario{
	public Oficial() {}
	
	public Oficial(String nombreIngresado){
		super(nombreIngresado);
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}// fin-class Oficial
