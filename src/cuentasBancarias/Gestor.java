package cuentasBancarias;

public class Gestor {
	// ATRIBUTOS
    private static int id = 0;
    private String cod_Gestor = "";
    private String nombre = ""; // aunque sea private, se puede consultar de forma pública gracias al getter
    private static String telefono = "" ; // aunque sea private, se puede consultar de forma pública gracias al getter
    public static double importeMaxOperacion; // una cosa es que pueda ser consultado (getter) y otra que pueda ser visible o no (public o private)

}
