package com.lodoctor;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class LoginAction extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName=request.getParameter("name");
        String password=request.getParameter("password");
        if(userName.equals("Evans") && password.equals("lodoctor"))
        {
        response.sendRedirect("welcomePage.jsp");
        }
        else
        {
        	response.sendRedirect("loginHtmlPage.html");
        }
		
	}

}
