package cuentasBancarias;

import java.io.Serializable;

public class Gestor extends Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// [ --> ATRIBUTOS <-- ]
    private int id;
    private String cod_Gestor = "GEST-";
    public double importeMaxOperacion; // una cosa es que pueda ser consultado (getter) y otra que pueda ser visible o no (public o private)
	
    public Gestor(int id, double importeMaxOperacion) {
		super();
		this.id = id;
		setCod_Gestor(cod_Gestor+id);
		this.importeMaxOperacion = importeMaxOperacion;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getImporteMaxOperacion() {
		return importeMaxOperacion;
	}
	public void setImporteMaxOperacion(double importeMaxOperacion) {
		this.importeMaxOperacion = importeMaxOperacion;
	}
	public String getCod_Gestor() {
		return cod_Gestor;
	}
	public void setCod_Gestor(String cod_Gestor) {
		this.cod_Gestor = cod_Gestor;
	}
}// fin-class Gestor
