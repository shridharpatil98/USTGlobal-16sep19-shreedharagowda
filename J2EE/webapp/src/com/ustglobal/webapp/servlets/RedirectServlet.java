package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.sendRedirect("https://www.google.com");
		String engine=req.getParameter("engine");

		String search=req.getParameter("search");
		if(engine.equalsIgnoreCase("google")) {
			resp.sendRedirect("https://www.google.com/search?q="+search);
		}else if(engine.equalsIgnoreCase("yahoo")) {
			resp.sendRedirect("https://www.yahoo.com/search?q="+search);
		}else if(engine.equalsIgnoreCase("bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+search);
		}

	}
}
