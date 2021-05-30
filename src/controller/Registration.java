package controller;
import java.sql.*;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Registration")
 public class Registration extends HttpServlet  {
	
/*	protected void doget(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException{
		
	}*/
   
 
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException {
	response.setContentType("text/html");   
	
	

    String url="jdbc:mysql://localhost:3306/db2";
    String uname="root";
    String pass="root";

	
		try {
			long partyid=  Long.parseLong(request.getParameter("partyid"));
			String firstname= request.getParameter("firstname");
			
			String lastname= request.getParameter("lastname");
			String address= request.getParameter("address");
			String city= request.getParameter("city");
			int  zip = Integer.parseInt(request.getParameter("zip"));
			String state= request.getParameter("state");
			String country= request.getParameter("country");
			int phone= Integer.parseInt(request.getParameter("phone"));
			String userloginid= request.getParameter("userloginid");
			String password= request.getParameter("password");
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url,uname,pass);
			PrintWriter out =response.getWriter(); 
	
			
		
            
	        
		     PreparedStatement	prs=  conn.prepareStatement("insert into party " + "values(?,?,?,?,?,?,?,?)");
		     prs.setLong(1,partyid);
		     prs.setString(1,firstname);
		     prs.setString(2,lastname);
		     prs.setString(3,address);
		     prs.setString(4,city);
		     prs.setInt(5,zip);
		     prs.setString(6,state);
		     prs.setString(7,country);
		     prs.setInt(8,phone);
		     
		     PreparedStatement	prs2=  conn.prepareStatement("insert into userlogin " + "values(?,?,?)");
		     prs2.setString(1,userloginid);
		     prs2.setString(2,password);
		     prs2.setLong(3,partyid);
		     
		     
		     
		     prs.executeUpdate();
		     prs2.executeUpdate();
		     
		     out.println("Inserted");
	
   
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		}
		 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }}


