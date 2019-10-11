package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/studentregister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public StudentRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String fathersName = request.getParameter("fathersName");
		String aadharId = request.getParameter("aadharcard");
		String contact =request.getParameter("contact");
		response.getWriter().append(name);
		response.getWriter().append(username);
		response.getWriter().append(email);
		response.getWriter().append(age.toString());
		response.getWriter().append(fathersName);
		response.getWriter().append(aadharId);
		response.getWriter().append(contact);
		
		/* 
		 * 0)check for uniqueness for username and email
		 * 1) save student to database
		 * 2) if successfully added forward to batch page
		 * 3) if failed redirect to register page*/
		
		RequestDispatcher rd = request.getRequestDispatcher("course.jsp");
		rd.forward(request, response);
	}

}
