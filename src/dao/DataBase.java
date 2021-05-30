/*package dao;
import java.sql.*;

public class DataBase {


	public static void main(String args[]) throws Exception
	{
              String url="jdbc:mysql://localhost:3306/db2";
              String uname="root";
              String pass="root";
	
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,uname,pass);
		String sql ="insert into party " + "values(6,'a','e','l','s','3','m','i',45)";
            
        
		Statement st= (Statement) conn.createStatement();
	   st.executeUpdate(sql);
	   
	  
	

}}  */