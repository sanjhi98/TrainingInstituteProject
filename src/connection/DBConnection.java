package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
private static Connection connection = null;
	
	private DBConnection(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb","root","admin");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConn() {
		try {
			if(connection==null || connection.isClosed())
				new DBConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(connection);
		return connection;
	}
	public static void main(String args[])
	{
		System.out.println(getConn());
	}

}
