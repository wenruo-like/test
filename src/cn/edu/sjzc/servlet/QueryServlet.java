package cn.edu.sjzc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.dao.UserDao;
import cn.edu.sjzc.domain.UserBean;

public class QueryServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		UserDao ud = new UserDao();
		UserBean ub = ud.findUserByName(username);
		
		request.setAttribute("user", ub);
		RequestDispatcher rd = request.getRequestDispatcher("/QueryForm.jsp");
		rd.forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
