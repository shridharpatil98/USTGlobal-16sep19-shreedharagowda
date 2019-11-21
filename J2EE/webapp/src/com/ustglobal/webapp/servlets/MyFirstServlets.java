package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlets extends HttpServlet { 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		System.out.println("service method");
		
		String company=getServletContext().getInitParameter("company_name");
		String batch=getServletConfig().getInitParameter("Batch_Code");
		
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		Date date=new Date();
		out.println("<h1>");
		out.println(company);
		out.println("<br>");
		out.println(batch);
		out.println("<br>");
		out.println("today date is:"+date.toString());
		out.println("</h1>");
		String url=req.getRequestURI();
		String method=req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		out.println("</body>");
		out.println("</html>");
		
	}
}
