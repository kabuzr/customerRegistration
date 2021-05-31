package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Logindao  {
	Connection conn;
	PreparedStatement prs;
	 String url="jdbc:mysql://localhost:3306/db2";
	    String uname="root";
	    String pass="root";
	    
	public boolean check(String id,String pass) {  
		boolean bool= false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn= DriverManager.getConnection(url,uname,pass);
		    
			 prs= conn.prepareStatement("select *from userlogin where userloginid like ? && password like ?");
			prs.setString(1,id);
			prs.setString(2,pass);
			
			ResultSet rs= prs.executeQuery();
		    bool =rs.next();
		    
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		return bool;
	}
	
	
	
	
	

}
