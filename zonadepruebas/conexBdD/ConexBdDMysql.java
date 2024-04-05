package conexBdD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConexBdDMysql {

	// [ --> ATRIBUTOS <-- ]
	// JDBC URL, username y password de la base de datos
	private static String bdD = "";
	private static String URL = "jdbc:mysql://192.168.56.101:3306/nomBdD?serverTimezone=UTC";
	private static String USERNAME = "";
	private static String PASSWORD = "";
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static Connection cx = null;
	private String queryInsert = "INSERT INTO nombTabla X1";
	private String querySelect = "SELECT X FROM nomTabla";
	private String queryWhere = "SELECT X FROM nomTabla WHERE C";

	public String getQueryInsert() {
		return queryInsert;
	}

	// [ --> M. CONSTRUCTORES <-- ]
	public ConexBdDMysql() {
	}

	public ConexBdDMysql(String nombreBase, String usr, String pwd) {
		conectar(nombreBase, usr, pwd);
	}

	// [ --> M. DE LA CLASE <-- ]
	public void conectar(String nombreBase, String usr, String pwd) {
		try {
			bdD = nombreBase;
			USERNAME = usr;
			PASSWORD = pwd;
			URL = establecerNombreBdD(nombreBase);
			Class.forName(DRIVER);
			cx = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("¡Conexión exitosa a la base de datos!");
			// return cx;

		} catch (ClassNotFoundException | SQLException ex) {
			System.out.printf("No se pudo conectar a la BdD. %s%n", nombreBase);
			ex.printStackTrace();
			// return cx;

		} finally {
			System.out.println("Continua la transacción...");
		}
	}// fin conectar

	public void cerrarConexion() {
		try {
			cx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertarFila(ArrayList nomColum, String campos, String nombTabla) throws SQLException {
		try {
			cx.setAutoCommit(false);
			java.sql.Statement stmt = cx.createStatement();
			queryInsert = queryInsert.replaceAll("nombTabla", nombTabla);

			for (int i = 0; i < nomColum.size(); i++) {
				if (i == 0) {
					queryInsert = queryInsert.replaceAll("X1", ("( " + nomColum.get(0).toString()) + " , ");

				} else {
					queryInsert = queryInsert.replaceAll(" ,", (", " + nomColum.get(i).toString()) + " ,");
				}

				if (i == (nomColum.size() - 1)) {
					queryInsert = queryInsert.replaceAll(" ,", ") X2");
				}
			}
			queryInsert = queryInsert.replaceAll(" X2", campos);
			stmt.executeUpdate(queryInsert);
			cx.commit();

		} catch (SQLException sqlEx) {
			cx.rollback();
			// cerrarConexion();
			sqlEx.printStackTrace();
		}
	}

	public SQLException actualizarTabla(String campo, String condicion, String nombTabla) throws SQLException  {
		java.sql.Statement stmt = cx.createStatement();
	    String queryUpdate = "UPDATE " + nombTabla + " SET " + campo + " WHERE " + condicion;
		SQLException sqlCode = null;
		try {
			// Ejecutar la consulta de actualización
			int filasActualizadas = stmt.executeUpdate(queryUpdate);

			// Verificar si se realizaron actualizaciones
			if (filasActualizadas > 0) {
				System.out.printf("Se ha actualizado %d fila/s correctamente.%n", filasActualizadas);
			} else {
				throw new SQLException(); 
			}

		} catch ( SQLException sqlWar ) {
			sqlCode = sqlWar;
		}
		return sqlCode;

	}

	
	public ResultSet selectConWhere(ArrayList<String> nomColum, String condicion, String nombTabla) throws SQLException {
		ResultSet rSet = null;

		try {
			java.sql.Statement stmt = cx.createStatement();
			queryWhere = queryWhere.replaceAll("WHERE C", condicion);
			queryWhere = queryWhere.replaceAll("nomTabla", nombTabla);

			// reemplaza las columnas que quiere mostrar
			for (int i = 0; i < nomColum.size(); i++) {
				if (i == 0) {
					queryWhere = queryWhere.replaceAll(" X ", (" " + nomColum.get(0).toString()) + " , ");

				} else {
					queryWhere = queryWhere.replaceAll(" ,", (", " + nomColum.get(i).toString()) + " ,");
				}

				if (i == (nomColum.size() - 1)) {
					queryWhere = queryWhere.replaceAll(" , F", " F");
				}
			}

			rSet = stmt.executeQuery(queryWhere);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rSet;

	}

	public ResultSet realizarSelect(ArrayList nomColum, String nombTabla) throws SQLException {
		ResultSet rSet = null;
		try {
			java.sql.Statement stmt = cx.createStatement();
			querySelect = querySelect.replaceAll("nomTabla", nombTabla);
			System.out.printf("Mostrando columnas: %n");
			for (int i = 0; i < nomColum.size(); i++) {
				System.out.printf("%s |", nomColum.get(i).toString());
			}
			System.out.println();
			for (int i = 0; i < nomColum.size(); i++) {
				if (i == 0) {
					querySelect = querySelect.replaceAll(" X ", (" " + nomColum.get(0).toString()) + " , ");

				} else {
					querySelect = querySelect.replaceAll(" ,", (", " + nomColum.get(i).toString()) + " ,");
				}

				if (i == (nomColum.size() - 1)) {
					querySelect = querySelect.replaceAll(" , F", " F");
				}
			}
			rSet = stmt.executeQuery(querySelect);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rSet;
	}

	public String establecerNombreBdD(String nombreBdD) {
		return URL.replaceAll("nomBdD", nombreBdD);
	}// fin establecerNombreBdD

}
