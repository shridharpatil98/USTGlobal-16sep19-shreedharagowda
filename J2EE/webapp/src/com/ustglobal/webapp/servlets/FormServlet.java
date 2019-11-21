package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String company=getServletContext().getInitParameter("company_name");
		String batch=getServletConfig().getInitParameter("Batch_Code");
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String mail=req.getParameter("mail");
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>");
		out.println(company);
		out.println("<br>");
		out.println(batch);
		out.println("<br>");
		out.println("name="+name);
		out.println("<br>");
		out.println(password);
		out.println("<br>");
		out.println(mail);
		out.println("<br>");
		out.println("</h1>");
		
		out.println("</html>");
		out.println("</body>");
		
	}//end of do get
}//end of class
