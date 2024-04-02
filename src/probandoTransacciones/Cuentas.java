package probandoTransacciones;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.ArrayList;


import conexBdD.ConexBdDMysql;

public class Cuentas {
	// [ --> Atributos <-- ]
	private int id_cuenta;
	private double saldo;
	private static ConexBdDMysql cx;
	
	// [ --> Constructores <-- ]
	public Cuentas(String nomBdD,String usr, String pwd) {
		cx = new ConexBdDMysql(nomBdD,usr,pwd);
	}
	
	// [ --> M. DE LA CLASE <-- ]
	public void setIdCuenta_saldo (int id_cuenta, double saldo) {
		this.id_cuenta = id_cuenta;
		this.saldo = saldo;
	}
	
	public void insertarCuenta(ArrayList columnas, String valores, String tabla) {
		try {
			cx.insertarFila(columnas,valores,tabla);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarSaldos(ArrayList columnas, String tabla) {
		try {
			ResultSet rSet = cx.realizarSelect(columnas,tabla);
			
			while (rSet.next()) {
				int id = rSet.getInt("id");
	            double saldo = rSet.getDouble("saldo");
	            System.out.printf("id_cuenta: %d | saldo: %.2f%n", id , saldo);
	        }

	        // Cerrar el ResultSet después de usarlo
	        if (rSet != null) {
	            rSet.close();
	        }
			
		} catch (SQLException ex) {
			ex.printStackTrace();

		}
	}
	
	public void mostrarSaldoCuenta(ArrayList columnas, String condicion, String tabla) {
		try {
			ResultSet rSet = cx.selectConWhere(columnas,condicion,tabla);
			 // Mover el cursor al primer resultado
	        if (rSet.next()) {
	            // Obtener el valor de la columna "saldo"
	            double saldo = rSet.getDouble("saldo");
	            System.out.println("Saldo es " + saldo);
	        } else {
	            // No se encontraron resultados
	            System.out.println("No se encontraron resultados.");
	        }

	        // Cerrar el ResultSet después de usarlo
	        if (rSet != null) {
	            rSet.close();
	        }
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			

		}
	}
	
	public SQLException actualizarCuenta(String campo, String condicion, String tabla) throws SQLException {
		SQLException ex = null;
		ex = cx.actualizarTabla(campo,condicion,tabla);		
		return ex;
		
	}
	
	
}// fin-class Cuentas
