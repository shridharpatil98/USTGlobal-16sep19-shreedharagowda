package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
		String remember=req.getParameter("remember");
		if(remember == null) {
			Cookie[] cookie=req.getCookies();
			if(cookie!=null) {
				for (Cookie cookie2 : cookie) {
					if(cookie2.getName().equals("alwaysremember")) {
						cookie2.setMaxAge(0);
						resp.addCookie(cookie2);
					}
				}
			}
		}else {
			Cookie cookie=new Cookie("alwaysremember", id+"");
			resp.addCookie(cookie);
		}
		EmployeeInfo info=dao.auth(id, password);

		if(info==null) {
			out.println("<html>");
			out.println("<h4 style='color:red'>Invalid id or password</h4>");
			RequestDispatcher dispatch=req.getRequestDispatcher("/login.jsp");
			dispatch.include(req, resp);
			out.println("</html>");
		}else {
			HttpSession session=req.getSession(true);
			session.setAttribute("info", info);
			RequestDispatcher dispatch=req.getRequestDispatcher("/home");
			dispatch.forward(req, resp);
		}	
	}
}
