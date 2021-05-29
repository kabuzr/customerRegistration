package dao;
import java.sql.*;

public class DataBase {
	public static void main(String args[]) throws Exception
	{
              String url="jdbc:mysql://localhost:3306//db2";
              String uname="root";
              String pass="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection(url,uname,pass)) {
		}
		
	  
	  
	}
}
