package cuentasBancarias;

import java.io.Serializable;
import java.util.TreeMap;

public class CuentasCorrientes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// [ --> ATRIBUTOS <-- ]
	private int numCuenta;
	private String cod_Cuenta = "AAA-000";
    private String cod_gestor;
    private double saldo;
    private int contObjPersona = 1;
    private int contObjGestor = 2;
    private String entidadBancaria;
    private Gestor GESTOR;
    private Persona PERSONA;
    TreeMap<Integer, Persona> datosPersonas = new TreeMap<Integer, Persona>();
    
    // [ --> CONSTRUCTORES <-- ]
    public CuentasCorrientes() {}

	public CuentasCorrientes(int numCuenta, double saldo, String entidadBancaria, Persona pERSONA) {
		super();
		this.numCuenta = numCuenta;
		setCod_Cuenta(cod_Cuenta+numCuenta);
		this.saldo = saldo;
		this.entidadBancaria = entidadBancaria;
		PERSONA = pERSONA;
		if (contObjPersona < 4) {
			datosPersonas.put(contObjPersona,pERSONA);
			contObjPersona++;			
		} else {
			System.out.println("no pueden añadirse más personas a la cuenta.");
		}

	}

	public CuentasCorrientes(int numCuenta, String cod_gestor, String entidadBancaria, Gestor gESTOR) {
		super();
		this.numCuenta = numCuenta;
		setCod_gestor(cod_gestor);
		this.entidadBancaria = entidadBancaria;
		GESTOR = gESTOR;
		contObjGestor++;
	}
	// [ --> CONSTRUCTORES <-- ]

	public String getCod_Cuenta() {
		return cod_Cuenta;
	}

	public void setCod_Cuenta(String cod_Cuenta) {
		this.cod_Cuenta = cod_Cuenta;
	}

	public String getCod_gestor() {
		return cod_gestor;
	}

	public void setCod_gestor(String cod_gestor) {
		this.cod_gestor = cod_gestor;
	}

	public int getContObjPersona() {
		return contObjPersona;
	}

	public void setContObjPersona(int contObjPersona) {
		this.contObjPersona = contObjPersona;
	}

	public int getContObjGestor() {
		return contObjGestor;
	}

	public void setContObjGestor(int contObjGestor) {
		this.contObjGestor = contObjGestor;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getEntidadBancaria() {
		return entidadBancaria;
	}

	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}

	public Gestor getGestCuenta() {
		return GESTOR;
	}

	public void setGestCuenta(Gestor gESTOR) {
		GESTOR = gESTOR;
	}

	public Persona getPerCuenta() {
		return PERSONA;
	}

	public void setPerCuenta(Persona pERSONA) {
		PERSONA = pERSONA;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%.2f;",getCod_Cuenta(),getPerCuenta().getDNI(),getPerCuenta().getnombPersona(),getPerCuenta().getape1Per(),getPerCuenta().getape2Per(),getEntidadBancaria(),getSaldo());
	}
	
	
	
}// fin class-CuentasCorrientes
