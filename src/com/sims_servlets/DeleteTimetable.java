package com.sims_servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sims_service.TimetableDao;

/**
 * Servlet implementation class DeleteTimetable
 */
@WebServlet("/DeleteTimetable")
public class DeleteTimetable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		TimetableDao.deleteTimetable(id);
		response.sendRedirect("teacher-timetable.jsp");
	}

}
