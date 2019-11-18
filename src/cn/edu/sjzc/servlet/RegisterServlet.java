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
		// ������Ӧ
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//��ȡ��������װ��FormBean��
		RegisterFormBean formBean = new RegisterFormBean();
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		
		formBean.setUsername(username);
		formBean.setPassword1(password1);
		formBean.setPassword2(password2);
		formBean.setEmail(email);
		
		// ������ȷ
		if (!formBean.validate()){
			
			Map<String, String> errors = formBean.getErrorsMap();
			request.setAttribute("errors", errors);
			request.setAttribute("formBean", formBean);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
			return;
			
		}
		// ����ȷ
		
		//��װ��UserBean��
		UserBean user = new UserBean();
		user.setUsername(username);
		user.setPassword(password1);
		user.setEmail(email);
		
		// ��UserBean��ӵ����ݿ�
		RegisterDao dao = new RegisterDao();
		boolean flag = dao.insertUser(user);
		System.out.println(flag);
		if (flag){
			request.setAttribute("userex", "�û����Ѿ�����");
			request.setAttribute("formBean", formBean);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
			return;
		}
		System.out.println("�ɹ�");
		System.out.println(user.getUsername());
		// �ɹ�
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
