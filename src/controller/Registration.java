package controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Registration")
public class Registration extends HttpServlet {
   
   protected void doPost(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException {
	response.setContentType("text/html");   
	PrintWriter out =response.getWriter(); 
	String firstname= request.getParameter("firstname");
	String lastname= request.getParameter("lastname");
	String address= request.getParameter("address");
	String city= request.getParameter("city");
	String zip = request.getParameter("zip");
	String state= request.getParameter("state");
	String country= request.getParameter("country");
	String phone= request.getParameter("phone");
	
   }
   }


