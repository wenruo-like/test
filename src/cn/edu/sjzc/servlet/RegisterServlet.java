package cn.edu.sjzc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.dao.RegisterDao;
import cn.edu.sjzc.domain.RegisterFormBean;
import cn.edu.sjzc.domain.UserBean;

public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置响应
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//获取表单参数封装到FormBean中
		RegisterFormBean formBean = new RegisterFormBean();
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		
		formBean.setUsername(username);
		formBean.setPassword1(password1);
		formBean.setPassword2(password2);
		formBean.setEmail(email);
		
		// 表单不正确
		if (!formBean.validate()){
			
			Map<String, String> errors = formBean.getErrorsMap();
			request.setAttribute("errors", errors);
			request.setAttribute("formBean", formBean);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
			return;
			
		}
		// 表单正确
		
		//封装到UserBean中
		UserBean user = new UserBean();
		user.setUsername(username);
		user.setPassword(password1);
		user.setEmail(email);
		
		// 将UserBean添加到数据库
		RegisterDao dao = new RegisterDao();
		boolean flag = dao.insertUser(user);
		System.out.println(flag);
		if (flag){
			request.setAttribute("userex", "用户名已经存在");
			request.setAttribute("formBean", formBean);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
			return;
		}
		System.out.println("成功");
		System.out.println(user.getUsername());
		// 成功
		request.setAttribute("userBean", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
		
		
		dispatcher.forward(request, response);
		return;
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}


}
