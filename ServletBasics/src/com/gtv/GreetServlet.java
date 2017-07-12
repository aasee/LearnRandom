package com.gtv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GreetServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if (request.getParameter("firstName") != null && request.getParameter("lastName") != null) {
			out.println("Hello " + request.getParameter("firstName") + request.getParameter("lastName"));
			out.println("You are awesome!");
		} else {
			out.println("Your input sucks!");
		}

	}

}
