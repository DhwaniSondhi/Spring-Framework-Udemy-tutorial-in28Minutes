package org.prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException{
		PrintWriter writer=rep.getWriter();
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,rep);
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse rep) throws ServletException, IOException{
		PrintWriter writer=rep.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String newAdd="/WEB-INF/views/"+(UserValidation.isUserValid(name, password)?"welcome.jsp":"login.jsp");
		req.setAttribute("name",name);
		req.setAttribute("errorMsg", "Wrong name or password");
		req.getRequestDispatcher(newAdd).forward(req,rep);
	}
}
