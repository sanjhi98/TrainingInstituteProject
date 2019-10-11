package com.vir.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vir.dao.EnrollmentServiceImpl;
import com.vir.model.Batch;
import com.vir.model.Enrollment;

/**
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/Enroll")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EnrollmentServiceImpl es=new EnrollmentServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(true);
		Batch b=(Batch)session.getAttribute("batch");
		int bid=b.getBatchID();
		System.out.println(bid);
		int sid=1;
		if(es.addEnrollment(bid,sid)==true)
		{
			request.setAttribute("message", "Enrollment Successful");
			session.setAttribute("message", "Enrollment Successful");
			request.getRequestDispatcher("enrollsuccess.jsp").forward(request, response);
			
			 System.out.println("naa");
		}
			
		else
		{
			request.getRequestDispatcher("batch.jsp").forward(request, response);
			request.setAttribute("message", "Enrollment Unsuccessful...Try Again Later");
		}

}
}
