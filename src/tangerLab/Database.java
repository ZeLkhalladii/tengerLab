package tangerLab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	 private static String username = "root";
	 private static String password = "mysql";
	 private static String host = "jdbc:mysql://localhost/GestionPersonnel";

	public static Connection Db() throws SQLException{
		return DriverManager.getConnection(host, username, password);
	
	}

}
