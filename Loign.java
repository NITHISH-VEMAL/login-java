package com.audit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Loign")
public class Loign extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		LoginDao dao=new LoginDao();
		
		
		//dao layer must
		if(dao.check(uname, pass))
		//if(uname.equals("nithish") && pass.equals("sid"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",uname);
			response.sendRedirect("welcome.jsp");
			
		}
		else
		{
			response.sendRedirect("exit.jsp");
		}
		
	}

	

}