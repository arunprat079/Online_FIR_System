package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManger;
import com.pojo.Registration;


@WebServlet("/ForgetPasswordServlate")
public class ForgetPasswordServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManger bl=new BLManger();
	Registration r=new Registration();
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
          String email=request.getParameter("email");
		
		
		  r=bl.serchbyemailforgetpassword(email);
		
		  HttpSession session=request.getSession();
		  session.setAttribute("list",r);
		
	
	      response.sendRedirect("ForgetPasswordGet.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
