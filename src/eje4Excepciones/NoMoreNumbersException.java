package eje4Excepciones;

public class NoMoreNumbersException extends Exception{
	public NoMoreNumbersException (String msg) {
		super("Se ha alcanzado el número máximo de personas.");
	}
}
