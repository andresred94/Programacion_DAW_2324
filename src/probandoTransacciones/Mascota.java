package probandoTransacciones;

import java.sql.SQLException;

import com.mysql.cj.jdbc.NClob;

import conexBdD.ConexBdDMysql;

public class Mascota {
	// [ --> Atributos <-- ]
	private int id_mascota;
	private String nombre;
	private int edad;
	private static ConexBdDMysql cx;

	// [ --> Constructores <-- ]
	public Mascota(String nomBdD, String usr, String pwd) {
		cx = new ConexBdDMysql(nomBdD,usr,pwd);
	}
	
	// [ --> M. DE LA CLASE <-- ]
	public void insertarMascota(String consulta) {
//		try {
//			cx.insertarFila(consulta);
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
	}
	
	public void cerrarTransaccion() {
		cx.cerrarConexion();
	}
}// fin-class Mascota
