package probandoAbstractas;
enum Color{ROJO,AMARILLON,AZUL}
public abstract class Forma {
	private int xpos, ypos;
	private Color color;
	public abstract void dibujar();
	public void setColor(Color c) {/*...*/};
	
}
