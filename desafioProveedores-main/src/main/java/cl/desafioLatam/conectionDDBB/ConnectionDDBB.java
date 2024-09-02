package cl.desafioLatam.conectionDDBB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDDBB {

	private static Connection connection= null;
	
	public static Connection getConnection() {
		Connection connectionSql = null;
		String driver= "org.postgresql";
		String BBDDName = "proveedores";
		String url ="jdbc:postgresql://localhost:5432/proveedores_desafio_evaluado";
		String user = "postgres";
		String password = "root";

		try {
			  Class.forName("org.postgresql.Driver");
			connectionSql = DriverManager.getConnection(url, user, password);
			if(connectionSql != null) {
				System.out.println("Conexion Exitosa a la base de datos.");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			
			System.out.println("No se ha podido establecer conexion con la Base De datos.");
			System.out.println("Error "+e.getMessage());
		}
		
		
		
		
		return connectionSql;
	}
	
	
	
}
