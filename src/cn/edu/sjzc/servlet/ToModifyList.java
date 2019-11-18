package cn.edu.sjzc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.dao.UserDao;
import cn.edu.sjzc.domain.UserBean;

public class ToModifyList extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDao ud = new UserDao();
		List<UserBean> users = ud.findAllUser();
		request.setAttribute("users", users);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ModifyList.jsp");
		rd.forward(request, response);
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
