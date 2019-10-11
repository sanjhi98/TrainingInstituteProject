package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TrainerRegister
 */
@WebServlet("/trainerregister")
public class TrainerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public TrainerRegister() {
        super();
        // TODO Auto-generated constructor stub
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
		Integer experience = Integer.parseInt(request.getParameter("experience"));
		String specialization = request.getParameter("specialization");
		String aadharId = request.getParameter("aadharcard");
		String contact =request.getParameter("contact");
		response.getWriter().append(name);
		response.getWriter().append(username);
		response.getWriter().append(email);
		response.getWriter().append(experience.toString());
		response.getWriter().append(specialization);
		response.getWriter().append(aadharId);
		response.getWriter().append(contact);
		/* 
		 * 1) check for uniqueness of username and email
		 * 2) if successfullly registered 
		 *      then add to db and forward to trianer dashboard
		 *     else
		 *       redirect to registration page*/
	}

}
