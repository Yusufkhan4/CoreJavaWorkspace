package accountPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	
	public static Connection connect() throws SQLException, ClassNotFoundException {
		// we write a logic to connect to mysql database
		
		
		
		Connection connection=null;
		
		try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver Found");
			String url="jdbc:mysql://localhost:3306/jdbc_yusuf";
			String username="root";
			String password="rooot";
			
			connection=DriverManager.getConnection(url,username,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println(connection.getClass());
//		System.out.println("Connection Established!!");
		return connection;
	}
}
