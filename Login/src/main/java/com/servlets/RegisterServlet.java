package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = req.getParameter("userName");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//out.print(str);
		out.print("<center><h1>Registration Successfull<h1><center>");
		out.print("<center><p> Welcome "+str+" </p></center>");
	}

}
