package controller;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Logindao;




//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Logindao ld= new Logindao();
		String userloginid=request.getParameter("userloginid");
		String password=request.getParameter("password");
		if(ld.check(userloginid,password)) {
			PrintWriter out =response.getWriter(); 
		    out.println("welcome");
		    }
		else
			response.sendRedirect("login.jsp");
	}

}
